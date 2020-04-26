/*
 * Copyright (c) [2020] Huawei Technologies Co.,Ltd.All rights reserved.
 *
 * OpenArkCompiler is licensed under the Mulan PSL v1.
 * You can use this software according to the terms and conditions of the Mulan PSL v1.
 * You may obtain a copy of Mulan PSL v1 at:
 *
 *     http://license.coscl.org.cn/MulanPSL
 *
 * THIS SOFTWARE IS PROVIDED ON AN "AS IS" BASIS, WITHOUT WARRANTIES OF ANY KIND, EITHER
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO NON-INFRINGEMENT, MERCHANTABILITY OR
 * FIT FOR A PARTICULAR PURPOSE.
 * See the Mulan PSL v1 for more details.
 * -@TestCaseID: StringBufferInsertTest.java
 * -@TestCaseName: Test Method insert(Various parameters) of StringBuffer include insert(int offset, boolean b)/
 * -@TestCaseType: Function Test
 * -@RequirementName: Java字符串实现
 *                      insert(int offset, char c)/insert(int offset, char[] str)/insert(int dstOffset, CharSequence s)/
 *                      insert(int dstOffset, CharSequence s, int start, int end)/insert(int offset, double d)/insert
 *                      (int offset, float f)/insert(int offset, int i)/insert(int offset, long l)/insert(int offset,
 *                      Object obj)/insert(int offset, String str).
 * -@Brief:
 * -#step1: Create StringBuffer instance.
 * -#step2: Create parameters: 0 =< offset < instance.length, offset test boundary value, str is a String, test method
 *          insert(int offset, String str).
 * -#step3: Create parameters: 0 =< offset < instance.length, offset test boundary value, b is true/false, test method
 *          insert(int offset, boolean b).
 * -#step4: Create parameters: 0 =< offset < instance.length, offset test boundary value, c is a char, test method
 *          insert(int offset, char c).
 * -#step5: Create parameters: 0 =< offset < instance.length, offset test boundary value, create a char[] data, test
 *          method insert(int offset, char[] data).
 * -#step6: Create parameters: 0 =< offset < instance.length, offset test boundary value, s is a CharSequence, test
 *          method insert(int offset, CharSequence s).
 * -#step7: Create parameters: 0 =< offset < instance.length, s is a CharSequence, 0 =< start < end, end <= s.length,
 *          offset/start/end test boundary value, test method insert(int offset, CharSequence s, int start, int end).
 * -#step8: Create parameters: 0 =< offset < instance.length, offset test boundary value, d > 0 or d = 0, test method
 *          insert(int offset, double d).
 * -#step9: Create parameters: 0 =< offset < instance.length, offset test boundary value, f > 0 or f = 0, test method
 *          insert(int offset, float f).
 * -#step10: Create parameters: 0 =< offset < instance.length, offset test boundary value, i > 0 or i = 0, test method
 *           insert(int offset, int i).
 * -#step11: Create parameters: 0 =< offset < instance.length, offset test boundary value, l > 0 or l = 0, test method
 *           insert(int offset, long l).
 * -#step12: Create parameters: 0 =< offset < instance.length, offset test boundary value, obj is a Object, test method
 *           insert(int offset, Object obj).
 * -#step13: Check the insert result is correctly and the Src instance is correctly.
 * -#step14: Change instance as One or more kinds of letters, numbers, special symbols/""/null to repeat step2~13.
 * -@Expect: expected.txt
 * -@Priority: High
 * -@Source: StringBufferInsertTest.java
 * -@ExecuteClass: StringBufferInsertTest
 * -@ExecuteArgs:
 */

import java.io.PrintStream;

public class StringBufferInsertTest {
    private static int processResult = 99;

    public static void main(String[] argv) {
        System.out.println(run(argv, System.out));
    }

    public static int run(String[] argv, PrintStream out) {
        int result = 2; /* STATUS_Success */

        try {
            StringBufferInsertTest_1();
        } catch (Exception e) {
            processResult -= 10;
        }

        if (result == 2 && processResult == 99) {
            result = 0;
        }
        return result;
    }

    public static void StringBufferInsertTest_1() {
        StringBuffer strBuffer1_1 = new StringBuffer("qwertyuiop{}[]\\|asdfghjkl;:'\"zxcvbnm,.<>/?~`1234567890-=!" +
                "@#$%^&*()_+ ASDFGHJKLQWERTYUIOPZXCVBNM0x96");
        StringBuffer strBuffer1_2 = new StringBuffer(" @!.&%()*");
        StringBuffer strBuffer1_3 = new StringBuffer("abc123abc");
        StringBuffer strBuffer1_4 = new StringBuffer("");
        StringBuffer strBuffer1_5 = new StringBuffer();

        test1(strBuffer1_1);
        test1(strBuffer1_2);
        test1(strBuffer1_3);
        test1(strBuffer1_4);
        test1(strBuffer1_5);
    }

