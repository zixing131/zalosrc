package cx;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cx.d */
/* loaded from: classes4.dex */
public class C17579d implements InterfaceC17577b {

    /* renamed from: a */
    private final String f89537a;

    /* renamed from: b */
    private final boolean f89538b;

    /* renamed from: c */
    private final File f89539c;

    /* renamed from: d */
    private List f89540d;

    /* renamed from: e */
    private Map f89541e = new HashMap();

    /* renamed from: f */
    private Map f89542f = new HashMap();

    /* renamed from: g */
    private Map f89543g = new HashMap();

    /* renamed from: h */
    private a f89544h;

    /* renamed from: i */
    private String f89545i;

    /* renamed from: cx.d$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: b */
        void mo15863b(List list, long j11, long j12, long j13, long j14, int i11, int i12);
    }

    /* renamed from: cx.d$b */
    /* loaded from: classes4.dex */
    private static class b {

        /* renamed from: a */
        private String f89546a;

        /* renamed from: b */
        private String f89547b;

        private b(String str, String str2) {
            this.f89546a = str;
            this.f89547b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cx.d$c */
    /* loaded from: classes4.dex */
    public static class c {

        /* renamed from: a */
        private int f89548a;

        /* renamed from: b */
        private int f89549b;

        /* renamed from: c */
        private String f89550c;

        /* renamed from: d */
        private String f89551d;

        /* renamed from: e */
        private String f89552e;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public boolean m93621c(int i11, String str, String str2) {
            if ((i11 != 0 && ((this.f89548a > i11 || i11 > this.f89549b) && this.f89549b != 0)) || ((str != null && !str.equals(this.f89550c)) || (str2 != null && !str2.equals(this.f89551d)))) {
                return false;
            }
            return true;
        }

        private c(int i11, int i12, String str, String str2, String str3) {
            this.f89548a = i11;
            this.f89549b = i12;
            this.f89550c = str;
            this.f89551d = str2;
            this.f89552e = str3;
        }
    }

    public C17579d(String str, boolean z11, File file) {
        this.f89537a = str;
        this.f89538b = z11;
        this.f89539c = file;
    }

    /* renamed from: e */
    private String m93613e(String str) {
        String str2 = (String) this.f89541e.get(str);
        if (str2 != null) {
            return str2;
        }
        return str;
    }

    /* renamed from: f */
    private void m93614f(String str, String str2, int i11, String str3, String str4, StringBuffer stringBuffer, List list) {
        Set<c> set;
        Map map = (Map) this.f89543g.get(str);
        if (map != null && (set = (Set) map.get(str2)) != null) {
            int i12 = -1;
            for (c cVar : set) {
                if (cVar.m93621c(i11, str3, str4)) {
                    if (i12 < 0) {
                        i12 = stringBuffer.length();
                        stringBuffer.append(cVar.f89552e);
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        for (int i13 = 0; i13 < i12; i13++) {
                            stringBuffer2.append(' ');
                        }
                        stringBuffer2.append(cVar.f89552e);
                        list.add(stringBuffer2);
                    }
                }
            }
            if (i12 >= 0) {
                return;
            }
        }
        stringBuffer.append(str2);
    }

    @Override // cx.InterfaceC17577b
    /* renamed from: a */
    public boolean mo93607a(String str, String str2) {
        this.f89541e.put(str2, str);
        return true;
    }

    @Override // cx.InterfaceC17577b
    /* renamed from: b */
    public void mo93608b(String str, int i11, int i12, String str2, String str3, String str4, String str5, int i13, int i14, String str6) {
        Map map = (Map) this.f89543g.get(str);
        if (map == null) {
            map = new HashMap();
            this.f89543g.put(str, map);
        }
        Set set = (Set) map.get(str6);
        if (set == null) {
            set = new LinkedHashSet();
            map.put(str6, set);
        }
        set.add(new c(i11, i12, str2, str4, str3));
    }

    @Override // cx.InterfaceC17577b
    /* renamed from: c */
    public void mo93609c(String str, String str2, String str3, String str4, String str5) {
        Map map = (Map) this.f89542f.get(str);
        if (map == null) {
            map = new HashMap();
            this.f89542f.put(str, map);
        }
        Set set = (Set) map.get(str5);
        if (set == null) {
            set = new LinkedHashSet();
            map.put(str5, set);
        }
        set.add(new b(str2, str3));
    }

    /* renamed from: d */
    public void m93615d(long j11, long j12, long j13, long j14, int i11, int i12) {
        String[] split;
        int i13;
        String[] strArr;
        int i14;
        int i15;
        StringBuffer stringBuffer;
        Pattern pattern;
        ArrayList arrayList;
        int i16;
        int i17;
        String[] strArr2;
        int i18;
        int i19;
        StringBuffer stringBuffer2;
        Pattern pattern2;
        ArrayList arrayList2;
        int i21;
        String str;
        int i22;
        StringBuffer stringBuffer3;
        String str2;
        new C17578c(this.f89539c).m93612c(this);
        StringBuffer stringBuffer4 = new StringBuffer(this.f89537a.length() + 32);
        char[] cArr = new char[32];
        int i23 = 0;
        int i24 = 0;
        while (true) {
            int indexOf = this.f89537a.indexOf(37, i23);
            if (indexOf < 0 || indexOf == this.f89537a.length() - 1 || i24 == 32) {
                break;
            }
            stringBuffer4.append(this.f89537a.substring(i23, indexOf));
            stringBuffer4.append('(');
            char charAt = this.f89537a.charAt(indexOf + 1);
            if (charAt != 'C') {
                if (charAt != 'a') {
                    if (charAt != 'c') {
                        if (charAt != 'f') {
                            if (charAt != 't') {
                                if (charAt != 'l') {
                                    if (charAt == 'm') {
                                        stringBuffer4.append("\\b[A-Za-z0-9_$]+\\b");
                                    }
                                } else {
                                    stringBuffer4.append("\\b[0-9]+\\b");
                                }
                            } else {
                                stringBuffer4.append("\\b(?:[A-Za-z0-9_$]+\\.)*[A-Za-z0-9_$]+\\b(?:\\[\\])*");
                            }
                        } else {
                            stringBuffer4.append("\\b[A-Za-z0-9_$]+\\b");
                        }
                    } else {
                        stringBuffer4.append("\\b(?:[A-Za-z0-9_$]+\\.)*[A-Za-z0-9_$]+\\b");
                    }
                } else {
                    stringBuffer4.append("(?:\\b(?:[A-Za-z0-9_$]+\\.)*[A-Za-z0-9_$]+\\b(?:\\[\\])*(?:\\s*,\\s*\\b(?:[A-Za-z0-9_$]+\\.)*[A-Za-z0-9_$]+\\b(?:\\[\\])*)*)?");
                }
            } else {
                stringBuffer4.append("\\b(?:[A-Za-z0-9_$]+/)*[A-Za-z0-9_$]+\\b");
            }
            stringBuffer4.append(')');
            cArr[i24] = charAt;
            i23 = indexOf + 2;
            i24++;
        }
        stringBuffer4.append(this.f89537a.substring(i23));
        Pattern compile = Pattern.compile(stringBuffer4.toString());
        StringBuffer stringBuffer5 = new StringBuffer(256);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int size = this.f89540d.size();
        String str3 = null;
        int i25 = 0;
        while (i25 < size) {
            String str4 = (String) this.f89540d.get(i25);
            if (str4 == null || (split = str4.split("\n")) == null || split.length == 0) {
                break;
            }
            int length = split.length;
            ArrayList arrayList5 = arrayList4;
            int i26 = 0;
            while (i26 < length) {
                String str5 = split[i26];
                int i27 = i26;
                String str6 = "";
                String replace = str5.replace("\r", "");
                if (replace.contains(this.f89545i)) {
                    Matcher matcher = compile.matcher(replace);
                    if (matcher.matches()) {
                        int i28 = 0;
                        int i29 = 0;
                        while (i28 < i24) {
                            int i31 = i28 + 1;
                            if (matcher.start(i31) >= 0) {
                                String group = matcher.group(i31);
                                char c11 = cArr[i28];
                                str2 = str3;
                                if (c11 != 'C') {
                                    if (c11 != 'c') {
                                        if (c11 == 'l') {
                                            i29 = Integer.parseInt(group);
                                        }
                                    } else {
                                        str3 = m93613e(group);
                                    }
                                } else {
                                    str3 = m93613e(AbstractC17576a.m93605a(group));
                                }
                                i28 = i31;
                            } else {
                                str2 = str3;
                            }
                            str3 = str2;
                            i28 = i31;
                        }
                        String str7 = str3;
                        stringBuffer5.setLength(0);
                        arrayList3.clear();
                        int i32 = 0;
                        int i33 = 0;
                        while (i32 < i24) {
                            int i34 = i32 + 1;
                            int start = matcher.start(i34);
                            if (start >= 0) {
                                i22 = matcher.end(i34);
                                String[] strArr3 = split;
                                String group2 = matcher.group(i34);
                                int i35 = length;
                                int i36 = i25;
                                if (".".equalsIgnoreCase(replace.substring(i33, start))) {
                                    stringBuffer5.append(replace.substring(i33, start));
                                }
                                char c12 = cArr[i32];
                                if (c12 != 'C') {
                                    if (c12 != 'c') {
                                        if (c12 != 'l') {
                                            if (c12 != 'm') {
                                                str = str6;
                                                stringBuffer3 = stringBuffer5;
                                                pattern2 = compile;
                                                arrayList2 = arrayList5;
                                                i21 = i27;
                                                strArr2 = strArr3;
                                                i17 = i35;
                                                i18 = i36;
                                                i19 = size;
                                            } else {
                                                i17 = i35;
                                                strArr2 = strArr3;
                                                i18 = i36;
                                                i19 = size;
                                                str = str6;
                                                arrayList2 = arrayList5;
                                                i21 = i27;
                                                stringBuffer3 = stringBuffer5;
                                                pattern2 = compile;
                                                m93614f(str7, group2, i29, null, null, stringBuffer5, arrayList3);
                                            }
                                            stringBuffer2 = stringBuffer3;
                                        } else {
                                            str = str6;
                                            pattern2 = compile;
                                            arrayList2 = arrayList5;
                                            i21 = i27;
                                            strArr2 = strArr3;
                                            i17 = i35;
                                            i18 = i36;
                                            i19 = size;
                                            i29 = Integer.parseInt(group2);
                                            stringBuffer2 = stringBuffer5;
                                            stringBuffer2.append(".");
                                            stringBuffer2.append(group2);
                                        }
                                    } else {
                                        str = str6;
                                        stringBuffer2 = stringBuffer5;
                                        pattern2 = compile;
                                        arrayList2 = arrayList5;
                                        i21 = i27;
                                        strArr2 = strArr3;
                                        i17 = i35;
                                        i18 = i36;
                                        i19 = size;
                                        String m93613e = m93613e(group2);
                                        stringBuffer2.append(m93613e);
                                        str7 = m93613e;
                                    }
                                } else {
                                    str = str6;
                                    stringBuffer2 = stringBuffer5;
                                    pattern2 = compile;
                                    arrayList2 = arrayList5;
                                    i21 = i27;
                                    strArr2 = strArr3;
                                    i17 = i35;
                                    i18 = i36;
                                    i19 = size;
                                    str7 = m93613e(AbstractC17576a.m93605a(group2));
                                    stringBuffer2.append(AbstractC17576a.m93606b(str7));
                                }
                            } else {
                                i17 = length;
                                strArr2 = split;
                                i18 = i25;
                                i19 = size;
                                stringBuffer2 = stringBuffer5;
                                pattern2 = compile;
                                int i37 = i33;
                                arrayList2 = arrayList5;
                                i21 = i27;
                                str = str6;
                                i22 = i37;
                            }
                            stringBuffer5 = stringBuffer2;
                            str6 = str;
                            i32 = i34;
                            i27 = i21;
                            length = i17;
                            split = strArr2;
                            i33 = i22;
                            i25 = i18;
                            size = i19;
                            compile = pattern2;
                            arrayList5 = arrayList2;
                        }
                        i13 = length;
                        strArr = split;
                        i14 = i25;
                        i15 = size;
                        stringBuffer = stringBuffer5;
                        pattern = compile;
                        arrayList = arrayList5;
                        i16 = i27;
                        arrayList.add(stringBuffer.toString().replace(this.f89545i, str6));
                        str3 = str7;
                        i26 = i16 + 1;
                        stringBuffer5 = stringBuffer;
                        arrayList5 = arrayList;
                        length = i13;
                        split = strArr;
                        i25 = i14;
                        size = i15;
                        compile = pattern;
                    }
                }
                i13 = length;
                strArr = split;
                i14 = i25;
                i15 = size;
                stringBuffer = stringBuffer5;
                pattern = compile;
                arrayList = arrayList5;
                i16 = i27;
                i26 = i16 + 1;
                stringBuffer5 = stringBuffer;
                arrayList5 = arrayList;
                length = i13;
                split = strArr;
                i25 = i14;
                size = i15;
                compile = pattern;
            }
            i25++;
            arrayList4 = arrayList5;
        }
        this.f89544h.mo15863b(arrayList4, j11, j12, j13, j14, i11, i12);
    }

    /* renamed from: g */
    public void m93616g(a aVar) {
        this.f89544h = aVar;
    }

    /* renamed from: h */
    public void m93617h(String str) {
        this.f89545i = str;
    }

    /* renamed from: i */
    public void m93618i(List list) {
        this.f89540d = list;
    }
}
