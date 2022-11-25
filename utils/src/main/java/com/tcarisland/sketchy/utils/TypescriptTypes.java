package com.tcarisland.sketchy.utils;


import lombok.Getter;

public enum TypescriptTypes {
	TS_NUMBER("number"),
	TS_STRING("string"),
	TS_BOOLEAN("boolean"),
	TS_ENUM("enum"),
	TS_VOID("void"),
	TS_NULL("null"),
	TS_UNDEFINED("undefined"),
	TS_NEVER("never"),
	TS_ARRAY("Array"),
	TS_TUPLE("tuple"),
	TS_ANY("any");
		
	@Getter
	private String name;
	
	TypescriptTypes(String tn) {
		name = tn;
	}
}
