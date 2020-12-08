// Generated from bashGrammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class bashGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, OPEN_PAR=2, CLOSE_PAR=3, OPEN_CUR=4, CLOSE_CUR=5, OPEN_BOX=6, 
		CLOSE_BOX=7, RHS_ASSIGNMENT=8, SINGLE_STRING=9, DOUBLE_STRING=10, COMMENT=11, 
		SPACE=12, FUNCTION=13, IF=14, THEN=15, ELIF=16, ELSE=17, FI=18, FOR=19, 
		WHILE=20, DO=21, SED=22, SED_FLAG=23, BREAK=24, CONTINUE=25, DONE=26, 
		COMMAND=27, VAR=28, WEBSITE=29, FILENAME=30, BASH_VAR=31, VAL=32, ASSIGN=33, 
		SEMICOLON=34, LOGICAL_OP=35, INCREMENT=36, COMPARE=37, BLOB=38, OTHER=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "OPEN_PAR", "CLOSE_PAR", 
			"OPEN_CUR", "CLOSE_CUR", "OPEN_BOX", "CLOSE_BOX", "RHS_ASSIGNMENT", "SINGLE_STRING", 
			"DOUBLE_STRING", "COMMENT", "SPACE", "FUNCTION", "IF", "THEN", "ELIF", 
			"ELSE", "FI", "FOR", "WHILE", "DO", "SED", "SED_FLAG", "BREAK", "CONTINUE", 
			"DONE", "COMMAND", "VAR", "WEBSITE", "FILENAME", "BASH_VAR", "VAL", "ASSIGN", 
			"SEMICOLON", "LOGICAL_OP", "INCREMENT", "COMPARE", "BLOB", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'('", "')'", "'{'", "'}'", "'['", "']'", null, null, null, 
			null, null, "'function'", "'if'", "'then'", "'elif'", "'else'", "'fi'", 
			"'for'", "'while'", "'do'", "'sed'", null, "'break'", "'continue'", "'done'", 
			null, null, null, null, null, null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "OPEN_PAR", "CLOSE_PAR", "OPEN_CUR", "CLOSE_CUR", "OPEN_BOX", 
			"CLOSE_BOX", "RHS_ASSIGNMENT", "SINGLE_STRING", "DOUBLE_STRING", "COMMENT", 
			"SPACE", "FUNCTION", "IF", "THEN", "ELIF", "ELSE", "FI", "FOR", "WHILE", 
			"DO", "SED", "SED_FLAG", "BREAK", "CONTINUE", "DONE", "COMMAND", "VAR", 
			"WEBSITE", "FILENAME", "BASH_VAR", "VAL", "ASSIGN", "SEMICOLON", "LOGICAL_OP", 
			"INCREMENT", "COMPARE", "BLOB", "OTHER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public bashGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "bashGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u017e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\7\rt\n\r\f\r\16\rw\13\r\3\r\3"+
		"\r\3\r\3\r\3\r\6\r~\n\r\r\r\16\r\177\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0088"+
		"\n\r\r\r\16\r\u0089\3\r\3\r\5\r\u008e\n\r\3\16\3\16\6\16\u0092\n\16\r"+
		"\16\16\16\u0093\3\16\3\16\3\17\3\17\6\17\u009a\n\17\r\17\16\17\u009b\3"+
		"\17\3\17\3\20\3\20\7\20\u00a2\n\20\f\20\16\20\u00a5\13\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00e0"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u010b\n \3!\3!\7!\u010f\n!\f!\16!\u0112"+
		"\13!\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u011a\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0123\n\"\3\"\3\"\3\"\5\"\u0128\n\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0130"+
		"\n\"\r\"\16\"\u0131\3\"\3\"\6\"\u0136\n\"\r\"\16\"\u0137\3\"\3\"\6\"\u013c"+
		"\n\"\r\"\16\"\u013d\3\"\5\"\u0141\n\"\7\"\u0143\n\"\f\"\16\"\u0146\13"+
		"\"\3#\3#\3#\3#\3$\3$\3$\3%\5%\u0150\n%\3%\6%\u0153\n%\r%\16%\u0154\3&"+
		"\3&\3\'\3\'\3(\3(\3(\3(\5(\u015f\n(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\5)\u016d\n)\3*\3*\3*\3*\3*\3*\3*\5*\u0176\n*\3+\6+\u0179\n+\r+\16+\u017a"+
		"\3,\3,\4u\u017a\2-\3\3\5\2\7\2\t\2\13\2\r\4\17\5\21\6\23\7\25\b\27\t\31"+
		"\n\33\13\35\f\37\r!\16#\17%\20\'\21)\22+\23-\24/\25\61\26\63\27\65\30"+
		"\67\319\32;\33=\34?\35A\36C\37E G!I\"K#M$O%Q&S\'U(W)\3\2\20\b\2##&(,<"+
		"B\\``c|\b\2\"#&(,<B\\``c|\3\2))\3\2$$\4\2\f\f\17\17\5\2\13\f\17\17\"\""+
		"\5\2C\\aac|\6\2\62;C\\aac|\4\2\62;c|\3\2c|\6\2%%\62;C\\c|\5\2\62;C\\c"+
		"|\4\2>>@@\t\2##&(,\60\62;B\\``c|\2\u019f\2\3\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3"+
		"\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2"+
		"\2\2W\3\2\2\2\3Y\3\2\2\2\5[\3\2\2\2\7]\3\2\2\2\t_\3\2\2\2\13a\3\2\2\2"+
		"\rc\3\2\2\2\17e\3\2\2\2\21g\3\2\2\2\23i\3\2\2\2\25k\3\2\2\2\27m\3\2\2"+
		"\2\31\u008d\3\2\2\2\33\u008f\3\2\2\2\35\u0097\3\2\2\2\37\u009f\3\2\2\2"+
		"!\u00a8\3\2\2\2#\u00aa\3\2\2\2%\u00b3\3\2\2\2\'\u00b6\3\2\2\2)\u00bb\3"+
		"\2\2\2+\u00c0\3\2\2\2-\u00c5\3\2\2\2/\u00c8\3\2\2\2\61\u00cc\3\2\2\2\63"+
		"\u00d2\3\2\2\2\65\u00d5\3\2\2\2\67\u00df\3\2\2\29\u00e1\3\2\2\2;\u00e7"+
		"\3\2\2\2=\u00f0\3\2\2\2?\u010a\3\2\2\2A\u010c\3\2\2\2C\u0127\3\2\2\2E"+
		"\u0147\3\2\2\2G\u014b\3\2\2\2I\u014f\3\2\2\2K\u0156\3\2\2\2M\u0158\3\2"+
		"\2\2O\u015e\3\2\2\2Q\u016c\3\2\2\2S\u0175\3\2\2\2U\u0178\3\2\2\2W\u017c"+
		"\3\2\2\2YZ\7.\2\2Z\4\3\2\2\2[\\\7-\2\2\\\6\3\2\2\2]^\7/\2\2^\b\3\2\2\2"+
		"_`\7,\2\2`\n\3\2\2\2ab\7\61\2\2b\f\3\2\2\2cd\7*\2\2d\16\3\2\2\2ef\7+\2"+
		"\2f\20\3\2\2\2gh\7}\2\2h\22\3\2\2\2ij\7\177\2\2j\24\3\2\2\2kl\7]\2\2l"+
		"\26\3\2\2\2mn\7_\2\2n\30\3\2\2\2op\7&\2\2pq\7}\2\2qu\3\2\2\2rt\13\2\2"+
		"\2sr\3\2\2\2tw\3\2\2\2uv\3\2\2\2us\3\2\2\2vx\3\2\2\2wu\3\2\2\2x\u008e"+
		"\7\177\2\2yz\7&\2\2z{\7*\2\2{}\3\2\2\2|~\t\2\2\2}|\3\2\2\2~\177\3\2\2"+
		"\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u008e\7+\2"+
		"\2\u0082\u0083\7&\2\2\u0083\u0084\7*\2\2\u0084\u0085\7*\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0088\t\3\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7+"+
		"\2\2\u008c\u008e\7+\2\2\u008do\3\2\2\2\u008dy\3\2\2\2\u008d\u0082\3\2"+
		"\2\2\u008e\32\3\2\2\2\u008f\u0091\7)\2\2\u0090\u0092\n\4\2\2\u0091\u0090"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\7)\2\2\u0096\34\3\2\2\2\u0097\u0099\7$\2\2"+
		"\u0098\u009a\n\5\2\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u0099"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\7$\2\2\u009e"+
		"\36\3\2\2\2\u009f\u00a3\7%\2\2\u00a0\u00a2\n\6\2\2\u00a1\u00a0\3\2\2\2"+
		"\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6"+
		"\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\b\20\2\2\u00a7 \3\2\2\2\u00a8"+
		"\u00a9\t\7\2\2\u00a9\"\3\2\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7w\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad\u00ae\7e\2\2\u00ae\u00af\7v\2\2\u00af\u00b0\7k\2\2"+
		"\u00b0\u00b1\7q\2\2\u00b1\u00b2\7p\2\2\u00b2$\3\2\2\2\u00b3\u00b4\7k\2"+
		"\2\u00b4\u00b5\7h\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7"+
		"j\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7p\2\2\u00ba(\3\2\2\2\u00bb\u00bc"+
		"\7g\2\2\u00bc\u00bd\7n\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7h\2\2\u00bf"+
		"*\3\2\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7u\2\2\u00c3"+
		"\u00c4\7g\2\2\u00c4,\3\2\2\2\u00c5\u00c6\7h\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		".\3\2\2\2\u00c8\u00c9\7h\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7t\2\2\u00cb"+
		"\60\3\2\2\2\u00cc\u00cd\7y\2\2\u00cd\u00ce\7j\2\2\u00ce\u00cf\7k\2\2\u00cf"+
		"\u00d0\7n\2\2\u00d0\u00d1\7g\2\2\u00d1\62\3\2\2\2\u00d2\u00d3\7f\2\2\u00d3"+
		"\u00d4\7q\2\2\u00d4\64\3\2\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\u00d8\7f\2\2\u00d8\66\3\2\2\2\u00d9\u00da\7/\2\2\u00da\u00e0\7p\2\2\u00db"+
		"\u00dc\7/\2\2\u00dc\u00e0\7k\2\2\u00dd\u00de\7/\2\2\u00de\u00e0\7g\2\2"+
		"\u00df\u00d9\3\2\2\2\u00df\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e08\3"+
		"\2\2\2\u00e1\u00e2\7d\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7g\2\2\u00e4"+
		"\u00e5\7c\2\2\u00e5\u00e6\7m\2\2\u00e6:\3\2\2\2\u00e7\u00e8\7e\2\2\u00e8"+
		"\u00e9\7q\2\2\u00e9\u00ea\7p\2\2\u00ea\u00eb\7v\2\2\u00eb\u00ec\7k\2\2"+
		"\u00ec\u00ed\7p\2\2\u00ed\u00ee\7w\2\2\u00ee\u00ef\7g\2\2\u00ef<\3\2\2"+
		"\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4"+
		"\7g\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7e\2\2\u00f7\u00f8"+
		"\7j\2\2\u00f8\u010b\7q\2\2\u00f9\u00fa\7e\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u010b\7v\2\2\u00fc\u00fd\7n\2\2\u00fd\u010b\7u\2\2\u00fe\u00ff\7n\2\2"+
		"\u00ff\u010b\7n\2\2\u0100\u0101\7v\2\2\u0101\u0102\7k\2\2\u0102\u0103"+
		"\7o\2\2\u0103\u010b\7g\2\2\u0104\u0105\7y\2\2\u0105\u0106\7i\2\2\u0106"+
		"\u0107\7g\2\2\u0107\u010b\7v\2\2\u0108\u0109\7e\2\2\u0109\u010b\7f\2\2"+
		"\u010a\u00f5\3\2\2\2\u010a\u00f9\3\2\2\2\u010a\u00fc\3\2\2\2\u010a\u00fe"+
		"\3\2\2\2\u010a\u0100\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"@\3\2\2\2\u010c\u0110\t\b\2\2\u010d\u010f\t\t\2\2\u010e\u010d\3\2\2\2"+
		"\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111B\3"+
		"\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7j\2\2\u0114\u0115\7v\2\2\u0115"+
		"\u0116\7v\2\2\u0116\u0117\7r\2\2\u0117\u0119\3\2\2\2\u0118\u011a\7u\2"+
		"\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u0123\3\2\2\2\u011b\u011c"+
		"\7h\2\2\u011c\u011d\7v\2\2\u011d\u0123\7r\2\2\u011e\u011f\7u\2\2\u011f"+
		"\u0120\7o\2\2\u0120\u0121\7v\2\2\u0121\u0123\7r\2\2\u0122\u0113\3\2\2"+
		"\2\u0122\u011b\3\2\2\2\u0122\u011e\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125"+
		"\7<\2\2\u0125\u0126\7\61\2\2\u0126\u0128\7\61\2\2\u0127\u0122\3\2\2\2"+
		"\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\7y\2\2\u012a\u012b"+
		"\7y\2\2\u012b\u012c\7y\2\2\u012c\u012d\7\60\2\2\u012d\u012f\3\2\2\2\u012e"+
		"\u0130\t\n\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135\7\60\2\2\u0134"+
		"\u0136\t\13\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0135\3"+
		"\2\2\2\u0137\u0138\3\2\2\2\u0138\u0144\3\2\2\2\u0139\u013b\7\61\2\2\u013a"+
		"\u013c\t\f\2\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f\u0141\7\61\2\2\u0140"+
		"\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0139\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"D\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\5A!\2\u0148\u0149\7\60\2\2\u0149"+
		"\u014a\5A!\2\u014aF\3\2\2\2\u014b\u014c\7&\2\2\u014c\u014d\5A!\2\u014d"+
		"H\3\2\2\2\u014e\u0150\7/\2\2\u014f\u014e\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0152\3\2\2\2\u0151\u0153\t\r\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155J\3\2\2\2\u0156\u0157"+
		"\7?\2\2\u0157L\3\2\2\2\u0158\u0159\7=\2\2\u0159N\3\2\2\2\u015a\u015b\7"+
		"~\2\2\u015b\u015f\7~\2\2\u015c\u015d\7(\2\2\u015d\u015f\7(\2\2\u015e\u015a"+
		"\3\2\2\2\u015e\u015c\3\2\2\2\u015fP\3\2\2\2\u0160\u0161\7-\2\2\u0161\u016d"+
		"\7-\2\2\u0162\u0163\7/\2\2\u0163\u016d\7/\2\2\u0164\u0165\7-\2\2\u0165"+
		"\u016d\7?\2\2\u0166\u0167\7/\2\2\u0167\u016d\7?\2\2\u0168\u0169\7\61\2"+
		"\2\u0169\u016d\7?\2\2\u016a\u016b\7,\2\2\u016b\u016d\7?\2\2\u016c\u0160"+
		"\3\2\2\2\u016c\u0162\3\2\2\2\u016c\u0164\3\2\2\2\u016c\u0166\3\2\2\2\u016c"+
		"\u0168\3\2\2\2\u016c\u016a\3\2\2\2\u016dR\3\2\2\2\u016e\u016f\7>\2\2\u016f"+
		"\u0176\7?\2\2\u0170\u0171\7@\2\2\u0171\u0176\7?\2\2\u0172\u0176\t\16\2"+
		"\2\u0173\u0174\7?\2\2\u0174\u0176\7?\2\2\u0175\u016e\3\2\2\2\u0175\u0170"+
		"\3\2\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0176T\3\2\2\2\u0177"+
		"\u0179\t\17\2\2\u0178\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3"+
		"\2\2\2\u017a\u0178\3\2\2\2\u017bV\3\2\2\2\u017c\u017d\13\2\2\2\u017dX"+
		"\3\2\2\2\33\2u\177\u0089\u008d\u0093\u009b\u00a3\u00df\u010a\u0110\u0119"+
		"\u0122\u0127\u0131\u0137\u013d\u0140\u0144\u014f\u0154\u015e\u016c\u0175"+
		"\u017a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}