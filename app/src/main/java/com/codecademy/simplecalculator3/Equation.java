
package com.codecademy.simplecalculator3;

import com.codecademy.simplecalculator3.R;

import java.math.MathContext;
import java.math.BigDecimal;
import java.util.ArrayList;

import android.util.Log;

import static java.math.RoundingMode.HALF_UP;
public class Equation {
    Integer bigDecimalPrecision = 12;
    MathContext bigDecimalPrecisionMC = new MathContext(bigDecimalPrecision, HALF_UP);
    String TAG = "MainActivityTag";
    String stackNames[];
    String equationNames[];
    ArrayList<Object> stackValues = new ArrayList<>();
    ArrayList<Object> equationValues = new ArrayList<>();
    public Equation() {
    }
    public void initEquation(String[] stackNamesParam, String[] equationNamesParam, ArrayList<Object> stackValuesParam, ArrayList<Object> equationValuesParam) {
        stackNames = stackNamesParam;
        stackValues = stackValuesParam;
        equationNames = equationNamesParam;
        equationValues = equationValuesParam;
    }
    public String parseEquation(String equation, Integer level) {
        // remove spaces
        // substitute equation values
        // substitute stack values
        Integer replaceIndex = 0;
        if (level == 0) {
            equation = equation.replaceAll(" ", "");
            replaceIndex = 0;
            Log.d(TAG, "originial equation : " + equation);
            for (String equationName : equationNames) {
                if (equationValues.get(replaceIndex).toString().compareTo("______________________________") != 0)
                {
                    equation = equation.replaceAll(equationName, equationValues.get(replaceIndex).toString());
                }
                replaceIndex++;
            }
            Log.d(TAG, "rebuild equation : " + equation);
            replaceIndex = 0;
            Log.d(TAG, "original equation : " + equation);
            for (String stackName : stackNames) {
                if (stackValues.get(replaceIndex) instanceof BigDecimal) {
                    equation = equation.replaceAll(stackName, stackValues.get(replaceIndex).toString());
                }
                replaceIndex++;
            }
            Log.d(TAG, "rebuild equation : " + equation);
        }
        // index of operators : operation code
        // x+y  : 1 : add
        // x-y  : 2 : subtract
        // x*y  : 3 : multiply
        // x/y  : 4 : x/y
        // x^y  : 5 : x power y
        // x_y  : 6 : y root of x : x power (1/y)
        // lx   : 7 : natural log x : no () needed
        // Lx   : 8 : log x base 10 : no () needed
        // processing is right to left to match order or precedence
        Integer indexAdd = equation.lastIndexOf('+');
        Integer indexSub = equation.lastIndexOf('-');
        Integer indexMul = equation.lastIndexOf('*');
        Integer indexDiv = equation.lastIndexOf('/');
        Integer indexPwr = equation.lastIndexOf('^');
        Integer indexRte = equation.lastIndexOf('_');
        Integer indexLNE = equation.lastIndexOf('l');
        Integer indexLOG = equation.lastIndexOf('L');
        Integer indexL = equation.indexOf('(');
        Integer indexR = equation.indexOf(')');
        Integer indexEnd = equation.length();
        Integer indexAddSub = Math.max(indexAdd, indexSub);
        Integer indexMulDiv = Math.max(indexMul, indexDiv);
        Integer indexPwrRte = Math.max(indexPwr, indexRte);
        Integer indexLNELOG = Math.max(indexLNE, indexLOG);
        Integer index = -1;
        Integer operation = -1;
        BigDecimal operandL = new BigDecimal(0.0);
        BigDecimal operandM = new BigDecimal(0.0);
        BigDecimal operandR = new BigDecimal(0.0);
        String stringA = "";
        String stringB = "";
        String equationL = "";
        String equationM = "";
        String equationR = "";
        String output = equation;
        // if equation contains ( ), left most ) most be inner most
        // split string into 3 parts : left string ( middle string ) right string
        // process middle string and reassembly for further processing
        if (indexR != -1) {
            equationL = equation.substring(0, indexR);
            equationR = equation.substring(indexR + 1, indexEnd);
            // match ( to )
            // right most ( in equationL must be matching
            indexL = equationL.lastIndexOf('(');
            equationM = equation.substring(indexL + 1, indexR);
            Log.d(TAG,level + " : equation middle : " + equationM);
            equationL = equation.substring(0, indexL);
            operandM = new BigDecimal(parseEquation(equationM, level + 1));
            equation = equationL + operandM + equationR;
            equation = equation.replace("+-", "-");
            Log.d(TAG, level + " : equation rebuild : " + equation);
            output = parseEquation(equation, level);
        } else if (indexAddSub != -1 || indexMulDiv != -1 || indexPwrRte != -1) {
            // processing is right to left to match order or precedence, lowest order first
            if (indexAdd != -1 && indexAdd == indexAddSub) {
                index = indexAdd;
                operation = 1;
            } else if (indexSub != -1 && indexSub == indexAddSub) {
                index = indexSub;
                operation = 2;
            } else if (indexMul != -1 && indexMul == indexMulDiv) {
                index = indexMul;
                operation = 3;
            } else if (indexDiv != -1 && indexDiv == indexMulDiv) {
                index = indexDiv;
                operation = 4;
            } else if (indexPwr != -1 && indexPwr == indexPwrRte) {
                index = indexPwr;
                operation = 5;
            } else if (indexRte != -1 && indexRte == indexPwrRte) {
                index = indexRte;
                operation = 6;
            } else {
                index = -1;
                operation = -1;
            }
            equationL = equation.substring(0, index);
            equationR = equation.substring(index + 1, indexEnd);
            // if left is empty string than nothing needs done, this will occur when unneccessary () are used, return original equation
            if (equationL.isEmpty()) {
                return equation;
            }
            switch (operation) {
                // add sub mul div
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    operandL = new BigDecimal(parseEquation(equationL, level + 1));
                    operandR = new BigDecimal(parseEquation(equationR, level + 1));
                    break;
                default:
                    break;
            }
            switch (operation) {
                // add
                case 1:
                    output = operandL.add(operandR).stripTrailingZeros().toString();
                    Log.d(TAG,level + " : " + equationL + " ADD " + equationR + " = " + output);
                    return output;
                // sub
                case 2:
                    output = operandL.subtract(operandR).stripTrailingZeros().toString();
                    Log.d(TAG,level + " : " + equationL + " SUB " + equationR + " = " + output);
                    return output;
                // mul
                case 3:
                    output = operandL.multiply(operandR).stripTrailingZeros().toString();
                    Log.d(TAG,level + " : " + equationL + " MUL " + equationR + " = " + output);
                    return output;
                // div
                case 4:
                    output = operandL.divide(operandR, bigDecimalPrecision, HALF_UP).stripTrailingZeros().toString();
                    Log.d(TAG,level + " : " + equationL + " DIV " + equationR + " = " + output);
                    return output;
                // pwr
                case 5:
                    output = new BigDecimal(Math.pow(operandL.doubleValue(), operandR.doubleValue())).stripTrailingZeros().toString();
                    Log.d(TAG,level + " : " + equationL + " PWR " + equationR + " = " + output);
                    return output;
                // rte
                case 6:
                    output = new BigDecimal(Math.pow(operandL.doubleValue(), 1.0 / operandR.doubleValue())).stripTrailingZeros().toString();
                    Log.d(TAG,level + " : " + equationL + " RTE " + equationR + " = " + output);
                    return output;
                default:
                    break;
            }
        } else if (indexLNELOG != -1) {
            if (indexLNE != -1 && indexLNE == indexLNELOG) {
                index = indexLNE;
                operation = 7;
            } else if (indexLOG != -1 && indexLOG == indexLNELOG) {
                index = indexLOG;
                operation = 8;
            }
            // single operand operations : only right side used
            equationR = equation.substring(index + 1, indexEnd);
            switch (operation) {
                // lne log
                case 7:
                case 8:
                    operandR = new BigDecimal(parseEquation(equationR, level + 1));
                    break;
                default:
                    break;
            }
            switch (operation) {
                // lne
                case 7:
                    output = Double.toString(Math.log(operandR.doubleValue()));
                    Log.d(TAG,level + " : LNE " + equationR + " = " + output);
                    return output;
                // log
                case 8:
                    output = Double.toString(Math.log10(operandR.doubleValue()));
                    Log.d(TAG,level + " : LOG " + equationR + " = " + output);
                    return output;
                default:
                    break;
            }
        } else {
            // Log.d(TAG,level + " : " + equation + " : no operation : all index -1 : " + output + " : " );
            return output;
        }
        return output;

    }

}
