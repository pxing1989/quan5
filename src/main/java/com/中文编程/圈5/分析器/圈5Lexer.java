// Generated from com/中文编程/圈5/分析器/圈5.g4 by ANTLR 4.7
package com.中文编程.圈5.分析器;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class 圈5Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T为=12, T变量名=13, T数=14, T加=15, T減=16, T乘=17, T数乘=18, 
		T除=19, T数除=20, T相等=21, T新行=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T为", "T变量名", "T数", "T加", "T減", "T乘", "T数乘", "T除", "T数除", 
		"T相等", "T新行"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'!='", "'\u2260'", "'<'", "'>'", "'<='", "'>='", "'\u2264'", 
		"'\u2265'", "'('", "')'", "'\u4E3A'", null, null, "'+'", "'-'", "'*'", 
		"'\u00D7'", "'/'", "'\u00F7'", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"T\u0001", "T\u0001\u0002\u0003", "T\u0001", "T\u0001", "T\u0001", "T\u0001", 
		"T\u0001\u0002", "T\u0001", "T\u0001\u0002", "T\u0001\u0002", "T\u0001\u0002"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public 圈5Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "圈5.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\6\16L\n\16\r\16\16\16M\3\17\6\17Q\n\17\r\17"+
		"\16\17R\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\5\27e\n\27\3\27\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30\3\2\4\6\2C\\c|\u4e02\u9fa7\uf902\ufa2f\3\2\62;\2j\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\61\3"+
		"\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\138\3\2\2\2\r:\3\2\2\2\17=\3\2\2\2\21"+
		"@\3\2\2\2\23B\3\2\2\2\25D\3\2\2\2\27F\3\2\2\2\31H\3\2\2\2\33K\3\2\2\2"+
		"\35P\3\2\2\2\37T\3\2\2\2!V\3\2\2\2#X\3\2\2\2%Z\3\2\2\2\'\\\3\2\2\2)^\3"+
		"\2\2\2+`\3\2\2\2-d\3\2\2\2/\60\7?\2\2\60\4\3\2\2\2\61\62\7#\2\2\62\63"+
		"\7?\2\2\63\6\3\2\2\2\64\65\7\u2262\2\2\65\b\3\2\2\2\66\67\7>\2\2\67\n"+
		"\3\2\2\289\7@\2\29\f\3\2\2\2:;\7>\2\2;<\7?\2\2<\16\3\2\2\2=>\7@\2\2>?"+
		"\7?\2\2?\20\3\2\2\2@A\7\u2266\2\2A\22\3\2\2\2BC\7\u2267\2\2C\24\3\2\2"+
		"\2DE\7*\2\2E\26\3\2\2\2FG\7+\2\2G\30\3\2\2\2HI\7\u4e3c\2\2I\32\3\2\2\2"+
		"JL\t\2\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\34\3\2\2\2OQ\t\3\2"+
		"\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\36\3\2\2\2TU\7-\2\2U \3\2"+
		"\2\2VW\7/\2\2W\"\3\2\2\2XY\7,\2\2Y$\3\2\2\2Z[\7\u00d9\2\2[&\3\2\2\2\\"+
		"]\7\61\2\2](\3\2\2\2^_\7\u00f9\2\2_*\3\2\2\2`a\7?\2\2ab\7?\2\2b,\3\2\2"+
		"\2ce\7\17\2\2dc\3\2\2\2de\3\2\2\2ef\3\2\2\2fg\7\f\2\2g.\3\2\2\2\6\2MR"+
		"d\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}