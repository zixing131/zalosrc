package q20;

import fn0.AbstractC19074t;
import java.util.List;
import on0.AbstractC24342w;
import on0.AbstractC24344y;
import pm0.AbstractC24866w;
import pm0.C24860q;
import qm0.AbstractC25332a0;

/* renamed from: q20.e */
/* loaded from: classes5.dex */
public final class C25082e {

    /* renamed from: a */
    public static final C25082e f120481a = new C25082e();

    /* renamed from: b */
    private static final C24860q[] f120482b = {AbstractC24866w.m129235a(-6234498, -11220120), AbstractC24866w.m129235a(-9251331, -13984015), AbstractC24866w.m129235a(-8211969, -10067969), AbstractC24866w.m129235a(-16712451, -11875123), AbstractC24866w.m129235a(-12950, -22436), AbstractC24866w.m129235a(-30626, -44694), AbstractC24866w.m129235a(-211293, -1084364), AbstractC24866w.m129235a(-2055437, -2725395)};

    private C25082e() {
    }

    /* renamed from: a */
    public final C24860q m130011a(String str) {
        int i11;
        C24860q[] c24860qArr = f120482b;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        return c24860qArr[Math.abs(i11) % c24860qArr.length];
    }

    /* renamed from: b */
    public final String m130012b(String str) {
        CharSequence m127168X0;
        List m127131A0;
        Object m131205e0;
        char m127205d1;
        Object m131216p0;
        char m127205d12;
        Object m131205e02;
        Character m127206e1;
        char c11;
        boolean m127147N;
        boolean m127147N2;
        boolean m127147N3;
        boolean m127147N4;
        boolean m127147N5;
        boolean m127147N6;
        boolean m127147N7;
        boolean m127147N8;
        boolean m127147N9;
        boolean m127147N10;
        boolean m127147N11;
        boolean m127147N12;
        boolean m127147N13;
        if (str != null && str.length() != 0) {
            char[] charArray = str.toCharArray();
            AbstractC19074t.m100207e(charArray, "toCharArray(...)");
            int length = charArray.length;
            for (int i11 = 0; i11 < length; i11++) {
                char c12 = charArray[i11];
                if (('a' > c12 || c12 >= '{') && (('A' > c12 || c12 >= '[') && ('0' > c12 || c12 >= ':'))) {
                    m127147N = AbstractC24342w.m127147N("áàảãạăắằẳẵặâấầẩẫậ", c12, false, 2, null);
                    if (!m127147N) {
                        m127147N2 = AbstractC24342w.m127147N("ÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬ", c12, false, 2, null);
                        if (!m127147N2) {
                            m127147N3 = AbstractC24342w.m127147N("éèẻẽẹêếềểễệ", c12, false, 2, null);
                            if (!m127147N3) {
                                m127147N4 = AbstractC24342w.m127147N("ÉÈẺẼẸÊẾỀỂỄỆ", c12, false, 2, null);
                                if (!m127147N4) {
                                    m127147N5 = AbstractC24342w.m127147N("íìỉĩị", c12, false, 2, null);
                                    if (!m127147N5) {
                                        m127147N6 = AbstractC24342w.m127147N("ÍÌỈĨỊ", c12, false, 2, null);
                                        if (!m127147N6) {
                                            m127147N7 = AbstractC24342w.m127147N("óòỏõọôốồổỗộơớờởỡợ", c12, false, 2, null);
                                            if (!m127147N7) {
                                                m127147N8 = AbstractC24342w.m127147N("ÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢ", c12, false, 2, null);
                                                if (!m127147N8) {
                                                    m127147N9 = AbstractC24342w.m127147N("úùủũụưứừửữự", c12, false, 2, null);
                                                    if (!m127147N9) {
                                                        m127147N10 = AbstractC24342w.m127147N("ÚÙỦŨỤƯỨỪỬỮỰ", c12, false, 2, null);
                                                        if (!m127147N10) {
                                                            m127147N11 = AbstractC24342w.m127147N("ýỳỷỹỵ", c12, false, 2, null);
                                                            if (!m127147N11) {
                                                                m127147N12 = AbstractC24342w.m127147N("ÝỲỶỸỴ", c12, false, 2, null);
                                                                if (!m127147N12) {
                                                                    m127147N13 = AbstractC24342w.m127147N("đĐ", c12, false, 2, null);
                                                                    if (m127147N13) {
                                                                        charArray[i11] = 'D';
                                                                    } else {
                                                                        charArray[i11] = ' ';
                                                                    }
                                                                }
                                                            }
                                                            charArray[i11] = 'Y';
                                                        }
                                                    }
                                                    charArray[i11] = 'U';
                                                }
                                            }
                                            charArray[i11] = 'O';
                                        }
                                    }
                                    charArray[i11] = 'I';
                                }
                            }
                            charArray[i11] = 'E';
                        }
                    }
                    charArray[i11] = 'A';
                } else {
                    charArray[i11] = Character.toUpperCase(c12);
                }
            }
            m127168X0 = AbstractC24342w.m127168X0(new String(charArray));
            m127131A0 = AbstractC24342w.m127131A0(m127168X0.toString(), new char[]{' '}, false, 0, 6, null);
            if (m127131A0.size() == 1) {
                m131205e02 = AbstractC25332a0.m131205e0(m127131A0);
                m127206e1 = AbstractC24344y.m127206e1((CharSequence) m131205e02);
                if (m127206e1 != null) {
                    c11 = m127206e1.charValue();
                } else {
                    c11 = '#';
                }
                return String.valueOf(c11);
            }
            m131205e0 = AbstractC25332a0.m131205e0(m127131A0);
            m127205d1 = AbstractC24344y.m127205d1((CharSequence) m131205e0);
            m131216p0 = AbstractC25332a0.m131216p0(m127131A0);
            m127205d12 = AbstractC24344y.m127205d1((CharSequence) m131216p0);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m127205d1);
            sb2.append(m127205d12);
            return sb2.toString();
        }
        return "#";
    }
}
