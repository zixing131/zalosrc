package p309l;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p283k.AbstractC21420a;
import p335m.C22695b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l.a */
/* loaded from: classes2.dex */
public class C21973a {

    /* renamed from: a */
    String f108153a = "audio/.*(?i)(mp3|mpeg|wav)";

    /* renamed from: b */
    String f108154b = "video/.*(?i)(mp4)";

    /* renamed from: c */
    String f108155c = "custom/.*(?i)(ima|facebook)";

    /* renamed from: l.a$b */
    /* loaded from: classes2.dex */
    private class b implements Comparator {
        private b(C21973a c21973a) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(C22695b c22695b, C22695b c22695b2) {
            int m117376a = c22695b.m117376a();
            int m117376a2 = c22695b2.m117376a();
            if (m117376a < m117376a2) {
                return -1;
            }
            return m117376a > m117376a2 ? 1 : 0;
        }
    }

    /* renamed from: a */
    private C22695b m114744a(List list) {
        AbstractC21420a.m110921a("DefaultMediaPicker", "getBestMatch");
        C22695b c22695b = null;
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C22695b c22695b2 = (C22695b) it.next();
                if (m114745b(c22695b2)) {
                    String m117379d = c22695b2.m117379d();
                    if (!m117379d.contains("mp3") && !m117379d.contains("mpeg")) {
                        if (c22695b == null || (!c22695b.m117379d().contains("wav") && m117379d.contains("wav"))) {
                            c22695b = c22695b2;
                        }
                    }
                    return c22695b2;
                }
            }
        } catch (Exception e11) {
            AbstractC21420a.m110922b("DefaultMediaPicker", "getBestMatch", e11);
        }
        return c22695b;
    }

    /* renamed from: b */
    private boolean m114745b(C22695b c22695b) {
        String m117379d;
        try {
            m117379d = c22695b.m117379d();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!m117379d.matches(this.f108153a) && !m117379d.matches(this.f108155c)) {
            if (!m117379d.matches(this.f108154b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private int m114746d(List list) {
        String str;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C22695b c22695b = (C22695b) it.next();
            if (TextUtils.isEmpty(c22695b.m117379d())) {
                str = "Validator error: mediaFile type empty";
            } else if (TextUtils.isEmpty(c22695b.m117382g())) {
                str = "Validator error: mediaFile url empty";
            }
            AbstractC21420a.m110921a("DefaultMediaPicker", str);
            it.remove();
        }
        return list.size();
    }

    /* renamed from: c */
    public C22695b m114747c(List list) {
        if (list == null || m114746d(list) == 0) {
            return null;
        }
        Collections.sort(list, new b());
        return m114744a(list);
    }
}
