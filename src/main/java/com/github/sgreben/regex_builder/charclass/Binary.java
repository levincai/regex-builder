package com.github.sgreben.regex_builder.charclass;

import com.github.sgreben.regex_builder.CharClass;

import java.util.List;
import java.util.LinkedList;
import java.lang.Iterable;
import java.util.Collections;

abstract class Binary extends CharClassBase {
	private final List<CharClass> children;
	
	public Binary(CharClass leftChild, CharClass rightChild) {
		List<CharClass> children = new LinkedList<CharClass>();
		children.add(leftChild);
		children.add(rightChild);
		this.children = Collections.unmodifiableList(children);
	}
	
	public Iterable<CharClass> children() {
		return children;
	}
}