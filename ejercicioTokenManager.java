/* ejercicioTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. ejercicioTokenManager.java */

/** Token Manager. */
@SuppressWarnings("unused")public class ejercicioTokenManager implements ejercicioConstants {

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0){
   switch (pos)
   {
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 32:
         return jjStartNfaWithStates_0(0, 7, 115);
      case 46:
         return jjStopAtPos(0, 19);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 115;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                     { jjCheckNAddStates(0, 4); }
                  }
                  else if (curChar == 44)
                  {
                     if (kind > 15)
                        kind = 15;
                     { jjCheckNAddStates(5, 10); }
                  }
                  else if (curChar == 45)
                     { jjCheckNAddTwoStates(35, 89); }
                  else if (curChar == 32)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddStates(11, 35); }
                  }
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 1;
                  else if (curChar == 45)
                  {
                     if (kind > 12)
                        kind = 12;
                     { jjCheckNAdd(4); }
                  }
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 115:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddTwoStates(83, 84); }
                  }
                  else if (curChar == 44)
                     { jjCheckNAddStates(36, 40); }
                  else if (curChar == 32)
                     { jjCheckNAddStates(41, 52); }
                  else if (curChar == 45)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddStates(53, 57); }
                  }
                  else if (curChar == 46)
                     { jjCheckNAddTwoStates(79, 80); }
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(77, 78); }
                  else if (curChar == 32)
                  {
                     if (kind > 14)
                        kind = 14;
                     { jjCheckNAdd(87); }
                  }
                  else if (curChar == 44)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddTwoStates(83, 84); }
                  }
                  else if (curChar == 46)
                     { jjCheckNAddTwoStates(73, 74); }
                  else if (curChar == 45)
                     { jjCheckNAdd(35); }
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(71, 72); }
                  else if (curChar == 32)
                  {
                     if (kind > 7)
                        kind = 7;
                     { jjCheckNAddStates(58, 61); }
                  }
                  if (curChar == 32)
                     { jjCheckNAddStates(62, 64); }
                  if (curChar == 32)
                     { jjCheckNAddStates(65, 67); }
                  if (curChar == 32)
                     { jjCheckNAddStates(68, 76); }
                  if (curChar == 32)
                     { jjCheckNAddTwoStates(33, 34); }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 2:
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L && kind > 9)
                     kind = 9;
                  break;
               case 4:
                  if (curChar != 45)
                     break;
                  if (kind > 12)
                     kind = 12;
                  { jjCheckNAdd(4); }
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 1)
                     kind = 1;
                  { jjCheckNAddTwoStates(24, 25); }
                  break;
               case 25:
                  if (curChar != 44)
                     break;
                  if (kind > 1)
                     kind = 1;
                  { jjCheckNAdd(25); }
                  break;
               case 32:
                  if (curChar != 32)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddStates(11, 35); }
                  break;
               case 33:
                  if (curChar == 32)
                     { jjCheckNAddTwoStates(33, 34); }
                  break;
               case 34:
                  if (curChar == 45)
                     { jjCheckNAdd(35); }
                  break;
               case 35:
                  if (curChar == 45)
                     { jjCheckNAdd(36); }
                  break;
               case 36:
                  if (curChar == 45)
                     { jjCheckNAddStates(77, 81); }
                  break;
               case 37:
                  if (curChar == 45)
                     { jjCheckNAddStates(82, 85); }
                  break;
               case 38:
                  if (curChar == 44)
                     { jjCheckNAddStates(86, 88); }
                  break;
               case 39:
                  if (curChar == 32)
                     { jjCheckNAddTwoStates(39, 40); }
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAddStates(89, 91); }
                  break;
               case 41:
                  if (curChar != 44)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAddTwoStates(41, 42); }
                  break;
               case 42:
                  if (curChar != 32)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAdd(42); }
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAddStates(92, 94); }
                  break;
               case 44:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAddTwoStates(41, 42); }
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 2)
                     kind = 2;
                  { jjCheckNAddStates(95, 100); }
                  break;
               case 46:
                  if (curChar == 32)
                     { jjCheckNAddStates(101, 104); }
                  break;
               case 48:
                  if (curChar == 32)
                     { jjCheckNAddStates(41, 52); }
                  break;
               case 49:
                  if (curChar == 32)
                     { jjCheckNAddStates(68, 76); }
                  break;
               case 51:
                  if (curChar != 44)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjstateSet[jjnewStateCnt++] = 51;
                  break;
               case 68:
                  if (curChar == 44)
                     { jjCheckNAddStates(36, 40); }
                  break;
               case 69:
                  if (curChar == 44)
                     { jjCheckNAddTwoStates(69, 49); }
                  break;
               case 70:
                  if (curChar == 32)
                     { jjCheckNAddStates(65, 67); }
                  break;
               case 71:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(71, 72); }
                  break;
               case 72:
                  if (curChar == 46)
                     { jjCheckNAddTwoStates(73, 74); }
                  break;
               case 73:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(73, 74); }
                  break;
               case 75:
                  if (curChar != 44)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjstateSet[jjnewStateCnt++] = 75;
                  break;
               case 76:
                  if (curChar == 32)
                     { jjCheckNAddStates(62, 64); }
                  break;
               case 77:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(77, 78); }
                  break;
               case 78:
                  if (curChar == 46)
                     { jjCheckNAddTwoStates(79, 80); }
                  break;
               case 79:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(79, 80); }
                  break;
               case 81:
                  if (curChar != 44)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjstateSet[jjnewStateCnt++] = 81;
                  break;
               case 82:
                  if (curChar != 32)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddStates(58, 61); }
                  break;
               case 83:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddTwoStates(83, 84); }
                  break;
               case 84:
                  if (curChar != 44)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddTwoStates(83, 84); }
                  break;
               case 85:
                  if (curChar != 45)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddStates(53, 57); }
                  break;
               case 86:
                  if (curChar != 45)
                     break;
                  if (kind > 7)
                     kind = 7;
                  { jjCheckNAddStates(105, 107); }
                  break;
               case 87:
                  if (curChar != 32)
                     break;
                  if (kind > 14)
                     kind = 14;
                  { jjCheckNAdd(87); }
                  break;
               case 88:
                  if (curChar == 45)
                     { jjCheckNAddTwoStates(35, 89); }
                  break;
               case 89:
                  if (curChar == 45)
                     { jjCheckNAdd(90); }
                  break;
               case 90:
                  if (curChar != 45)
                     break;
                  if (kind > 16)
                     kind = 16;
                  { jjCheckNAdd(90); }
                  break;
               case 92:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  { jjCheckNAddStates(0, 4); }
                  break;
               case 93:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 94;
                  break;
               case 94:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 95;
                  break;
               case 95:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 96;
                  break;
               case 96:
                  if ((0x3000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 97;
                  break;
               case 97:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 98;
                  break;
               case 98:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 99;
                  break;
               case 99:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(100, 101); }
                  break;
               case 100:
                  if (curChar == 44)
                     { jjCheckNAddTwoStates(100, 101); }
                  break;
               case 101:
                  if (curChar == 32)
                     { jjCheckNAddStates(108, 110); }
                  break;
               case 102:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(111, 113); }
                  break;
               case 103:
                  if (curChar == 44)
                     { jjCheckNAddTwoStates(103, 104); }
                  break;
               case 104:
                  if (curChar != 32)
                     break;
                  if (kind > 4)
                     kind = 4;
                  { jjCheckNAdd(104); }
                  break;
               case 105:
                  if (curChar != 32)
                     break;
                  if (kind > 4)
                     kind = 4;
                  { jjCheckNAddStates(114, 117); }
                  break;
               case 106:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 107;
                  break;
               case 107:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 108;
                  break;
               case 108:
                  if ((0x3ff000000000000L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 109:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  { jjCheckNAdd(109); }
                  break;
               case 110:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 17)
                     kind = 17;
                  { jjCheckNAdd(110); }
                  break;
               case 111:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 18)
                     kind = 18;
                  jjstateSet[jjnewStateCnt++] = 112;
                  break;
               case 112:
                  if ((0x3ff000000000000L & l) != 0L && kind > 18)
                     kind = 18;
                  break;
               case 113:
                  if (curChar != 44)
                     break;
                  if (kind > 15)
                     kind = 15;
                  { jjCheckNAddStates(5, 10); }
                  break;
               case 114:
                  if (curChar != 44)
                     break;
                  if (kind > 15)
                     kind = 15;
                  { jjCheckNAdd(114); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(35, 89); }
                  if ((0x9d1288L & l) != 0L)
                  {
                     if (kind > 22)
                        kind = 22;
                     { jjCheckNAddStates(118, 120); }
                  }
                  else if (curChar == 69)
                     { jjCheckNAddStates(121, 124); }
                  else if (curChar == 65)
                     { jjAddStates(125, 126); }
                  else if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 7;
                  if ((0x800020L & l) != 0L)
                  {
                     if (kind > 21)
                        kind = 21;
                  }
                  else if ((0x84000L & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                  }
                  else if (curChar == 67)
                     { jjCheckNAddTwoStates(28, 29); }
                  else if (curChar == 84)
                     { jjCheckNAddStates(127, 129); }
                  else if (curChar == 80)
                     { jjCheckNAdd(15); }
                  else if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 9;
                  if (curChar == 83)
                     { jjCheckNAddStates(130, 132); }
                  else if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 115:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(35); }
                  if ((0x9d1288L & l) != 0L)
                     { jjCheckNAddStates(118, 120); }
                  else if (curChar == 69)
                     { jjCheckNAddTwoStates(66, 59); }
                  else if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 57;
                  else if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 50;
                  if (curChar == 83)
                     { jjCheckNAddStates(133, 135); }
                  else if (curChar == 84)
                     { jjCheckNAddStates(136, 138); }
                  else if (curChar == 80)
                     { jjCheckNAdd(59); }
                  else if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 55;
                  else if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 5:
                  if ((0x84000L & l) != 0L && kind > 20)
                     kind = 20;
                  break;
               case 6:
                  if ((0x800020L & l) != 0L && kind > 21)
                     kind = 21;
                  break;
               case 7:
                  if (curChar == 85 && kind > 23)
                     kind = 23;
                  break;
               case 8:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 79 && kind > 23)
                     kind = 23;
                  break;
               case 10:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 86 && kind > 23)
                     kind = 23;
                  break;
               case 12:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 66 && kind > 23)
                     kind = 23;
                  break;
               case 14:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 84 && kind > 23)
                     kind = 23;
                  break;
               case 16:
                  if (curChar == 80)
                     { jjCheckNAdd(15); }
                  break;
               case 17:
                  if (curChar == 84)
                     { jjCheckNAddStates(127, 129); }
                  break;
               case 18:
                  if (curChar == 68 && kind > 23)
                     kind = 23;
                  break;
               case 19:
                  if (curChar == 83 && kind > 23)
                     kind = 23;
                  break;
               case 20:
                  if (curChar == 89 && kind > 23)
                     kind = 23;
                  break;
               case 21:
                  if (curChar == 83)
                     { jjCheckNAddStates(130, 132); }
                  break;
               case 22:
                  if (curChar == 65)
                     { jjAddStates(125, 126); }
                  break;
               case 23:
                  if (curChar != 76)
                     break;
                  if (kind > 1)
                     kind = 1;
                  { jjCheckNAddTwoStates(24, 25); }
                  break;
               case 26:
                  if (curChar == 76 && kind > 13)
                     kind = 13;
                  break;
               case 27:
                  if (curChar == 69)
                     { jjCheckNAddStates(121, 124); }
                  break;
               case 28:
                  if (curChar != 80)
                     break;
                  if (kind > 1)
                     kind = 1;
                  { jjCheckNAddTwoStates(24, 25); }
                  break;
               case 29:
                  if (curChar == 80 && kind > 13)
                     kind = 13;
                  break;
               case 30:
                  if (curChar == 88 && kind > 23)
                     kind = 23;
                  break;
               case 31:
                  if (curChar == 67)
                     { jjCheckNAddTwoStates(28, 29); }
                  break;
               case 34:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(35); }
                  break;
               case 35:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(36); }
                  break;
               case 36:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAddStates(77, 81); }
                  break;
               case 47:
                  if ((0x9d1288L & l) != 0L)
                     { jjCheckNAddStates(118, 120); }
                  break;
               case 50:
                  if (curChar != 85)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(51); }
                  break;
               case 52:
                  if (curChar == 72)
                     jjstateSet[jjnewStateCnt++] = 50;
                  break;
               case 53:
                  if (curChar != 79)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(51); }
                  break;
               case 54:
                  if (curChar == 76)
                     jjstateSet[jjnewStateCnt++] = 53;
                  break;
               case 55:
                  if (curChar != 86)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(51); }
                  break;
               case 56:
                  if (curChar == 87)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 57:
                  if (curChar != 66)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(51); }
                  break;
               case 58:
                  if (curChar == 68)
                     jjstateSet[jjnewStateCnt++] = 57;
                  break;
               case 59:
                  if (curChar != 84)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(51); }
                  break;
               case 60:
                  if (curChar == 80)
                     { jjCheckNAdd(59); }
                  break;
               case 61:
                  if (curChar == 84)
                     { jjCheckNAddStates(136, 138); }
                  break;
               case 62:
                  if (curChar != 68)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(51); }
                  break;
               case 63:
                  if (curChar != 83)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(51); }
                  break;
               case 64:
                  if (curChar != 89)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(51); }
                  break;
               case 65:
                  if (curChar == 69)
                     { jjCheckNAddTwoStates(66, 59); }
                  break;
               case 66:
                  if (curChar != 88)
                     break;
                  if (kind > 3)
                     kind = 3;
                  { jjCheckNAdd(51); }
                  break;
               case 67:
                  if (curChar == 83)
                     { jjCheckNAddStates(133, 135); }
                  break;
               case 74:
                  if ((0x84000L & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjstateSet[jjnewStateCnt++] = 75;
                  break;
               case 80:
                  if ((0x800020L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjstateSet[jjnewStateCnt++] = 81;
                  break;
               case 88:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAddTwoStates(35, 89); }
                  break;
               case 89:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     { jjCheckNAdd(90); }
                  break;
               case 90:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  { jjCheckNAdd(90); }
                  break;
               case 91:
                  if ((0x9d1288L & l) == 0L)
                     break;
                  if (kind > 22)
                     kind = 22;
                  { jjCheckNAddStates(118, 120); }
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 115 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   93, 106, 109, 110, 111, 47, 69, 49, 114, 48, 68, 33, 34, 47, 49, 52, 
   54, 56, 58, 60, 70, 71, 72, 76, 77, 78, 82, 83, 84, 87, 85, 61, 
   65, 67, 48, 68, 47, 69, 49, 48, 68, 47, 49, 52, 54, 56, 58, 60, 
   61, 65, 67, 48, 68, 82, 86, 83, 84, 85, 82, 83, 84, 85, 76, 77, 
   78, 70, 71, 72, 49, 52, 54, 56, 58, 60, 61, 65, 67, 36, 37, 38, 
   46, 45, 37, 38, 39, 45, 38, 39, 40, 41, 42, 43, 44, 41, 42, 38, 
   39, 41, 42, 43, 45, 38, 39, 40, 46, 86, 83, 84, 102, 103, 105, 102, 
   103, 104, 102, 103, 104, 105, 47, 48, 68, 28, 29, 30, 15, 23, 26, 18, 
   19, 20, 18, 19, 15, 62, 63, 59, 62, 63, 64, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, "\56", null, null, null, null, null, null, null, 
null, };
static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         curTokenImage = "";
      else
         curTokenImage = image.toString();
      beginLine = endLine = input_stream.getEndLine();
      beginColumn = endColumn = input_stream.getEndColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      curTokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 13 && (0x2600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 11;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static int[] jjemptyLineNo = new int[1];
static int[] jjemptyColNo = new int[1];
static boolean[] jjbeenHere = new boolean[1];
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 1 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String dato = image.toString();
                dato = dato.replace(" ", "");
                matchedToken.image = dato;
         break;
      case 2 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String nombreHur = image.toString();
                nombreHur = nombreHur.replace(" ", "");
                matchedToken.image = nombreHur;
         break;
      case 3 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String indetificador = image.toString();
                String[] recorID = indetificador.split(",",2);


                recorID[0] = recorID[0].replace(" ", "");
                if ( recorID[0].isEmpty() )
                {
                        recorID[0] = "na";
                }else{recorID[1] = recorID[1].replace(" ","");}

                matchedToken.image = recorID[0] + "," + recorID[1];
         break;
      case 4 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String fechaHur = image.toString();
                fechaHur = fechaHur.replace(" ", "");
                matchedToken.image = fechaHur;
         break;
      case 5 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String lat = image.toString();
                lat = lat.replace(" ", "");
                matchedToken.image = lat;
         break;
      case 6 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String lon = image.toString();
                lon = lon.replace(" ", "");
                matchedToken.image = lon;
         break;
      case 7 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                String windsMaxim = image.toString();
                windsMaxim = windsMaxim.replace("-999", "null");
                matchedToken.image = windsMaxim;
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() &&
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 21 :
         break;
      case 22 :
         break;
      case 23 :
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public ejercicioTokenManager(SimpleCharStream stream){

      if (input_stream != null)
        throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);

    input_stream = stream;
  }

  /** Constructor. */
  public ejercicioTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream)
  {
    jjmatchedPos = jjnewStateCnt = 0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  static private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 115; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  static public void ReInit(SimpleCharStream stream, int lexState)
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  static public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffL, 
};
static final long[] jjtoSkip = {
   0xf000000L, 
};
    static protected SimpleCharStream  input_stream;

    static private final int[] jjrounds = new int[115];
    static private final int[] jjstateSet = new int[2 * 115];

    private static final StringBuilder jjimage = new StringBuilder();
    private static StringBuilder image = jjimage;
    private static int jjimageLen;
    private static int lengthOfMatch;
    
    static protected char curChar;
}
