package sgreben.regex_builder.expression;

import sgreben.regex_builder.tokens.*;

public class AnyCharacter extends Nullary {
	public void compile(sgreben.regex_builder.CaptureGroupIndex index, java.util.List<TOKEN> output) {
		output.add(new DOT());
	}
}