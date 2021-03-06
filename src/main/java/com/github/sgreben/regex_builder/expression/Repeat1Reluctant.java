package com.github.sgreben.regex_builder.expression;

import com.github.sgreben.regex_builder.CaptureGroupIndex;
import com.github.sgreben.regex_builder.tokens.QUESTION;
import com.github.sgreben.regex_builder.Expression;
import com.github.sgreben.regex_builder.tokens.TOKEN;

public class Repeat1Reluctant extends Repeat1 {
    public Repeat1Reluctant(Expression child) {
        super(child);
    }

    @Override
    public void compile(CaptureGroupIndex index, java.util.List<TOKEN> output) {
        super.compile(index, output);
        output.add(new QUESTION());
    }
}