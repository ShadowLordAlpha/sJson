package sla.json;

/**
 * The JsonToken class contains the different tokens used by the JsonLexer to
 * parse Json files.
 * 
 * @author Josh
 *
 */
public enum JsonToken {

	LEFT_CURLY_BRACE('{'),
	RIGHT_CURLY_BRACE('}'),
	LEFT_SQUARE_BRACE('['),
	RIGHT_SQUARE_BRACE(']'),
	COMMA(','),
	COLON(':'),
	VALUE(),
	STRING(),
	EOF();
	
	private JsonToken() {
		
	}
	
	private JsonToken(char character) {
		
	}
}
