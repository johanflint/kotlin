/*
 * Copyright 2010-2014 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/* The following code was generated by JFlex 1.4.3 on 7/15/14 9:40 PM */

package org.jetbrains.jet.kdoc.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import com.intellij.util.text.CharArrayUtil;
import java.lang.Character;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/15/14 9:40 PM from the specification file
 * <tt>C:/Projects/kotlin/compiler/frontend/src/org/jetbrains/jet/kdoc/lexer/KDoc.flex</tt>
 */
class _KDocLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int CODE = 8;
  public static final int CONTENTS_BEGINNING = 4;
  public static final int CODE2 = 10;
  public static final int LINE_BEGINNING = 2;
  public static final int CONTENTS = 6;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  4, 4
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\1\1\12\1\0\2\1\22\0\1\1\3\0\1\3\5\0"+
    "\1\4\4\0\1\5\12\2\6\0\1\6\32\3\1\11\1\7\1\10"+
    "\1\0\1\3\1\0\32\3\47\0\4\3\4\0\1\3\12\0\1\3"+
    "\4\0\1\3\5\0\27\3\1\0\37\3\1\0\u013f\3\31\0\162\3"+
    "\4\0\14\3\16\0\5\3\11\0\1\3\213\0\1\3\13\0\1\3"+
    "\1\0\3\3\1\0\1\3\1\0\24\3\1\0\54\3\1\0\46\3"+
    "\1\0\5\3\4\0\202\3\10\0\105\3\1\0\46\3\2\0\2\3"+
    "\6\0\20\3\41\0\46\3\2\0\1\3\7\0\47\3\110\0\33\3"+
    "\5\0\3\3\56\0\32\3\5\0\13\3\43\0\2\3\1\0\143\3"+
    "\1\0\1\3\17\0\2\3\7\0\2\3\12\0\3\3\2\0\1\3"+
    "\20\0\1\3\1\0\36\3\35\0\3\3\60\0\46\3\13\0\1\3"+
    "\u0152\0\66\3\3\0\1\3\22\0\1\3\7\0\12\3\43\0\10\3"+
    "\2\0\2\3\2\0\26\3\1\0\7\3\1\0\1\3\3\0\4\3"+
    "\3\0\1\3\36\0\2\3\1\0\3\3\16\0\4\3\21\0\6\3"+
    "\4\0\2\3\2\0\26\3\1\0\7\3\1\0\2\3\1\0\2\3"+
    "\1\0\2\3\37\0\4\3\1\0\1\3\23\0\3\3\20\0\11\3"+
    "\1\0\3\3\1\0\26\3\1\0\7\3\1\0\2\3\1\0\5\3"+
    "\3\0\1\3\22\0\1\3\17\0\2\3\17\0\1\3\23\0\10\3"+
    "\2\0\2\3\2\0\26\3\1\0\7\3\1\0\2\3\1\0\5\3"+
    "\3\0\1\3\36\0\2\3\1\0\3\3\17\0\1\3\21\0\1\3"+
    "\1\0\6\3\3\0\3\3\1\0\4\3\3\0\2\3\1\0\1\3"+
    "\1\0\2\3\3\0\2\3\3\0\3\3\3\0\10\3\1\0\3\3"+
    "\77\0\1\3\13\0\10\3\1\0\3\3\1\0\27\3\1\0\12\3"+
    "\1\0\5\3\46\0\2\3\43\0\10\3\1\0\3\3\1\0\27\3"+
    "\1\0\12\3\1\0\5\3\3\0\1\3\40\0\1\3\1\0\2\3"+
    "\43\0\10\3\1\0\3\3\1\0\27\3\1\0\20\3\46\0\2\3"+
    "\43\0\22\3\3\0\30\3\1\0\11\3\1\0\1\3\2\0\7\3"+
    "\72\0\60\3\1\0\2\3\13\0\10\3\72\0\2\3\1\0\1\3"+
    "\2\0\2\3\1\0\1\3\2\0\1\3\6\0\4\3\1\0\7\3"+
    "\1\0\3\3\1\0\1\3\1\0\1\3\2\0\2\3\1\0\4\3"+
    "\1\0\2\3\11\0\1\3\2\0\5\3\1\0\1\3\25\0\2\3"+
    "\42\0\1\3\77\0\10\3\1\0\42\3\35\0\4\3\164\0\42\3"+
    "\1\0\5\3\1\0\2\3\45\0\6\3\112\0\46\3\12\0\51\3"+
    "\7\0\132\3\5\0\104\3\5\0\122\3\6\0\7\3\1\0\77\3"+
    "\1\0\1\3\1\0\4\3\2\0\7\3\1\0\1\3\1\0\4\3"+
    "\2\0\47\3\1\0\1\3\1\0\4\3\2\0\37\3\1\0\1\3"+
    "\1\0\4\3\2\0\7\3\1\0\1\3\1\0\4\3\2\0\7\3"+
    "\1\0\7\3\1\0\27\3\1\0\37\3\1\0\1\3\1\0\4\3"+
    "\2\0\7\3\1\0\47\3\1\0\23\3\105\0\125\3\14\0\u026c\3"+
    "\2\0\10\3\12\0\32\3\5\0\113\3\3\0\3\3\17\0\15\3"+
    "\1\0\4\3\16\0\22\3\16\0\22\3\16\0\15\3\1\0\3\3"+
    "\17\0\64\3\43\0\1\3\3\0\2\3\103\0\130\3\10\0\51\3"+
    "\127\0\35\3\63\0\36\3\2\0\5\3\u038b\0\154\3\224\0\234\3"+
    "\4\0\132\3\6\0\26\3\2\0\6\3\2\0\46\3\2\0\6\3"+
    "\2\0\10\3\1\0\1\3\1\0\1\3\1\0\1\3\1\0\37\3"+
    "\2\0\65\3\1\0\7\3\1\0\1\3\3\0\3\3\1\0\7\3"+
    "\3\0\4\3\2\0\6\3\4\0\15\3\5\0\3\3\1\0\7\3"+
    "\102\0\2\3\23\0\1\3\34\0\1\3\15\0\1\3\40\0\22\3"+
    "\120\0\1\3\4\0\1\3\2\0\12\3\1\0\1\3\3\0\5\3"+
    "\6\0\1\3\1\0\1\3\1\0\1\3\1\0\4\3\1\0\3\3"+
    "\1\0\7\3\3\0\3\3\5\0\5\3\26\0\44\3\u0e81\0\3\3"+
    "\31\0\11\3\7\0\5\3\2\0\5\3\4\0\126\3\6\0\3\3"+
    "\1\0\137\3\5\0\50\3\4\0\136\3\21\0\30\3\70\0\20\3"+
    "\u0200\0\u19b6\3\112\0\u51a6\3\132\0\u048d\3\u0773\0\u2ba4\3\u215c\0\u012e\3"+
    "\2\0\73\3\225\0\7\3\14\0\5\3\5\0\1\3\1\0\12\3"+
    "\1\0\15\3\1\0\5\3\1\0\1\3\1\0\2\3\1\0\2\3"+
    "\1\0\154\3\41\0\u016b\3\22\0\100\3\2\0\66\3\50\0\15\3"+
    "\66\0\2\3\30\0\3\3\31\0\1\3\6\0\5\3\1\0\207\3"+
    "\7\0\1\3\34\0\32\3\4\0\1\3\1\0\32\3\12\0\132\3"+
    "\3\0\6\3\2\0\6\3\2\0\6\3\2\0\3\3\3\0\2\3"+
    "\3\0\2\3\31\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\5\0\3\1\1\2\1\3\1\4\5\2\1\0\1\5"+
    "\1\0\1\6\1\7\1\10\1\11\1\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[24];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\13\0\26\0\41\0\54\0\67\0\102\0\115"+
    "\0\67\0\130\0\143\0\156\0\171\0\204\0\102\0\217"+
    "\0\102\0\67\0\232\0\67\0\67\0\67\0\245\0\67";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[24];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\4\6\1\7\1\10\4\6\1\0\1\11\1\12\2\11"+
    "\1\13\2\11\1\14\1\15\1\16\1\12\1\11\1\12"+
    "\2\11\1\17\1\11\1\20\1\14\1\15\1\16\1\12"+
    "\1\11\1\12\2\11\1\17\2\11\1\14\1\15\1\16"+
    "\1\12\4\6\1\7\5\6\20\0\1\21\1\22\11\0"+
    "\1\23\7\0\1\12\10\0\1\12\4\0\1\13\1\22"+
    "\15\0\2\24\11\0\1\25\13\0\1\26\4\0\1\27"+
    "\13\0\1\30\10\0\2\27\7\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[176];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\5\0\1\11\2\1\1\11\7\1\1\0\1\11\1\0"+
    "\3\11\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[24];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  public _KDocLexer() {
    this((java.io.Reader)null);
  }

  private boolean isLastToken() {
    return zzMarkedPos == zzBuffer.length();
  }

  private Boolean yytextContainLineBreaks() {
    return CharArrayUtil.containLineBreaks(zzBuffer, zzStartRead, zzMarkedPos);
  }

  private boolean nextIsNotWhitespace() {
    return zzMarkedPos <= zzBuffer.length() && !Character.isWhitespace(zzBuffer.charAt(zzMarkedPos + 1));
  }

  private boolean prevIsNotWhitespace() {
    return zzMarkedPos != 0 && !Character.isWhitespace(zzBuffer.charAt(zzMarkedPos - 1));
  }


  _KDocLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  _KDocLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1206) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
      return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { if (isLastToken()) return KDocTokens.END;
                                            else return KDocTokens.TEXT;
          }
        case 11: break;
        case 3: 
          { if (yytextContainLineBreaks()) {
            yybegin(LINE_BEGINNING);
            return TokenType.WHITE_SPACE;
        } else {
            yybegin(yystate() == CONTENTS_BEGINNING? CONTENTS_BEGINNING:CONTENTS);
            return KDocTokens.TEXT;  // internal white space
        }
          }
        case 12: break;
        case 9: 
          { yybegin(CONTENTS);
                                              return KDocTokens.TAG_NAME;
          }
        case 13: break;
        case 7: 
          { yybegin(CONTENTS);
            return KDocTokens.WIKI_LINK_CLOSE;
          }
        case 14: break;
        case 6: 
          { yybegin(CONTENTS);
                   return KDocTokens.MARKDOWN_ESCAPED_CHAR;
          }
        case 15: break;
        case 10: 
          { yybegin(CONTENTS);
                                            return KDocTokens.START;
          }
        case 16: break;
        case 2: 
          { yybegin(CONTENTS);
            return KDocTokens.TEXT;
          }
        case 17: break;
        case 1: 
          { return TokenType.BAD_CHARACTER;
          }
        case 18: break;
        case 4: 
          { yybegin(CONTENTS_BEGINNING);
                                            return KDocTokens.LEADING_ASTERISK;
          }
        case 19: break;
        case 8: 
          { yybegin(CONTENTS);
            return KDocTokens.WIKI_LINK_OPEN;
          }
        case 20: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
