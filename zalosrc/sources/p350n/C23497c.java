package p350n;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p283k.AbstractC21420a;
import p375o.C23970a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: n.c */
/* loaded from: classes2.dex */
public final class C23497c {

    /* renamed from: a */
    String f114076a = "video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)";

    /* renamed from: b */
    String f114077b = "audio/.*(?i)(mp3|mpeg|wav)";

    /* renamed from: c */
    String f114078c = "custom/.*(?i)(ima|facebook)";

    /* renamed from: d */
    private int f114079d;

    /* renamed from: e */
    private int f114080e;

    /* renamed from: f */
    private int f114081f;

    /* renamed from: g */
    private Context f114082g;

    /* renamed from: n.c$b */
    /* loaded from: classes2.dex */
    private class b implements Comparator {
        private b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C23970a c23970a, C23970a c23970a2) {
            int intValue = c23970a.m125449l().intValue() * c23970a.m125438a().intValue();
            int intValue2 = c23970a2.m125449l().intValue() * c23970a2.m125438a().intValue();
            int abs = Math.abs(intValue - C23497c.this.f114081f);
            int abs2 = Math.abs(intValue2 - C23497c.this.f114081f);
            AbstractC21420a.m110924d("VASTMediaPicker", "AreaComparator: obj1:" + abs + " obj2:" + abs2);
            if (abs < abs2) {
                return -1;
            }
            return abs > abs2 ? 1 : 0;
        }
    }

    public C23497c(Context context) {
        this.f114082g = context;
        m123336c();
    }

    /* renamed from: b */
    private C23970a m123335b(List list) {
        AbstractC21420a.m110921a("VASTMediaPicker", "getBestMatch");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23970a c23970a = (C23970a) it.next();
            if (m123337d(c23970a)) {
                return c23970a;
            }
        }
        return null;
    }

    /* renamed from: c */
    private void m123336c() {
        DisplayMetrics displayMetrics = this.f114082g.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        this.f114079d = i11;
        int i12 = displayMetrics.heightPixels;
        this.f114080e = i12;
        this.f114081f = i11 * i12;
    }

    /* renamed from: d */
    private boolean m123337d(C23970a c23970a) {
        String m125442e;
        try {
            m125442e = c23970a.m125442e();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!m125442e.matches(this.f114076a) && !m125442e.matches(this.f114078c)) {
            if (!m125442e.matches(this.f114077b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    private int m123338f(List list) {
        String str;
        StringBuilder sb2;
        String str2;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C23970a c23970a = (C23970a) it.next();
            if (TextUtils.isEmpty(c23970a.m125442e())) {
                str = "Validator error: mediaFile type empty";
            } else {
                BigInteger m125438a = c23970a.m125438a();
                if (m125438a == null) {
                    str = "Validator error: mediaFile height null";
                } else {
                    int intValue = m125438a.intValue();
                    if (intValue < 0 || intValue >= 5000) {
                        sb2 = new StringBuilder();
                        str2 = "Validator error: mediaFile height invalid: ";
                    } else {
                        BigInteger m125449l = c23970a.m125449l();
                        if (m125449l == null) {
                            str = "Validator error: mediaFile width null";
                        } else {
                            intValue = m125449l.intValue();
                            if (intValue < 0 || intValue >= 5000) {
                                sb2 = new StringBuilder();
                                str2 = "Validator error: mediaFile width invalid: ";
                            } else if (TextUtils.isEmpty(c23970a.m125446i())) {
                                str = "Validator error: mediaFile url empty";
                            }
                        }
                    }
                    sb2.append(str2);
                    sb2.append(intValue);
                    str = sb2.toString();
                }
            }
            AbstractC21420a.m110921a("VASTMediaPicker", str);
            it.remove();
        }
        return list.size();
    }

    /* renamed from: e */
    public C23970a m123339e(List list) {
        if (list == null || m123338f(list) == 0) {
            return null;
        }
        Collections.sort(list, new b());
        return m123335b(list);
    }
}
