package p716zh;

import android.text.Spannable;
import android.text.SpannableString;
import com.zing.zalo.social.controls.InterfaceC10867f;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import me0.AbstractC23244v8;
import nb0.C23672c;
import p348mi.AbstractC23309i;
import vg.C28202u5;

/* renamed from: zh.a6 */
/* loaded from: classes3.dex */
public class C31839a6 {

    /* renamed from: a */
    private static volatile C31839a6 f146131a;

    private C31839a6() {
    }

    /* renamed from: b */
    public static synchronized C31839a6 m152968b() {
        C31839a6 c31839a6;
        synchronized (C31839a6.class) {
            try {
                if (f146131a == null) {
                    synchronized (C31839a6.class) {
                        f146131a = new C31839a6();
                    }
                }
                c31839a6 = f146131a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c31839a6;
    }

    /* renamed from: e */
    public static /* synthetic */ int m152969e(C28202u5 c28202u5, C28202u5 c28202u52) {
        String str = c28202u5.f131404b;
        if (str == null || c28202u52.f131404b == null) {
            return 1;
        }
        if (str.length() > c28202u52.f131404b.length()) {
            return -1;
        }
        if (!c28202u5.f131404b.equals(c28202u52.f131404b)) {
            return 1;
        }
        return 0;
    }

    /* renamed from: f */
    public static CharSequence m152970f(CharSequence charSequence, ArrayList arrayList, boolean z11, InterfaceC10867f interfaceC10867f) {
        Spannable spannableString;
        ArrayList arrayList2;
        try {
            if (!AbstractC23309i.m121072J2()) {
                return charSequence;
            }
            if (charSequence != null && arrayList != null && !arrayList.isEmpty()) {
                if (charSequence instanceof Spannable) {
                    spannableString = (Spannable) charSequence;
                } else {
                    spannableString = new SpannableString(charSequence);
                }
                int length = charSequence.length();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C31873ca c31873ca = (C31873ca) it.next();
                    if (c31873ca != null && (arrayList2 = c31873ca.f146378c) != null && !arrayList2.isEmpty() && c31873ca.f146376a >= 0 && c31873ca.f146377b <= length) {
                        Iterator it2 = c31873ca.f146378c.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (next instanceof C23672c) {
                                ((C23672c) next).m56369M(interfaceC10867f);
                                ((C23672c) next).m124006k0(!z11);
                                ((C23672c) next).m124005j0(z11);
                            }
                            spannableString.setSpan(next, c31873ca.f146376a, c31873ca.f146377b, 33);
                        }
                    }
                }
                return spannableString;
            }
            return charSequence;
        } catch (Exception e11) {
            e11.printStackTrace();
            return charSequence;
        }
    }

    /* renamed from: c */
    public ArrayList m152971c(SpannableString spannableString, List list, C31854b6 c31854b6) {
        String normalize;
        int length;
        char c11;
        ArrayList arrayList = new ArrayList();
        if (!AbstractC23309i.m121072J2()) {
            return arrayList;
        }
        if (spannableString != null && c31854b6 != null) {
            try {
                if (c31854b6.m153140a()) {
                    String lowerCase = spannableString.toString().toLowerCase();
                    int length2 = lowerCase.length();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : list) {
                        arrayList2.add(new C31873ca(spannableString.getSpanStart(obj), spannableString.getSpanEnd(obj)));
                    }
                    ArrayList<C28202u5> arrayList3 = new ArrayList(c31854b6.f146276a.values());
                    Collections.sort(arrayList3, new Comparator() { // from class: zh.z5
                        @Override // java.util.Comparator
                        public final int compare(Object obj2, Object obj3) {
                            int m152969e;
                            m152969e = C31839a6.m152969e((C28202u5) obj2, (C28202u5) obj3);
                            return m152969e;
                        }
                    });
                    for (C28202u5 c28202u5 : arrayList3) {
                        if (c28202u5 != null && c28202u5.m141796a() && (length = (normalize = Normalizer.normalize(c28202u5.f131404b, Normalizer.Form.NFC)).length()) <= length2) {
                            ArrayList arrayList4 = new ArrayList();
                            Matcher matcher = AbstractC23244v8.m119750n(normalize).matcher(lowerCase);
                            while (matcher.find()) {
                                int start = matcher.start();
                                matcher.end();
                                arrayList4.add(Integer.valueOf(start));
                            }
                            for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                                int intValue = ((Integer) arrayList4.get(i11)).intValue();
                                int i12 = intValue + length;
                                char c12 = ' ';
                                if (intValue > 0) {
                                    c11 = lowerCase.charAt(intValue - 1);
                                } else {
                                    c11 = ' ';
                                }
                                if (i12 < lowerCase.length()) {
                                    c12 = lowerCase.charAt(i12);
                                }
                                if (m152972d(c11) && m152972d(c12)) {
                                    Iterator it = arrayList2.iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            C31873ca c31873ca = (C31873ca) it.next();
                                            if (i12 < c31873ca.f146376a || intValue > c31873ca.f146377b) {
                                            }
                                        } else {
                                            C31873ca c31873ca2 = new C31873ca(intValue, i12);
                                            c31873ca2.f146378c.add(new C23672c(c28202u5, intValue, i12));
                                            arrayList.add(c31873ca2);
                                            arrayList2.add(c31873ca2);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    boolean m152972d(int i11) {
        return i11 == 32 || i11 == 10 || i11 == 9 || i11 == 46 || i11 == 58 || i11 == 59 || i11 == 63 || i11 == 44 || i11 == 33 || i11 == 8230;
    }
}
