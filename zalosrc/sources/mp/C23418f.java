package mp;

import ae.C0766k;
import com.zing.zalo.feed.models.PrivacyInfo;
import com.zing.zalo.social.controls.LikeContactItem;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.HashMap;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.AbstractC21935u;

/* renamed from: mp.f */
/* loaded from: classes4.dex */
public final class C23418f {

    /* renamed from: a */
    public static final C23418f f113810a = new C23418f();

    /* renamed from: b */
    private static long f113811b = -1;

    /* renamed from: c */
    private static final HashMap f113812c = new HashMap();

    /* renamed from: mp.f$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo79430a(PrivacyInfo privacyInfo);

        /* renamed from: b */
        void mo79431b(boolean z11);

        void onError(int i11);
    }

    /* renamed from: mp.f$b */
    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ a f113813a;

        /* renamed from: b */
        final /* synthetic */ PrivacyInfo f113814b;

        /* renamed from: c */
        final /* synthetic */ int f113815c;

        /* renamed from: d */
        final /* synthetic */ long f113816d;

        b(a aVar, PrivacyInfo privacyInfo, int i11, long j11) {
            this.f113813a = aVar;
            this.f113814b = privacyInfo;
            this.f113815c = i11;
            this.f113816d = j11;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            try {
                try {
                    a aVar = this.f113813a;
                    if (aVar != null) {
                        aVar.mo79431b(false);
                    }
                    if (this.f113813a == null) {
                        return;
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                    if (this.f113813a == null) {
                        return;
                    }
                }
                this.f113813a.onError(c20096c.m104491c());
            } catch (Throwable th2) {
                if (this.f113813a != null) {
                    this.f113813a.onError(c20096c.m104491c());
                }
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONArray jSONArray;
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null) {
                    jSONArray = optJSONObject.optJSONArray("list");
                } else {
                    jSONArray = null;
                }
                ArrayList arrayList = new ArrayList();
                if (jSONArray != null && jSONArray.length() > 0) {
                    int length = jSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        Object obj2 = jSONArray.get(i11);
                        AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject = (JSONObject) obj2;
                        String optString = jSONObject.optString("uid");
                        String optString2 = jSONObject.optString("avt");
                        String optString3 = jSONObject.optString("dpn");
                        if (AbstractC21935u.m114558y(optString)) {
                            arrayList.add(new LikeContactItem(optString, AbstractC21935u.m114542i(optString, optString3), optString2));
                        }
                    }
                }
                a aVar = this.f113813a;
                if (aVar != null) {
                    aVar.mo79431b(false);
                }
                PrivacyInfo privacyInfo = this.f113814b;
                if (privacyInfo == null) {
                    PrivacyInfo privacyInfo2 = new PrivacyInfo();
                    privacyInfo2.f45973p = this.f113815c;
                    privacyInfo2.m45136H(arrayList);
                    C23418f.f113810a.m123076c(this.f113816d, privacyInfo2);
                    a aVar2 = this.f113813a;
                    if (aVar2 != null) {
                        aVar2.mo79430a(privacyInfo2);
                        return;
                    }
                    return;
                }
                privacyInfo.m45136H(arrayList);
                a aVar3 = this.f113813a;
                if (aVar3 != null) {
                    aVar3.mo79430a(this.f113814b);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
                a aVar4 = this.f113813a;
                if (aVar4 != null) {
                    aVar4.onError(-1);
                }
            }
        }
    }

    private C23418f() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:            r12.mo79430a(r2);     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:            return;     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m123074a(long j11, int i11, a aVar) {
        try {
            PrivacyInfo m123075b = m123075b(j11);
            if (m123075b == null || (m123075b.m45153y() && !m123075b.m45151w())) {
                if (!C23055e5.m118273h(false, 1, null)) {
                    if (aVar != null) {
                        aVar.onError(50001);
                    }
                } else {
                    if (aVar != null) {
                        aVar.mo79431b(true);
                    }
                    f113811b = j11;
                    C0766k c0766k = new C0766k();
                    c0766k.mo1704o8(new b(aVar, m123075b, i11, j11));
                    c0766k.mo1623da(j11, "0", 100);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            if (aVar != null) {
                aVar.onError(-1);
            }
        }
    }

    /* renamed from: b */
    public final PrivacyInfo m123075b(long j11) {
        return (PrivacyInfo) f113812c.get(Long.valueOf(j11));
    }

    /* renamed from: c */
    public final void m123076c(long j11, PrivacyInfo privacyInfo) {
        AbstractC19074t.m100208f(privacyInfo, "privacyInfo");
        f113812c.put(Long.valueOf(j11), privacyInfo);
    }

    /* renamed from: d */
    public final void m123077d() {
        f113812c.clear();
    }
}
