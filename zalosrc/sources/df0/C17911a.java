package df0;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import fn0.AbstractC19074t;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23057e7;
import on0.AbstractC24342w;
import on0.C24329j;
import p173fz.C19172a;
import qm0.AbstractC25368s;

/* renamed from: df0.a */
/* loaded from: classes4.dex */
public final class C17911a {

    /* renamed from: a */
    public static final C17911a f90436a = new C17911a();

    private C17911a() {
    }

    /* renamed from: a */
    public static final C17916f m94491a(String str, String str2) {
        CharSequence m127168X0;
        List m131502j;
        CharSequence m127168X02;
        List m131502j2;
        AbstractC19074t.m100208f(str, "reference");
        AbstractC19074t.m100208f(str2, "transcribed");
        m127168X0 = AbstractC24342w.m127168X0(str);
        String obj = m127168X0.toString();
        String str3 = null;
        if (obj.length() <= 0) {
            obj = null;
        }
        if (obj == null || (m131502j = new C24329j("\\s+").m127021i(obj, 0)) == null) {
            m131502j = AbstractC25368s.m131502j();
        }
        m127168X02 = AbstractC24342w.m127168X0(str2);
        String obj2 = m127168X02.toString();
        if (obj2.length() > 0) {
            str3 = obj2;
        }
        if (str3 == null || (m131502j2 = new C24329j("\\s+").m127021i(str3, 0)) == null) {
            m131502j2 = AbstractC25368s.m131502j();
        }
        return f90436a.m94492b((String[]) m131502j.toArray(new String[0]), (String[]) m131502j2.toArray(new String[0]));
    }

    /* renamed from: b */
    public final C17916f m94492b(String[] strArr, String[] strArr2) {
        AbstractC19074t.m100208f(strArr, "reference");
        AbstractC19074t.m100208f(strArr2, "hypothesis");
        int length = strArr.length;
        int length2 = strArr2.length;
        int i11 = length + 1;
        int[][] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            iArr[i13] = new int[length2 + 1];
        }
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                iArr[i14][0] = i14;
                if (i14 == length) {
                    break;
                }
                i14++;
            }
        }
        if (length2 >= 0) {
            int i15 = 0;
            while (true) {
                iArr[0][i15] = i15;
                if (i15 == length2) {
                    break;
                }
                i15++;
            }
        }
        if (1 <= length) {
            int i16 = 1;
            while (true) {
                if (1 <= length2) {
                    int i17 = 1;
                    while (true) {
                        int i18 = i16 - 1;
                        int i19 = i17 - 1;
                        if (AbstractC19074t.m100204b(strArr[i18], strArr2[i19])) {
                            iArr[i16][i17] = iArr[i18][i19];
                        } else {
                            int[] iArr2 = iArr[i18];
                            int i21 = iArr2[i17] + 1;
                            int[] iArr3 = iArr[i16];
                            iArr3[i17] = Math.min(i21, Math.min(iArr3[i19] + 1, iArr2[i19] + 1));
                        }
                        if (i17 == length2) {
                            break;
                        }
                        i17++;
                    }
                }
                if (i16 == length) {
                    break;
                }
                i16++;
            }
        }
        int i22 = length;
        int i23 = 0;
        int i24 = 0;
        while (true) {
            if (i22 <= 0 && length2 <= 0) {
                return new C17916f(i12, i23, i24, length);
            }
            if (i22 > 0 && iArr[i22 - 1][length2] + 1 == iArr[i22][length2]) {
                i12++;
                i22--;
            } else {
                if (length2 > 0) {
                    int[] iArr4 = iArr[i22];
                    if (iArr4[length2 - 1] + 1 == iArr4[length2]) {
                        i23++;
                        length2--;
                    }
                }
                if (i22 > 0 && length2 > 0 && iArr[i22 - 1][length2 - 1] + 1 == iArr[i22][length2]) {
                    i24++;
                }
                i22--;
                length2--;
            }
        }
    }

    /* renamed from: c */
    public final int m94493c() {
        int m116588k;
        m116588k = AbstractC22543l.m116588k(C19172a.m100600k("chat_speech_to_text@continuous_buffer_size", 4096), ZVideoUtilMetadata.FF_PROFILE_H264_INTRA, 6144);
        return m116588k;
    }

    /* renamed from: d */
    public final boolean m94494d() {
        if (!m94496f() || C19172a.m100600k("chat_voice_record@tap_to_record@auto_play_preview", 0) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m94495e() {
        if (!m94496f() || C19172a.m100600k("chat_speech_to_text@enable_new_ui", 0) != 1 || !AbstractC23057e7.m118301h()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m94496f() {
        if (C19172a.m100600k("chat_voice_record@enable_new_ui", 0) != 1) {
            return false;
        }
        return true;
    }
}