    private static void test1(StringBuffer strBuffer) {
        boolean b = true;
        char c = 'C';
        char[] data = {'A', 'B', 'C'};
        CharSequence chs1_1 = "xyz";
        double d = 8888.8888;
        double dMin = 0;
        float f = 99999999;
        float fMin = 0;
        int i = 77777777;
        int iMin = 0;
        long lng = 66666666;
        long lngMin = 0;
        Object obj = new String("object");
        String str = "-";

        System.out.println(strBuffer.insert(0, str).insert(0, b).insert(strBuffer.length(), str)
                .insert(strBuffer.length(), b).insert(0, str).insert(0, false).insert(strBuffer.length(), str)
                .insert(strBuffer.length(), false).insert(0, str).insert(0, c).insert(strBuffer.length(), str)
                .insert(strBuffer.length(), c).insert(0, str).insert(0, data).insert(strBuffer.length(), str)
                .insert(strBuffer.length(), data).insert(0, str).insert(0, chs1_1).insert(strBuffer.length(), str)
                .insert(strBuffer.length(), chs1_1).insert(0, str).insert(0, chs1_1, 1, 2)
                .insert(strBuffer.length(), str).insert(strBuffer.length(), chs1_1, 1, 2).insert(0, str)
                .insert(0, chs1_1, 0, 3).insert(strBuffer.length(), str).insert(strBuffer.length(), chs1_1, 0, 3)
                .insert(0, str).insert(0, chs1_1, 3, 3).insert(strBuffer.length(), str)
                .insert(strBuffer.length(), chs1_1, 3, 3).insert(0, str).insert(0, chs1_1, 0, 0)
                .insert(strBuffer.length(), str).insert(strBuffer.length(), chs1_1, 0, 0).insert(0, str).insert(0, d)
                .insert(strBuffer.length(), str).insert(strBuffer.length(), d).insert(0, str).insert(0, dMin)
                .insert(0, str).insert(0, f).insert(strBuffer.length(), str).insert(strBuffer.length(), f)
                .insert(0, str).insert(0, fMin).insert(0, str).insert(0, i).insert(strBuffer.length(), str)
                .insert(strBuffer.length(), i).insert(0, str).insert(0, iMin).insert(0, str).insert(0, lng)
                .insert(strBuffer.length(), str).insert(strBuffer.length(), lng).insert(0, str)
                .insert(0, lngMin).insert(0, str).insert(0, obj).insert(strBuffer.length(), str)
                .insert(strBuffer.length(), obj));
        System.out.println(strBuffer.subSequence(2, 8));
    }
}

// EXEC:%maple  %f %build_option -o %n.so
// EXEC:%run %n.so %n %run_option | compare %f
// ASSERT: scan object\-0\-66666666\-0\-77777777\-0\.0\-1\.0E8\-0\.0\-8888\.8888\-\-\-xyz\-y\-xyz\-ABC\-C\-false\-true\-qwertyuiop\{\}\[\]\\\|asdfghjkl\;\:\'\"zxcvbnm\,\.\<\>\/\?\~\`1234567890\-\=\!\@\#\$\%\^\&\*\(\)_\+\s*ASDFGHJKLQWERTYUIOPZXCVBNM0x96\-true\-false\-C\-ABC\-xyz\-y\-xyz\-\-\-8888\.8888\-1\.0E8\-77777777\-66666666\-object\s*ject\-0\s*object\-0\-66666666\-0\-77777777\-0\.0\-1\.0E8\-0\.0\-8888\.8888\-\-\-xyz\-y\-xyz\-ABC\-C\-false\-true\-\s*\@\!\.\&\%\(\)\*\-true\-false\-C\-ABC\-xyz\-y\-xyz\-\-\-8888\.8888\-1\.0E8\-77777777\-66666666\-object\s*ject\-0\s*object\-0\-66666666\-0\-77777777\-0\.0\-1\.0E8\-0\.0\-8888\.8888\-\-\-xyz\-y\-xyz\-ABC\-C\-false\-true\-abc123abc\-true\-false\-C\-ABC\-xyz\-y\-xyz\-\-\-8888\.8888\-1\.0E8\-77777777\-66666666\-object\s*ject\-0\s*object\-0\-66666666\-0\-77777777\-0\.0\-1\.0E8\-0\.0\-8888\.8888\-\-\-xyz\-y\-xyz\-ABC\-C\-false\-true\-\-true\-false\-C\-ABC\-xyz\-y\-xyz\-\-\-8888\.8888\-1\.0E8\-77777777\-66666666\-object\s*ject\-0\s*object\-0\-66666666\-0\-77777777\-0\.0\-1\.0E8\-0\.0\-8888\.8888\-\-\-xyz\-y\-xyz\-ABC\-C\-false\-true\-\-true\-false\-C\-ABC\-xyz\-y\-xyz\-\-\-8888\.8888\-1\.0E8\-77777777\-66666666\-object\s*ject\-0\s*0