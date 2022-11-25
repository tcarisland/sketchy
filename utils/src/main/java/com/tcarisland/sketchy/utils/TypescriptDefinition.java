package com.tcarisland.sketchy.utils;

public @interface TypescriptDefinition {
	
    public TypescriptTypes type() default TypescriptTypes.TS_ANY;
    public boolean optional() default false;

    public static class Renderer {
    	public static String getFullTypeName(TypescriptDefinition def) {
    		return String.format("%s%s", def.type().getName(), def.optional() ? " | undefined" : "");
    	}
    }
    
}
