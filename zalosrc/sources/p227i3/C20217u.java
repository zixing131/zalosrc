package p227i3;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.os.AbstractC1442h;
import com.adtima.Adtima;
import com.adtima.ads.ZAdsAdMap;
import com.adtima.ads.ZAdsBannerSize;
import com.adtima.ads.ZAdsBundle;
import com.adtima.ads.ZAdsBundleListener;
import com.zing.zalo.BuildConfig;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p009a3.C0097b;
import p009a3.C0098c;
import p009a3.C0099d;
import p009a3.C0101f;
import p025b.AbstractC2472a;
import p029b3.C2503a;
import p029b3.C2504b;
import p090d3.C17718a;
import p090d3.C17719b;
import p090d3.C17720c;
import p120e3.C18192c;
import p148f3.C18709a;
import p148f3.C18710b;
import p178g3.AbstractC19207b;
import p178g3.C19206a;
import p178g3.C19208c;
import p178g3.C19212g;
import p196h3.InterfaceC19739a;
import p196h3.InterfaceC19740b;
import p196h3.InterfaceC19741c;
import p196h3.InterfaceC19742d;
import p196h3.InterfaceC19743e;
import p196h3.InterfaceC19745g;
import p196h3.InterfaceC19746h;
import p254j3.C20911b;
import p309l.AbstractC21974b;
import p309l.C21976d;
import p309l.C21977e;
import p313l3.AbstractC22011d;
import p350n.C23498d;
import p350n.C23499e;
import p667y2.C30265b;
import p667y2.C30267d;
import p667y2.C30270g;

/* renamed from: i3.u */
/* loaded from: classes2.dex */
public final class C20217u {

    /* renamed from: o */
    public static final String f99970o = "u";

    /* renamed from: p */
    private static C20217u f99971p;

    /* renamed from: a */
    private Context f99972a;

    /* renamed from: i */
    private HashMap f99980i;

    /* renamed from: b */
    private boolean f99973b = false;

    /* renamed from: c */
    private boolean f99974c = false;

    /* renamed from: d */
    private String f99975d = "";

    /* renamed from: e */
    private String f99976e = "";

    /* renamed from: f */
    private String f99977f = "";

    /* renamed from: g */
    private boolean f99978g = false;

    /* renamed from: h */
    private C18192c f99979h = null;

    /* renamed from: j */
    private Runnable f99981j = null;

    /* renamed from: k */
    private boolean f99982k = false;

    /* renamed from: l */
    private long f99983l = 0;

    /* renamed from: m */
    private int f99984m = 0;

    /* renamed from: n */
    private String f99985n = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$a */
    /* loaded from: classes2.dex */
    public class a extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f99986p;

        /* renamed from: q */
        final /* synthetic */ String f99987q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC19743e f99988r;

        a(String str, String str2, InterfaceC19743e interfaceC19743e) {
            this.f99986p = str;
            this.f99987q = str2;
            this.f99988r = interfaceC19743e;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            try {
                return C20217u.this.m105547c0("native", this.f99986p, this.f99987q);
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleNativeAds", e11);
                return null;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Object obj) {
            String str;
            String str2;
            try {
                if (obj == null) {
                    this.f99988r.onEmptyAdsToShow();
                    str = C20217u.f99970o;
                    str2 = "scheduleNativeAds - ads empty";
                } else {
                    if (obj instanceof C0098c) {
                        Adtima.m18328e(C20217u.f99970o, "scheduleNativeAds - adtima native");
                        C0098c c0098c = (C0098c) obj;
                        this.f99988r.onAdtimaNativeShow(c0098c);
                        Adtima.setCookies(c0098c.f512i0, c0098c.f544y0);
                        return;
                    }
                    if (!(obj instanceof C0099d)) {
                        return;
                    }
                    C0099d c0099d = (C0099d) obj;
                    if (!c0099d.f548b.equals("admob")) {
                        return;
                    }
                    this.f99988r.onGoogleNativeShow(c0099d);
                    str = C20217u.f99970o;
                    str2 = "scheduleNativeAds - admob";
                }
                Adtima.m18328e(str, str2);
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleNativeAds", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$b */
    /* loaded from: classes2.dex */
    public class b extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f99990p;

        /* renamed from: q */
        final /* synthetic */ String f99991q;

        /* renamed from: r */
        final /* synthetic */ String f99992r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC19746h f99993s;

        b(String str, String str2, String str3, InterfaceC19746h interfaceC19746h) {
            this.f99990p = str;
            this.f99991q = str2;
            this.f99992r = str3;
            this.f99993s = interfaceC19746h;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            C0098c c0098c = null;
            do {
                try {
                    Object m105547c0 = C20217u.this.m105547c0("native", this.f99990p, this.f99991q);
                    if (m105547c0 == null) {
                        break;
                    }
                    if (m105547c0 instanceof C0098c) {
                        C0098c c0098c2 = (C0098c) m105547c0;
                        c0098c2.f493Y = C20205i.m105364t().m105374k(c0098c2.f493Y, this.f99992r);
                        c0098c = c0098c2;
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(C20217u.f99970o, "scheduleVideoAds", e11);
                }
            } while (c0098c == null);
            return c0098c;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Object obj) {
            String str;
            String str2;
            try {
                if (obj == null) {
                    this.f99993s.onEmptyAdsToShow();
                    str = C20217u.f99970o;
                    str2 = "scheduleVideoAds - ads empty";
                } else {
                    if (!(obj instanceof C0098c)) {
                        return;
                    }
                    String str3 = ((C0098c) obj).f537v;
                    if (!str3.equals("video") && !str3.equals("rich")) {
                        this.f99993s.onEmptyAdsToShow();
                        str = C20217u.f99970o;
                        str2 = "scheduleMediaAds - unknown type";
                    }
                    this.f99993s.onAdtimaVideoShow((C0098c) obj);
                    str = C20217u.f99970o;
                    str2 = "scheduleVideoAds - adtima video";
                }
                Adtima.m18328e(str, str2);
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleVideoAds", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$c */
    /* loaded from: classes2.dex */
    public class c extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f99995p;

        /* renamed from: q */
        final /* synthetic */ String f99996q;

        /* renamed from: r */
        final /* synthetic */ String f99997r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC19739a f99998s;

        c(String str, String str2, String str3, InterfaceC19739a interfaceC19739a) {
            this.f99995p = str;
            this.f99996q = str2;
            this.f99997r = str3;
            this.f99998s = interfaceC19739a;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            C0098c c0098c = null;
            do {
                try {
                    Object m105547c0 = C20217u.this.m105547c0("native", this.f99995p, this.f99996q);
                    if (m105547c0 == null) {
                        break;
                    }
                    if (m105547c0 instanceof C0098c) {
                        C0098c c0098c2 = (C0098c) m105547c0;
                        c0098c2.f496a0 = C20205i.m105364t().m105374k(c0098c2.f496a0, this.f99997r);
                        c0098c = c0098c2;
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(C20217u.f99970o, "scheduleVideoAds", e11);
                }
            } while (c0098c == null);
            return c0098c;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Object obj) {
            String str;
            String str2;
            try {
                if (obj == null) {
                    this.f99998s.onEmptyAdsToShow();
                    str = C20217u.f99970o;
                    str2 = "scheduleVideoAds - ads empty";
                } else {
                    if (!(obj instanceof C0098c)) {
                        return;
                    }
                    if (((C0098c) obj).f537v.equals("audio")) {
                        this.f99998s.onAdtimaAudioShow((C0098c) obj);
                        str = C20217u.f99970o;
                        str2 = "scheduleVideoAds - adtima audio";
                    } else {
                        this.f99998s.onEmptyAdsToShow();
                        str = C20217u.f99970o;
                        str2 = "scheduleMediaAds - unknown type";
                    }
                }
                Adtima.m18328e(str, str2);
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleVideoAds", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$d */
    /* loaded from: classes2.dex */
    public class d extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f100000p;

        /* renamed from: q */
        final /* synthetic */ String f100001q;

        /* renamed from: r */
        final /* synthetic */ String f100002r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC19742d f100003s;

        d(String str, String str2, String str3, InterfaceC19742d interfaceC19742d) {
            this.f100000p = str;
            this.f100001q = str2;
            this.f100002r = str3;
            this.f100003s = interfaceC19742d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:56:0x0146, code lost:            if (r1.m123348h(p227i3.C20217u.this.f99972a) == false) goto L103;     */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0154 A[Catch: Exception -> 0x007a, TryCatch #0 {Exception -> 0x007a, blocks: (B:2:0x0000, B:4:0x0004, B:7:0x001b, B:9:0x0023, B:15:0x0060, B:18:0x0068, B:19:0x019e, B:22:0x007d, B:24:0x0081, B:25:0x0087, B:27:0x008f, B:30:0x00cc, B:32:0x00d2, B:33:0x014a, B:35:0x0154, B:37:0x015e, B:39:0x0162, B:41:0x016a, B:44:0x018a, B:45:0x0195, B:46:0x00da, B:48:0x00e4, B:50:0x00ee, B:52:0x00f8, B:55:0x013c), top: B:1:0x0000 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Object m105621a(Object obj) {
            String str;
            C20213q c20213q;
            C18710b c18710b;
            C18710b m105650c;
            try {
                if (!(obj instanceof C0098c)) {
                    return obj;
                }
                C0098c c0098c = (C0098c) obj;
                Adtima.setCookies(c0098c.f512i0, c0098c.f544y0);
                C18710b c18710b2 = null;
                if (c0098c.f497b.equals("ima")) {
                    if (!c0098c.f537v.equals("audio")) {
                        return obj;
                    }
                    C21977e m114777b = C21977e.m114777b();
                    String m105374k = C20205i.m105364t().m105374k(c0098c.f496a0, this.f100002r);
                    c0098c.f496a0 = m105374k;
                    C2503a c2503a = new C2503a();
                    c0098c.f498b0 = c2503a;
                    c2503a.f10199a = m114777b.m114778a(m105374k, C30267d.m149339A().m149362s(), C30267d.m149339A().m149347I(), String.valueOf(Adtima.mIsLat));
                    C21976d c21976d = c0098c.f498b0.f10199a;
                    if (c21976d != null && c21976d.m114776z()) {
                        c18710b = C20219w.m105646d().m105650c(c0098c.f537v);
                        c20213q = C20213q.m105480e();
                        str = this.f100000p;
                        return c20213q.m105484c(c0098c, c18710b, str);
                    }
                    return null;
                }
                if (AbstractC20202f.f99815i) {
                    c0098c = C20217u.this.m105599e(c0098c);
                }
                if (c0098c.f537v.equals("audio")) {
                    C21977e m114777b2 = C21977e.m114777b();
                    String m105374k2 = C20205i.m105364t().m105374k(c0098c.f496a0, this.f100002r);
                    c0098c.f496a0 = m105374k2;
                    C2503a c2503a2 = new C2503a();
                    c0098c.f498b0 = c2503a2;
                    c2503a2.f10199a = m114777b2.m114778a(m105374k2, C30267d.m149339A().m149362s(), C30267d.m149339A().m149347I(), String.valueOf(Adtima.mIsLat));
                    C21976d c21976d2 = c0098c.f498b0.f10199a;
                    if (c21976d2 != null) {
                        if (!c21976d2.m114776z()) {
                            Adtima.m18328e(C20217u.f99970o, "DAAST file invalid");
                        }
                        if (!c0098c.f537v.equals("html")) {
                            if (c0098c.f537v.equals("zalo")) {
                                String str2 = c0098c.f505f;
                                if (str2 == null || str2.length() == 0) {
                                    str2 = "default";
                                }
                                m105650c = C20219w.m105646d().m105650c(c0098c.f537v + "-" + str2);
                            } else {
                                m105650c = C20219w.m105646d().m105650c(c0098c.f537v);
                            }
                            c18710b2 = m105650c;
                        }
                        C20213q m105480e = C20213q.m105480e();
                        str = this.f100000p;
                        C18710b c18710b3 = c18710b2;
                        c20213q = m105480e;
                        c18710b = c18710b3;
                    }
                    return null;
                }
                if (c0098c.f537v.equals("video") || c0098c.f537v.equals("rich") || c0098c.f537v.equals("endcard")) {
                    C23499e m123360b = C23499e.m123360b();
                    c0098c.f493Y = C20205i.m105364t().m105374k(c0098c.f493Y, this.f100002r);
                    C2504b c2504b = new C2504b();
                    c0098c.f494Z = c2504b;
                    c2504b.f10200a = m123360b.m123361a(C20217u.this.f99972a, c0098c.f493Y, C30267d.m149339A().m149362s(), C30267d.m149339A().m149347I(), String.valueOf(Adtima.mIsLat));
                    C23498d c23498d = c0098c.f494Z.f10200a;
                    if (c23498d != null) {
                    }
                    return null;
                }
                if (!c0098c.f537v.equals("html")) {
                }
                C20213q m105480e2 = C20213q.m105480e();
                str = this.f100000p;
                C18710b c18710b32 = c18710b2;
                c20213q = m105480e2;
                c18710b = c18710b32;
                return c20213q.m105484c(c0098c, c18710b, str);
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleInterstitialAds", e11);
                return obj;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            Object obj = null;
            do {
                try {
                    obj = C20217u.this.m105547c0("interstitial", this.f100000p, this.f100001q);
                    if (obj == null) {
                        break;
                    }
                    obj = m105621a(obj);
                } catch (Exception e11) {
                    Adtima.m18329e(C20217u.f99970o, "scheduleInterstitialAds", e11);
                }
            } while (obj == null);
            return obj;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Object obj) {
            String str;
            String str2;
            try {
                if (obj == null) {
                    this.f100003s.onEmptyAdsToShow();
                    str = C20217u.f99970o;
                    str2 = "scheduleInterstitialAds - ads empty";
                } else {
                    if (!(obj instanceof C17719b)) {
                        if (obj instanceof C0099d) {
                            C0099d clone = ((C0099d) obj).clone();
                            this.f100003s.onNetworkInterstitialShow(clone);
                            Adtima.m18328e(C20217u.f99970o, "scheduleInterstitialAds - " + clone.f548b);
                            return;
                        }
                        return;
                    }
                    C17719b c17719b = (C17719b) obj;
                    if (c17719b.f89805a.f497b.equals("ima")) {
                        this.f100003s.onIMAAudioInterstitialShow(c17719b);
                        str = C20217u.f99970o;
                        str2 = "scheduleInterstitialAds - IMA Audio";
                    } else {
                        this.f100003s.onAdtimaInterstitialShow(c17719b);
                        str = C20217u.f99970o;
                        str2 = "scheduleInterstitialAds - adtima";
                    }
                }
                Adtima.m18328e(str, str2);
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleInterstitialAds", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$e */
    /* loaded from: classes2.dex */
    public class e extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f100005p;

        /* renamed from: q */
        final /* synthetic */ String f100006q;

        /* renamed from: r */
        final /* synthetic */ String f100007r;

        /* renamed from: s */
        final /* synthetic */ InterfaceC19741c f100008s;

        e(String str, String str2, String str3, InterfaceC19741c interfaceC19741c) {
            this.f100005p = str;
            this.f100006q = str2;
            this.f100007r = str3;
            this.f100008s = interfaceC19741c;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:            if (r1.m123348h(p227i3.C20217u.this.f99972a) == false) goto L48;     */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Object m105622a(Object obj) {
            try {
                if (!(obj instanceof C0098c)) {
                    return obj;
                }
                C0098c c0098c = (C0098c) obj;
                if (AbstractC20202f.f99815i) {
                    c0098c = C20217u.this.m105599e(c0098c);
                }
                if (c0098c.f537v.equals("incvideo")) {
                    C23499e m123360b = C23499e.m123360b();
                    c0098c.f493Y = C20205i.m105364t().m105374k(c0098c.f493Y, this.f100007r);
                    C2504b c2504b = new C2504b();
                    c0098c.f494Z = c2504b;
                    c2504b.f10200a = m123360b.m123361a(C20217u.this.f99972a, c0098c.f493Y, C30267d.m149339A().m149362s(), C30267d.m149339A().m149347I(), String.valueOf(Adtima.mIsLat));
                    C23498d c23498d = c0098c.f494Z.f10200a;
                    if (c23498d != null) {
                    }
                    return null;
                }
                String str = c0098c.f493Y;
                if (str == null || str.length() == 0) {
                    return obj;
                }
                return C20213q.m105480e().m105485d(c0098c, C20219w.m105646d().m105653g(c0098c.f537v), this.f100005p);
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleIncentivizedAds", e11);
                return obj;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            Object obj = null;
            do {
                try {
                    obj = C20217u.this.m105547c0("incentivized", this.f100005p, this.f100006q);
                    if (obj == null) {
                        break;
                    }
                    obj = m105622a(obj);
                } catch (Exception e11) {
                    Adtima.m18329e(C20217u.f99970o, "scheduleIncentivizedAds", e11);
                }
            } while (obj == null);
            return obj;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Object obj) {
            String str;
            String str2;
            try {
                if (obj == null) {
                    this.f100008s.onEmptyAdsToShow();
                    str = C20217u.f99970o;
                    str2 = "scheduleIncentivizedAds - ads empty";
                } else {
                    if (!(obj instanceof C17720c)) {
                        if (obj instanceof C0099d) {
                            C0099d clone = ((C0099d) obj).clone();
                            this.f100008s.onNetworkVideoRewardShow(clone);
                            Adtima.m18328e(C20217u.f99970o, "scheduleIncentivizedAds - " + clone.f548b);
                            return;
                        }
                        return;
                    }
                    C17720c c17720c = (C17720c) obj;
                    if (c17720c.f89808a.f537v.equals("incvideo")) {
                        this.f100008s.onAdtimaVideoRewardShow(c17720c);
                        str = C20217u.f99970o;
                        str2 = "scheduleIncentivizedAds - adtima video reward with graphic or native";
                    } else {
                        this.f100008s.onEmptyAdsToShow();
                        str = C20217u.f99970o;
                        str2 = "scheduleIncentivizedAds - Invalid condition, check config from server.";
                    }
                }
                Adtima.m18328e(str, str2);
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleIncentivizedAds", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$f */
    /* loaded from: classes2.dex */
    public class f extends AbstractRunnableC0008c {

        /* renamed from: p */
        long f100010p = System.currentTimeMillis();

        /* renamed from: q */
        long f100011q = 0;

        /* renamed from: r */
        long f100012r = 0;

        /* renamed from: s */
        final /* synthetic */ HashMap f100013s;

        /* renamed from: t */
        final /* synthetic */ HashMap f100014t;

        /* renamed from: u */
        final /* synthetic */ int f100015u;

        /* renamed from: v */
        final /* synthetic */ Bundle f100016v;

        /* renamed from: w */
        final /* synthetic */ ZAdsBundleListener f100017w;

        /* renamed from: x */
        final /* synthetic */ String f100018x;

        /* renamed from: y */
        final /* synthetic */ boolean f100019y;

        f(HashMap hashMap, HashMap hashMap2, int i11, Bundle bundle, ZAdsBundleListener zAdsBundleListener, String str, boolean z11) {
            this.f100013s = hashMap;
            this.f100014t = hashMap2;
            this.f100015u = i11;
            this.f100016v = bundle;
            this.f100017w = zAdsBundleListener;
            this.f100018x = str;
            this.f100019y = z11;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a */
        public Integer doInBackground() {
            HashMap hashMap;
            boolean z11;
            C20217u c20217u;
            ZAdsBundleListener zAdsBundleListener;
            HashMap hashMap2;
            JSONObject optJSONObject;
            int i11 = -2;
            try {
                hashMap = this.f100013s;
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "loadNativeAds", e11);
                C20217u.this.m105531F(this.f100017w, this.f100013s, this.f100018x, -2);
            }
            if (hashMap != null && hashMap.size() != 0) {
                HashMap hashMap3 = new HashMap();
                StringBuilder sb2 = new StringBuilder();
                for (String str : this.f100013s.keySet()) {
                    String str2 = (String) this.f100013s.get(str);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("zoneId", str);
                    jSONObject.put("adsType", str2);
                    hashMap3.put(str, str2);
                    if (sb2.toString().trim().length() != 0) {
                        sb2.append(",");
                    }
                    sb2.append(str);
                    sb2.append("|");
                    sb2.append(ZAdsAdMap.getValue(str2));
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    HashMap hashMap4 = this.f100014t;
                    if (hashMap4 != null) {
                        for (String str3 : hashMap4.keySet()) {
                            Object obj = this.f100014t.get(str3);
                            if (obj != null) {
                                jSONObject2.put(str3, String.valueOf(obj));
                            }
                        }
                    }
                } catch (Exception e12) {
                    Adtima.m18328e(C20217u.f99970o, "Build ad config map " + e12.toString());
                }
                String m105556j = C20217u.this.m105556j(this.f100015u, sb2.toString(), this.f100016v, jSONObject2, null, 0);
                if ((m105556j == null || C20210n.m105453a().m105456d()) && AbstractC19207b.m100801g(C20217u.this.f99972a)) {
                    m105556j = C30265b.m149329k().m149330f(hashMap3);
                    Adtima.m18330p(C20217u.f99970o, "BACKUP: Get ad from server failed, try from backup ad");
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (m105556j != null && m105556j.length() != 0) {
                    if (!AbstractC22011d.m114918s(m105556j)) {
                        m105556j = C20217u.this.m105605m(m105556j);
                    }
                    JSONObject jSONObject3 = new JSONObject(m105556j);
                    if (jSONObject3.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, -1) != 0) {
                        C20210n.m105453a().m105454b(true);
                        c20217u = C20217u.this;
                        zAdsBundleListener = this.f100017w;
                        hashMap2 = this.f100013s;
                        c20217u.m105531F(zAdsBundleListener, hashMap2, this.f100018x, -2);
                        return Integer.valueOf(i11);
                    }
                    i11 = C20217u.this.m105545b(jSONObject3.optJSONObject("data"), this.f100013s, (this.f100013s.size() <= 1 || !jSONObject2.get(ZAdsBundle.ALLOW_DUPLICATE).equals("false") || (optJSONObject = jSONObject3.optJSONObject("ext")) == null) ? null : optJSONObject.optString("servingToken"), this.f100018x, "", "", this.f100019y, this.f100017w, z11);
                    return Integer.valueOf(i11);
                }
                c20217u = C20217u.this;
                zAdsBundleListener = this.f100017w;
                hashMap2 = this.f100013s;
                c20217u.m105531F(zAdsBundleListener, hashMap2, this.f100018x, -2);
                return Integer.valueOf(i11);
            }
            i11 = 0;
            return Integer.valueOf(i11);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f100011q = currentTimeMillis;
            this.f100012r = currentTimeMillis - this.f100010p;
            Adtima.m18328e(C20217u.f99970o, "ADTIMA-LOG : Bundle - Tag : " + this.f100018x + " => Start : " + this.f100010p + " - End : " + this.f100011q + " - Duration : " + this.f100012r + "ms");
            if (num.intValue() == 0) {
                this.f100017w.onAdsFetchFinished();
            } else {
                this.f100017w.onAdsFetchFailed(num.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$g */
    /* loaded from: classes2.dex */
    public class g extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f100021p;

        /* renamed from: q */
        final /* synthetic */ String f100022q;

        /* renamed from: r */
        final /* synthetic */ String f100023r;

        /* renamed from: s */
        final /* synthetic */ String f100024s;

        /* renamed from: t */
        final /* synthetic */ int f100025t;

        /* renamed from: u */
        final /* synthetic */ int f100026u;

        /* renamed from: v */
        final /* synthetic */ Bundle f100027v;

        /* renamed from: w */
        final /* synthetic */ String f100028w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC19745g f100029x;

        g(String str, String str2, String str3, String str4, int i11, int i12, Bundle bundle, String str5, InterfaceC19745g interfaceC19745g) {
            this.f100021p = str;
            this.f100022q = str2;
            this.f100023r = str3;
            this.f100024s = str4;
            this.f100025t = i11;
            this.f100026u = i12;
            this.f100027v = bundle;
            this.f100028w = str5;
            this.f100029x = interfaceC19745g;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a */
        public Integer doInBackground() {
            boolean z11;
            JSONObject optJSONObject;
            ArrayList arrayList;
            int i11 = -2;
            try {
                if (C20217u.this.f99974c) {
                    i11 = -5;
                } else if (C20217u.this.f99973b) {
                    C0101f m109390e = C20911b.m109386a().m109390e(this.f100021p, this.f100022q, this.f100023r);
                    if (m109390e == null || (arrayList = m109390e.f575a) == null || arrayList.size() == 0 || !AbstractC19207b.m100801g(C20217u.this.f99972a)) {
                        String str = this.f100024s;
                        if (str == null || str.length() == 0) {
                            String m105662e = C20221y.m105659d().m105662e(this.f100022q, this.f100023r);
                            String str2 = C20217u.f99970o;
                            Adtima.m18328e(str2, "|");
                            Adtima.m18328e(str2, "retry: " + this.f100025t);
                            Adtima.m18328e(str2, "servingToken: " + m105662e);
                            C20221y.m105659d().m105660b(this.f100022q, this.f100023r);
                            HashMap hashMap = new HashMap();
                            hashMap.put(this.f100022q, this.f100021p);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(this.f100022q, this.f100021p);
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put(ZAdsBundle.ALLOW_DUPLICATE, Boolean.TRUE);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                for (String str3 : hashMap3.keySet()) {
                                    Object obj = hashMap3.get(str3);
                                    if (obj != null) {
                                        jSONObject.put(str3, String.valueOf(obj));
                                    }
                                }
                            } catch (Exception e11) {
                                Adtima.m18328e(C20217u.f99970o, "Build ad config map " + e11);
                            }
                            String m105556j = C20217u.this.m105556j(this.f100026u, this.f100022q + "|" + ZAdsAdMap.getValue(this.f100021p), this.f100027v, jSONObject, m105662e, this.f100025t);
                            if ((m105556j == null || C20210n.m105453a().m105456d()) && AbstractC19207b.m100801g(C20217u.this.f99972a)) {
                                m105556j = C30265b.m149329k().m149330f(hashMap2);
                                Adtima.m18330p(C20217u.f99970o, "BACKUP: Get ad from server failed, try from backup ad");
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (m105556j != null && m105556j.length() != 0) {
                                if (!AbstractC22011d.m114918s(m105556j)) {
                                    m105556j = C20217u.this.m105605m(m105556j);
                                }
                                JSONObject jSONObject2 = new JSONObject(m105556j);
                                int optInt = jSONObject2.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, -1);
                                if (optInt == 0) {
                                    i11 = C20217u.this.m105545b(jSONObject2.optJSONObject("data"), hashMap, (this.f100025t >= AbstractC20202f.f99809f || (optJSONObject = jSONObject2.optJSONObject("ext")) == null) ? null : optJSONObject.optString("servingToken"), this.f100023r, this.f100028w, this.f100024s, false, null, z11);
                                } else if (optInt == 1) {
                                    i11 = -7;
                                } else {
                                    C20210n.m105453a().m105454b(true);
                                }
                            }
                        } else {
                            i11 = -4;
                        }
                    } else {
                        C20217u.this.m105527C(m109390e, this.f100024s);
                        C20911b.m109386a().m109387b(this.f100021p, this.f100022q, this.f100023r, m109390e);
                        i11 = 1;
                    }
                } else {
                    i11 = -1;
                }
            } catch (Exception e12) {
                Adtima.m18329e(C20217u.f99970o, "loadNativeAds", e12);
            }
            return Integer.valueOf(i11);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                this.f100029x.onAdsLoadFinished(false);
            } else if (num.intValue() == 1) {
                this.f100029x.onAdsLoadFinished(true);
            } else {
                this.f100029x.onAdsLoadFailed(num.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$h */
    /* loaded from: classes2.dex */
    public class h extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f100031p;

        /* renamed from: q */
        final /* synthetic */ String f100032q;

        /* renamed from: r */
        final /* synthetic */ String f100033r;

        /* renamed from: s */
        final /* synthetic */ String f100034s;

        /* renamed from: t */
        final /* synthetic */ int f100035t;

        /* renamed from: u */
        final /* synthetic */ Bundle f100036u;

        /* renamed from: v */
        final /* synthetic */ int f100037v;

        /* renamed from: w */
        final /* synthetic */ String f100038w;

        /* renamed from: x */
        final /* synthetic */ InterfaceC19745g f100039x;

        h(String str, String str2, String str3, String str4, int i11, Bundle bundle, int i12, String str5, InterfaceC19745g interfaceC19745g) {
            this.f100031p = str;
            this.f100032q = str2;
            this.f100033r = str3;
            this.f100034s = str4;
            this.f100035t = i11;
            this.f100036u = bundle;
            this.f100037v = i12;
            this.f100038w = str5;
            this.f100039x = interfaceC19745g;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a */
        public Integer doInBackground() {
            boolean z11;
            JSONObject optJSONObject;
            ArrayList arrayList;
            int i11 = -2;
            try {
                C30267d.m149339A().m149345G();
                String m105380x = C20205i.m105364t().m105380x();
                Adtima.m18328e(C20217u.f99970o, "DEVICE ID: " + m105380x);
                C0097b m105518m = C20215s.m105509k().m105518m();
                C0097b m105519n = C20215s.m105509k().m105519n();
                if (m105518m == null && m105519n == null) {
                    i11 = -1;
                } else {
                    try {
                        C20217u.this.f99975d = C30267d.m149339A().m149348e(C20217u.this.f99972a);
                        if (m105518m != null) {
                            C30270g.m149382e(C20217u.this.f99972a).m149383f(m105518m);
                            C20219w.m105646d().m105651e(m105518m);
                        } else {
                            C20219w.m105646d().m105651e(m105519n);
                        }
                        AbstractC2472a.m12487b(C20217u.this.f99972a, false, AbstractC20202f.f99829p);
                    } catch (Exception e11) {
                        Adtima.m18329e(C20217u.f99970o, "loadPriorityBannerAds", e11);
                    }
                    C0101f m109390e = C20911b.m109386a().m109390e(this.f100031p, this.f100032q, this.f100033r);
                    if (m109390e == null || (arrayList = m109390e.f575a) == null || arrayList.size() == 0 || !AbstractC19207b.m100801g(C20217u.this.f99972a)) {
                        String str = this.f100034s;
                        if (str == null || str.length() == 0) {
                            String m105662e = C20221y.m105659d().m105662e(this.f100032q, this.f100033r);
                            C20221y.m105659d().m105660b(this.f100032q, this.f100033r);
                            HashMap hashMap = new HashMap();
                            hashMap.put(this.f100032q, this.f100031p);
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put(this.f100032q, this.f100031p);
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put(ZAdsBundle.ALLOW_DUPLICATE, Boolean.TRUE);
                            JSONObject jSONObject = new JSONObject();
                            try {
                                for (String str2 : hashMap3.keySet()) {
                                    Object obj = hashMap3.get(str2);
                                    if (obj != null) {
                                        jSONObject.put(str2, String.valueOf(obj));
                                    }
                                }
                            } catch (Exception e12) {
                                Adtima.m18328e(C20217u.f99970o, "Build ad config map " + e12.toString());
                            }
                            String m105556j = C20217u.this.m105556j(this.f100035t, this.f100032q + "|" + ZAdsAdMap.getValue(this.f100031p), this.f100036u, jSONObject, m105662e, this.f100037v);
                            if ((m105556j == null || C20210n.m105453a().m105456d()) && AbstractC19207b.m100801g(C20217u.this.f99972a)) {
                                m105556j = C30265b.m149329k().m149330f(hashMap2);
                                Adtima.m18330p(C20217u.f99970o, "BACKUP: Get ad from server failed, try from backup ad");
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (m105556j != null && m105556j.length() != 0) {
                                if (!AbstractC22011d.m114918s(m105556j)) {
                                    m105556j = C20217u.this.m105605m(m105556j);
                                }
                                JSONObject jSONObject2 = new JSONObject(m105556j);
                                int optInt = jSONObject2.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, -1);
                                if (optInt == 0) {
                                    i11 = C20217u.this.m105545b(jSONObject2.optJSONObject("data"), hashMap, (this.f100037v >= AbstractC20202f.f99809f || (optJSONObject = jSONObject2.optJSONObject("ext")) == null) ? null : optJSONObject.optString("servingToken"), this.f100033r, this.f100038w, this.f100034s, false, null, z11);
                                } else if (optInt == 1) {
                                    i11 = -7;
                                } else {
                                    C20210n.m105453a().m105454b(true);
                                }
                            }
                        } else {
                            i11 = -4;
                        }
                    } else {
                        C20217u.this.m105527C(m109390e, this.f100034s);
                        C20911b.m109386a().m109387b(this.f100031p, this.f100032q, this.f100033r, m109390e);
                        i11 = 1;
                    }
                }
            } catch (Exception e13) {
                Adtima.m18329e(C20217u.f99970o, "loadNativeAds", e13);
            }
            return Integer.valueOf(i11);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                this.f100039x.onAdsLoadFinished(false);
            } else if (num.intValue() == 1) {
                this.f100039x.onAdsLoadFinished(true);
            } else {
                this.f100039x.onAdsLoadFailed(num.intValue());
            }
        }
    }

    /* renamed from: i3.u$i */
    /* loaded from: classes2.dex */
    public class i extends AbstractRunnableC0008c {
        i(C20217u c20217u) {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            if (!C20199c.m105336g().m105346l()) {
                return null;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putString("siteId", "0");
                C20214r.m105487b().m105501m("https://api.adtimaserver.vn/mobad/getAds", bundle, 2);
                C20214r.m105487b().m105501m("https://api.adtimaserver.vn/mobad/getConfig", bundle, 2);
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "doFakeRequest", e11);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$j */
    /* loaded from: classes2.dex */
    public class j extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f100041p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC19745g f100042q;

        j(String str, InterfaceC19745g interfaceC19745g) {
            this.f100041p = str;
            this.f100042q = interfaceC19745g;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a */
        public C18192c doInBackground() {
            try {
                String m105505t = C20214r.m105487b().m105505t(this.f100041p, null, 2);
                if (m105505t != null && m105505t.length() != 0) {
                    if (!AbstractC22011d.m114918s(m105505t)) {
                        m105505t = C20217u.this.m105605m(m105505t);
                    }
                    JSONObject jSONObject = new JSONObject(m105505t);
                    int optInt = jSONObject.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, -1);
                    if (optInt == 0) {
                        return C18192c.m96956d(jSONObject.optJSONObject("data"));
                    }
                    if (optInt == 1) {
                        return null;
                    }
                    C20210n.m105453a().m105454b(true);
                    return null;
                }
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "loadScenario", e11);
                return null;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b */
        public void onPostExecute(C18192c c18192c) {
            if (c18192c == null) {
                this.f100042q.onAdsLoadFailed(-2);
            } else {
                C20217u.this.f99979h = c18192c;
                this.f100042q.onAdsLoadFinished(false);
            }
        }
    }

    /* renamed from: i3.u$k */
    /* loaded from: classes2.dex */
    public class k extends AbstractRunnableC0008c {
        k() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            JSONObject optJSONObject;
            try {
                Bundle bundle = new Bundle();
                String jSONObject = C20205i.m105364t().m105379u().toString();
                String encodeToString = Base64.encodeToString(C20203g.m105349d().m105352b(), 0);
                String str = C20217u.f99970o;
                Adtima.m18328e(str, "rKey: " + encodeToString);
                String m105351a = C20203g.m105349d().m105351a(jSONObject, encodeToString);
                Adtima.m18328e(str, "edi: " + m105351a);
                String m105355b = C20204h.m105354a().m105355b(encodeToString);
                Adtima.m18328e(str, "smKey: " + m105355b);
                bundle.putString("edi", m105351a);
                bundle.putString("smkey", m105355b);
                bundle.putString("deviceId", C20205i.m105364t().m105380x());
                String m105504s = C20214r.m105487b().m105504s(AbstractC20206j.m105385a(), bundle, 2);
                if (m105504s != null && m105504s.length() != 0) {
                    JSONObject jSONObject2 = new JSONObject(m105504s);
                    if (jSONObject2.optInt(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, -1) == 0 && (optJSONObject = jSONObject2.optJSONObject("data")) != null) {
                        String optString = optJSONObject.optString("sssx", null);
                        Adtima.m18328e(str, "aId: " + optString);
                        long optLong = optJSONObject.optLong("zwqcuziqf", 0L);
                        Adtima.m18328e(str, "expiredTime: " + optLong);
                        if (optString != null) {
                            C20217u.this.f99985n = optString;
                            C20205i.m105364t().m105375m(C20217u.this.m105546c(optLong) + "|" + AbstractC20198b.m105331g(optString, true).substring(2));
                        }
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "getAdId", e11);
            }
            return null;
        }
    }

    /* renamed from: i3.u$l */
    /* loaded from: classes2.dex */
    public class l extends AbstractRunnableC0008c {
        l() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            if (!AbstractC22011d.m114913n(C20217u.this.f99972a)) {
                return null;
            }
            try {
                C20199c.m105336g().m105347m();
                C20199c.m105336g().m105342e("https://api.adtimaserver.vn/mobad/", false);
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "doReportTask", e11);
                return null;
            }
        }
    }

    /* renamed from: i3.u$m */
    /* loaded from: classes2.dex */
    public class m extends AbstractRunnableC0008c {
        m() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            if (!AbstractC22011d.m114913n(C20217u.this.f99972a)) {
                return null;
            }
            C20212p.m105468m().m105477p();
            return null;
        }
    }

    /* renamed from: i3.u$n */
    /* loaded from: classes2.dex */
    public class n extends AbstractRunnableC0008c {
        n(C20217u c20217u) {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            try {
                C30265b.m149329k().m149333i();
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "doResetBackup", e11);
                return null;
            }
        }
    }

    /* renamed from: i3.u$o */
    /* loaded from: classes2.dex */
    public class o extends AbstractRunnableC0008c {
        o() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            try {
                if (!AbstractC22011d.m114913n(C20217u.this.f99972a) || !C20205i.m105364t().m105373j()) {
                    return null;
                }
                C20217u.this.m105539R0();
                return null;
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "doCheckAdtimaId", e11);
                return null;
            }
        }
    }

    /* renamed from: i3.u$p */
    /* loaded from: classes2.dex */
    public class p extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ int f100048p;

        p(int i11) {
            this.f100048p = i11;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01e0 A[Catch: Exception -> 0x01d2, TRY_LEAVE, TryCatch #3 {Exception -> 0x01d2, blocks: (B:32:0x019c, B:34:0x01b7, B:36:0x01cc, B:37:0x01d4, B:39:0x01e0), top: B:31:0x019c, outer: #0 }] */
        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Boolean doInBackground() {
            boolean z11;
            int m149345G;
            String str;
            C0097b m105518m;
            C0097b m105510a;
            StringBuilder sb2;
            boolean z12 = false;
            try {
                z11 = true;
                C20217u.this.f99974c = true;
                m149345G = C30267d.m149339A().m149345G();
                String m105380x = C20205i.m105364t().m105380x();
                str = C20217u.f99970o;
                Adtima.m18328e(str, "DEVICE ID: " + m105380x);
                Adtima.m18328e(str, "sdkVerCache: " + m149345G + " | sdkVer: " + this.f100048p);
                m105518m = C20215s.m105509k().m105518m();
                C20215s m105509k = C20215s.m105509k();
                if (m105380x == null) {
                    m105380x = "";
                }
                m105510a = m105509k.m105510a(m105380x, this.f100048p, m105518m == null ? 1 : m105518m.f460a, C20217u.this.f99975d == null ? "" : C20217u.this.f99975d);
                try {
                } catch (Exception e11) {
                    e = e11;
                    z12 = z11;
                }
            } catch (Exception e12) {
                e = e12;
            }
            if (C20215s.m105509k().m105514g(m105518m)) {
                boolean m105515h = C20215s.m105509k().m105515h(m105518m, m105510a);
                if (m149345G != this.f100048p || m105515h) {
                    if (C20217u.this.f99982k) {
                        C20217u.this.f99982k = false;
                        if (m105518m != null) {
                            C20217u.this.f99976e = C20215s.m105509k().m105511b(m149345G, m105518m);
                            Adtima.m18328e(str, "mOldFolderName: " + C20217u.this.f99976e);
                            C30270g.m149382e(C20217u.this.f99972a).m149383f(m105518m);
                        }
                        z11 = C20215s.m105509k().m105517l(m105510a);
                        if (z11) {
                            C19212g.f95661h = C19212g.f95659f;
                            C19212g.f95657d = 0;
                            Adtima.SDK_VERSION_CODE = Adtima.SDK_DOWNLOAD_VERSION_CODE;
                            Adtima.m18328e(str, "New ZAdsStoragePath: " + C19212g.f95658e);
                            sb2 = new StringBuilder();
                            sb2.append("ZAD_SDK donwload_time: ");
                            sb2.append(System.currentTimeMillis() - C20217u.this.f99983l);
                            Adtima.m18328e(str, sb2.toString());
                        }
                    } else {
                        try {
                            C20217u.this.f99982k = true;
                            Adtima.SDK_VERSION_CODE = m149345G;
                            C20217u.this.m105540S0();
                        } catch (Exception e13) {
                            e = e13;
                            z12 = true;
                            Adtima.m18329e(C20217u.f99970o, "initSdk", e);
                            z11 = z12;
                            return Boolean.valueOf(z11);
                        }
                    }
                }
                if (z11) {
                    try {
                        C30267d.m149339A().m149342D(C20217u.this.f99975d);
                        if (C20217u.this.f99982k) {
                            C30267d.m149339A().m149349f(m149345G);
                        } else {
                            C30267d.m149339A().m149349f(this.f100048p);
                        }
                        C20219w.m105646d().m105654h();
                        AbstractC2472a.m12487b(C20217u.this.f99972a, false, AbstractC20202f.f99829p);
                    } catch (Exception e14) {
                        Adtima.m18329e(C20217u.f99970o, "initSdk", e14);
                    }
                }
                try {
                    C19212g.m100811q().m100814b();
                    C20205i.m105364t();
                    Adtima.updateSupportNetwork();
                    if (C30267d.m149339A().m149346H() > 0 && System.currentTimeMillis() - C30267d.m149339A().m149346H() > 86400000) {
                        C20217u.this.m105613u0();
                    }
                    if (!C20217u.this.f99976e.equals("")) {
                        C30267d.m149339A().m149340B(C20217u.this.f99976e);
                        C30267d.m149339A().m149352i(System.currentTimeMillis());
                    }
                } catch (Exception e15) {
                    Adtima.m18329e(C20217u.f99970o, "initSdk", e15);
                }
                return Boolean.valueOf(z11);
            }
            if (m149345G != this.f100048p && (z11 = C20215s.m105509k().m105517l(m105510a))) {
                C19212g.f95661h = C19212g.f95659f;
                C19212g.f95657d = 0;
                sb2 = new StringBuilder();
                sb2.append("New ZAdsStoragePath: ");
                sb2.append(C19212g.f95658e);
                Adtima.m18328e(str, sb2.toString());
            }
            if (z11) {
            }
            C19212g.m100811q().m100814b();
            C20205i.m105364t();
            Adtima.updateSupportNetwork();
            if (C30267d.m149339A().m149346H() > 0) {
                C20217u.this.m105613u0();
            }
            if (!C20217u.this.f99976e.equals("")) {
            }
            return Boolean.valueOf(z11);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    C20217u.this.f99973b = true;
                    Adtima.m18328e(C20217u.f99970o, "ZAD_SDK init_time: " + (System.currentTimeMillis() - C20217u.this.f99983l));
                }
                if (AbstractC20202f.f99835s) {
                    C20209m.m105408c(C20217u.this.f99972a).m105421o();
                }
                C20217u.this.f99974c = false;
                C20207k.m105398c(C20217u.this.f99972a).m105401e(this.f100048p, null);
                if (AbstractC20202f.f99796X.equals(AbstractC20202f.f99795W)) {
                    C20211o.m105458b(C20217u.this.f99972a).m105461e();
                }
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "initSdk", e11);
            }
        }
    }

    /* renamed from: i3.u$q */
    /* loaded from: classes2.dex */
    public class q implements Runnable {
        q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Adtima.m18328e(C20217u.f99970o, "scheduleInitSDK - RUN");
                C20217u.this.f99973b = false;
                C20217u.this.m105607o(67);
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleInitSDK", e11);
            }
        }
    }

    /* renamed from: i3.u$r */
    /* loaded from: classes2.dex */
    public class r extends AbstractRunnableC0008c {
        r(C20217u c20217u) {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: a */
        public Boolean doInBackground() {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                try {
                    String str = C20217u.f99970o;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("deleteTemplateCache - retry delete #");
                    i11++;
                    sb2.append(i11);
                    Adtima.m18328e(str, sb2.toString());
                    if (C19212g.m100811q().m100816d()) {
                        z11 = true;
                        break;
                    }
                    if (i11 >= 4) {
                        break;
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(C20217u.f99970o, "initSdk", e11);
                }
            }
            return Boolean.valueOf(z11);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        /* renamed from: b */
        public void onPostExecute(Boolean bool) {
            try {
                if (bool.booleanValue()) {
                    C30267d.m149339A().m149340B("");
                    C30267d.m149339A().m149352i(0L);
                }
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "initSdk", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.u$s */
    /* loaded from: classes2.dex */
    public class s extends AbstractRunnableC0008c {

        /* renamed from: p */
        final /* synthetic */ String f100051p;

        /* renamed from: q */
        final /* synthetic */ String f100052q;

        /* renamed from: r */
        final /* synthetic */ boolean f100053r;

        /* renamed from: s */
        final /* synthetic */ String f100054s;

        /* renamed from: t */
        final /* synthetic */ ZAdsBannerSize f100055t;

        /* renamed from: u */
        final /* synthetic */ boolean f100056u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC19740b f100057v;

        s(String str, String str2, boolean z11, String str3, ZAdsBannerSize zAdsBannerSize, boolean z12, InterfaceC19740b interfaceC19740b) {
            this.f100051p = str;
            this.f100052q = str2;
            this.f100053r = z11;
            this.f100054s = str3;
            this.f100055t = zAdsBannerSize;
            this.f100056u = z12;
            this.f100057v = interfaceC19740b;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x001b, B:10:0x001f, B:13:0x002d, B:15:0x0035, B:22:0x008c, B:25:0x0094, B:27:0x009e, B:29:0x00a8, B:31:0x00ae, B:32:0x00b1, B:33:0x00bd, B:34:0x00e9, B:35:0x00c0, B:37:0x00c8, B:39:0x00d2, B:41:0x00d8, B:42:0x00dc, B:43:0x0178, B:45:0x0182, B:47:0x018c, B:49:0x0191, B:51:0x019f, B:54:0x0233, B:55:0x0237, B:56:0x02b4, B:58:0x01ad, B:59:0x01b0, B:61:0x01b4, B:63:0x01bc, B:65:0x01e1, B:67:0x01e5, B:69:0x01f3, B:71:0x0205, B:72:0x020d, B:74:0x0215, B:75:0x021f, B:76:0x022d, B:77:0x0222, B:79:0x00ef, B:81:0x00f9, B:83:0x0103, B:85:0x010d, B:88:0x016a, B:91:0x0027, B:92:0x023b, B:94:0x0245, B:96:0x024d, B:99:0x0289, B:101:0x0291, B:103:0x0295, B:105:0x029f, B:106:0x0299), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0182 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x001b, B:10:0x001f, B:13:0x002d, B:15:0x0035, B:22:0x008c, B:25:0x0094, B:27:0x009e, B:29:0x00a8, B:31:0x00ae, B:32:0x00b1, B:33:0x00bd, B:34:0x00e9, B:35:0x00c0, B:37:0x00c8, B:39:0x00d2, B:41:0x00d8, B:42:0x00dc, B:43:0x0178, B:45:0x0182, B:47:0x018c, B:49:0x0191, B:51:0x019f, B:54:0x0233, B:55:0x0237, B:56:0x02b4, B:58:0x01ad, B:59:0x01b0, B:61:0x01b4, B:63:0x01bc, B:65:0x01e1, B:67:0x01e5, B:69:0x01f3, B:71:0x0205, B:72:0x020d, B:74:0x0215, B:75:0x021f, B:76:0x022d, B:77:0x0222, B:79:0x00ef, B:81:0x00f9, B:83:0x0103, B:85:0x010d, B:88:0x016a, B:91:0x0027, B:92:0x023b, B:94:0x0245, B:96:0x024d, B:99:0x0289, B:101:0x0291, B:103:0x0295, B:105:0x029f, B:106:0x0299), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00ef A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x001b, B:10:0x001f, B:13:0x002d, B:15:0x0035, B:22:0x008c, B:25:0x0094, B:27:0x009e, B:29:0x00a8, B:31:0x00ae, B:32:0x00b1, B:33:0x00bd, B:34:0x00e9, B:35:0x00c0, B:37:0x00c8, B:39:0x00d2, B:41:0x00d8, B:42:0x00dc, B:43:0x0178, B:45:0x0182, B:47:0x018c, B:49:0x0191, B:51:0x019f, B:54:0x0233, B:55:0x0237, B:56:0x02b4, B:58:0x01ad, B:59:0x01b0, B:61:0x01b4, B:63:0x01bc, B:65:0x01e1, B:67:0x01e5, B:69:0x01f3, B:71:0x0205, B:72:0x020d, B:74:0x0215, B:75:0x021f, B:76:0x022d, B:77:0x0222, B:79:0x00ef, B:81:0x00f9, B:83:0x0103, B:85:0x010d, B:88:0x016a, B:91:0x0027, B:92:0x023b, B:94:0x0245, B:96:0x024d, B:99:0x0289, B:101:0x0291, B:103:0x0295, B:105:0x029f, B:106:0x0299), top: B:2:0x0001 }] */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Object m105635a(Object obj) {
            C18709a m105649b;
            C20213q m105480e;
            C20219w m105646d;
            String zAdsBannerSize;
            String m114749a;
            List m114768r;
            try {
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleBannerAds", e11);
            }
            if (!(obj instanceof C0098c)) {
                return obj;
            }
            C0098c c0098c = (C0098c) obj;
            Adtima.setCookies(c0098c.f512i0, c0098c.f544y0);
            if (!c0098c.f497b.equals("adtima")) {
                if (!c0098c.f497b.equals("ima") || !c0098c.f537v.equals("audio")) {
                    return obj;
                }
                C21977e m114777b = C21977e.m114777b();
                String m105374k = C20205i.m105364t().m105374k(c0098c.f496a0, this.f100054s);
                c0098c.f496a0 = m105374k;
                C2503a c2503a = new C2503a();
                c0098c.f498b0 = c2503a;
                c2503a.f10199a = m114777b.m114778a(m105374k, C30267d.m149339A().m149362s(), C30267d.m149339A().m149347I(), String.valueOf(Adtima.mIsLat));
                C21976d c21976d = c0098c.f498b0.f10199a;
                if (c21976d != null && c21976d.m114776z()) {
                    if (AbstractC20202f.f99815i || this.f100053r) {
                        c0098c = C20217u.this.m105599e(c0098c);
                    }
                    m105649b = C20219w.m105646d().m105649b(ZAdsBannerSize.toString(this.f100055t), c0098c.f537v);
                    m105480e = C20213q.m105480e();
                    return m105480e.m105482a(c0098c, m105649b, this.f100055t, true);
                }
                return null;
            }
            if (!AbstractC20202f.f99815i) {
                if (this.f100053r) {
                }
                if (!c0098c.f537v.equals("audio")) {
                    C21977e m114777b2 = C21977e.m114777b();
                    c0098c.f496a0 = C20205i.m105364t().m105374k(c0098c.f496a0, this.f100054s);
                    Adtima.m18328e(C20217u.f99970o, "DAAST: " + c0098c.f496a0);
                    C2503a c2503a2 = new C2503a();
                    c0098c.f498b0 = c2503a2;
                    c2503a2.f10199a = m114777b2.m114778a(c0098c.f496a0, C30267d.m149339A().m149362s(), C30267d.m149339A().m149347I(), String.valueOf(Adtima.mIsLat));
                    C21976d c21976d2 = c0098c.f498b0.f10199a;
                    if (c21976d2 != null && c21976d2.m114776z()) {
                        if (TextUtils.isEmpty(c0098c.f499c)) {
                            String m114775y = c0098c.f498b0.f10199a.m114775y();
                            if (m114775y == null || m114775y.length() == 0) {
                                m114749a = AbstractC21974b.m114749a(1001);
                                m114768r = c0098c.f498b0.f10199a.m114768r();
                                C20217u.this.m105594V(m114749a, m114768r);
                                return null;
                            }
                            c0098c.f499c = m114775y;
                        }
                        if (TextUtils.isEmpty(c0098c.f501d)) {
                            String m114762l = c0098c.f498b0.f10199a.m114762l();
                            if (m114762l == null || m114762l.length() == 0) {
                                m114749a = AbstractC21974b.m114749a(1001);
                                m114768r = c0098c.f498b0.f10199a.m114768r();
                                C20217u.this.m105594V(m114749a, m114768r);
                                return null;
                            }
                            c0098c.f501d = m114762l;
                        }
                        if (!c0098c.f537v.equals("html")) {
                            m105649b = null;
                        } else if (c0098c.f537v.equals("zalo")) {
                            if (c0098c.f528q0 != -1 && ZAdsBannerSize.toString(this.f100055t).equals("medium")) {
                                m105649b = C20219w.m105646d().m105648a(c0098c.f528q0);
                                if (m105649b == null) {
                                    c0098c.f528q0 = 0;
                                }
                            }
                            String str = c0098c.f505f;
                            if (str == null || str.length() == 0) {
                                str = "default";
                            }
                            m105649b = C20219w.m105646d().m105649b(ZAdsBannerSize.toString(this.f100055t), c0098c.f537v + "-" + str);
                        } else {
                            if (this.f100056u && ZAdsBannerSize.toString(this.f100055t).equals("fullpage")) {
                                m105649b = C20219w.m105646d().m105652f(ZAdsBannerSize.toString(this.f100055t), c0098c.f537v);
                                if (m105649b != null) {
                                    C20215s.m105509k().m105516i();
                                } else if (C20217u.this.f99973b) {
                                    m105646d = C20219w.m105646d();
                                    zAdsBannerSize = ZAdsBannerSize.toString(this.f100055t);
                                }
                            } else {
                                m105646d = C20219w.m105646d();
                                zAdsBannerSize = ZAdsBannerSize.toString(this.f100055t);
                            }
                            m105649b = m105646d.m105649b(zAdsBannerSize, c0098c.f537v);
                        }
                        m105480e = C20213q.m105480e();
                    }
                    return null;
                }
                if (c0098c.f537v.equals("video") || c0098c.f537v.equals("rich") || c0098c.f537v.equals("endcard")) {
                    C23499e m123360b = C23499e.m123360b();
                    c0098c.f493Y = C20205i.m105364t().m105374k(c0098c.f493Y, this.f100054s);
                    Adtima.m18328e(C20217u.f99970o, "VAST: " + c0098c.f493Y);
                    C2504b c2504b = new C2504b();
                    c0098c.f494Z = c2504b;
                    c2504b.f10200a = m123360b.m123361a(C20217u.this.f99972a, c0098c.f493Y, C30267d.m149339A().m149362s(), C30267d.m149339A().m149347I(), String.valueOf(Adtima.mIsLat));
                    C23498d c23498d = c0098c.f494Z.f10200a;
                    if (c23498d != null) {
                        if (!c23498d.m123348h(C20217u.this.f99972a)) {
                        }
                    }
                    return null;
                }
                if (!c0098c.f537v.equals("html")) {
                }
                m105480e = C20213q.m105480e();
                return m105480e.m105482a(c0098c, m105649b, this.f100055t, true);
            }
            c0098c = C20217u.this.m105599e(c0098c);
            if (!c0098c.f537v.equals("audio")) {
            }
            return m105480e.m105482a(c0098c, m105649b, this.f100055t, true);
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Object doInBackground() {
            Object obj = null;
            do {
                try {
                    obj = C20911b.m109386a().m109392g("banner", this.f100051p, this.f100052q);
                    if (obj == null) {
                        break;
                    }
                    obj = m105635a(obj);
                } catch (Exception e11) {
                    Adtima.m18329e(C20217u.f99970o, "scheduleBannerAds", e11);
                }
            } while (obj == null);
            return obj;
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Object obj) {
            String str;
            String str2;
            try {
                InterfaceC19740b interfaceC19740b = this.f100057v;
                if (interfaceC19740b != null) {
                    if (obj == null) {
                        interfaceC19740b.onEmptyAdsToShow();
                        str = C20217u.f99970o;
                        str2 = "scheduleBannerAds - ads empty";
                    } else if (obj instanceof C17718a) {
                        C17718a c17718a = (C17718a) obj;
                        if (c17718a.f89802a.f537v.equals("video")) {
                            this.f100057v.onAdtimaVideoBannerShow(c17718a);
                            str = C20217u.f99970o;
                            str2 = "scheduleBannerAds - adtima video";
                        } else if (c17718a.f89802a.f537v.equals("audio")) {
                            if (c17718a.f89802a.f497b.equals("ima")) {
                                this.f100057v.onIMAAudioBannerShow(c17718a);
                                str = C20217u.f99970o;
                                str2 = "scheduleBannerAds - IMA audio";
                            } else {
                                this.f100057v.onAdtimaAudioBannerShow(c17718a);
                                str = C20217u.f99970o;
                                str2 = "scheduleBannerAds - adtima audio";
                            }
                        } else if (c17718a.f89802a.f537v.equals("rich")) {
                            this.f100057v.onAdtimaRichBannerShow(c17718a);
                            str = C20217u.f99970o;
                            str2 = "scheduleBannerAds - adtima rich";
                        } else if (c17718a.f89802a.f537v.equals("endcard")) {
                            this.f100057v.onAdtimaEndCardBannerShow(c17718a);
                            str = C20217u.f99970o;
                            str2 = "scheduleBannerAds - adtima endcard";
                        } else if (c17718a.f89802a.f537v.equals("html")) {
                            this.f100057v.onAdtimaHtmlBannerShow(c17718a);
                            str = C20217u.f99970o;
                            str2 = "scheduleBannerAds - adtima html";
                        } else {
                            if (!c17718a.f89802a.f537v.equals("graphic") && !c17718a.f89802a.f537v.equals("native") && !c17718a.f89802a.f537v.equals("zalo")) {
                                return;
                            }
                            this.f100057v.onAdtimaBannerShow(c17718a);
                            str = C20217u.f99970o;
                            str2 = "scheduleBannerAds - adtima native";
                        }
                    } else {
                        if (obj instanceof C0099d) {
                            C0099d clone = ((C0099d) obj).clone();
                            this.f100057v.onNetworkBannerShow(clone);
                            Adtima.m18328e(C20217u.f99970o, "scheduleBannerAds - " + clone.f548b);
                            return;
                        }
                        if (!(obj instanceof ArrayList)) {
                            return;
                        }
                        interfaceC19740b.onNetworkBannerShow((ArrayList) obj);
                        str = C20217u.f99970o;
                        str2 = "scheduleBannerAds - list adsNetwork";
                    }
                    Adtima.m18328e(str, str2);
                }
            } catch (Exception e11) {
                Adtima.m18329e(C20217u.f99970o, "scheduleBannerAds", e11);
            }
        }
    }

    private C20217u() {
        this.f99972a = null;
        this.f99980i = null;
        try {
            this.f99972a = Adtima.SharedContext;
            this.f99980i = new HashMap();
        } catch (Exception unused) {
        }
    }

    /* renamed from: B */
    private void m105525B(C0101f c0101f) {
        if (c0101f != null) {
            try {
                ArrayList arrayList = c0101f.f575a;
                if (arrayList == null || arrayList.size() == 0) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                boolean z11 = true;
                for (int i11 = 0; i11 < c0101f.f575a.size(); i11++) {
                    Object obj = c0101f.f575a.get(i11);
                    if (z11 && (obj instanceof C0098c)) {
                        arrayList2.add(m105599e((C0098c) obj));
                        z11 = false;
                    } else {
                        arrayList2.add(obj);
                    }
                }
                c0101f.f575a.clear();
                c0101f.f575a.addAll(arrayList2);
            } catch (Exception e11) {
                Adtima.m18328e(f99970o, "processPreDownload " + e11.toString());
            }
        }
    }

    /* renamed from: C */
    public void m105527C(C0101f c0101f, String str) {
        ArrayList arrayList;
        if (str != null) {
            try {
                if (str.length() == 0 || c0101f == null || (arrayList = c0101f.f575a) == null || arrayList.size() == 0) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < c0101f.f575a.size(); i11++) {
                    Object obj = c0101f.f575a.get(i11);
                    if (obj instanceof C0098c) {
                        C0098c c0098c = (C0098c) obj;
                        if (!c0098c.m445h(str)) {
                            if (c0098c.m443e(str)) {
                                if (!c0098c.m445h(str)) {
                                    if (c0098c.m443e(str)) {
                                    }
                                }
                            }
                        }
                        arrayList2.add(c0098c);
                    }
                }
                c0101f.f575a.clear();
                c0101f.f575a.addAll(arrayList2);
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "processFilterId", e11);
            }
        }
    }

    /* renamed from: C0 */
    private void m105528C0() {
        try {
            C0009d.m11g(new i(this));
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "doFakeRequest", e11);
        }
    }

    /* renamed from: D0 */
    private void m105529D0() {
        try {
            String str = this.f99975d;
            if (str == null) {
                str = C30267d.m149339A().m149348e(Adtima.SharedContext);
            }
            if (!str.equals("252") && !this.f99975d.equals("465")) {
                return;
            }
            if (AbstractC20202f.f99828o0) {
                C0009d.m11g(new l());
            }
            if (AbstractC20202f.f99842v0) {
                C0009d.m9e(new m(), AbstractC20202f.f99846x0);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "doReportTask", e11);
        }
    }

    /* renamed from: F */
    public void m105531F(ZAdsBundleListener zAdsBundleListener, HashMap hashMap, String str, int i11) {
        Adtima.m18328e(f99970o, "doCallbackError");
        HashMap<String, Integer> hashMap2 = new HashMap<>();
        if (hashMap != null) {
            try {
                if (hashMap.isEmpty()) {
                    return;
                }
                for (String str2 : hashMap.keySet()) {
                    hashMap2.put(str2, Integer.valueOf(i11));
                    if (zAdsBundleListener != null) {
                        zAdsBundleListener.onAdsLoadFailed(str2, str, i11);
                    }
                }
                if (zAdsBundleListener != null) {
                    zAdsBundleListener.onBundleAdsFetch(hashMap2, str);
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "doCallbackError", e11);
            }
        }
    }

    /* renamed from: N0 */
    public static C20217u m105538N0() {
        if (f99971p == null) {
            f99971p = new C20217u();
        }
        return f99971p;
    }

    /* renamed from: R0 */
    public void m105539R0() {
        C0009d.m11g(new k());
    }

    /* renamed from: S0 */
    public void m105540S0() {
        try {
            Adtima.m18328e(f99970o, "Schedule - start");
            this.f99981j = new q();
            AbstractC1442h.m7349a(Looper.getMainLooper()).postDelayed(this.f99981j, AbstractC20202f.f99814h0);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "scheduleInitSDK", e11);
        }
    }

    /* renamed from: U */
    private void m105541U(String str, HashMap hashMap) {
        String m105371e;
        try {
            if (!C20210n.m105453a().m105455c() || (m105371e = C20205i.m105364t().m105371e(str, hashMap)) == null || m105371e.length() == 0) {
                return;
            }
            C20214r.m105487b().m105499h(m105371e, null, 2, null);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "sendGetRequestWithMacroAsync", e11);
        }
    }

    /* renamed from: Y */
    private void m105542Y(JSONArray jSONArray, String str, String str2) {
        String optString;
        try {
            if (!AbstractC20202f.f99789Q || AbstractC20202f.f99787O || C20210n.m105453a().m105456d()) {
                return;
            }
            if (jSONArray != null) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                    if (optJSONObject != null && (optString = optJSONObject.optString("adNetwork")) != null && optString.equals("adtima")) {
                        optJSONObject.put("isAdBackup", true);
                        jSONArray2.put(optJSONObject);
                    }
                }
                if (jSONArray2.length() > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, 0);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("ads", jSONArray2);
                    jSONObject.put("data", jSONObject2);
                    C30265b.m149329k().m149331g(str, str2, jSONObject.toString());
                    return;
                }
            }
            C30265b.m149329k().m149332h(str, str2);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "processBackupAd", e11);
        }
    }

    /* renamed from: b */
    public int m105545b(JSONObject jSONObject, HashMap hashMap, String str, String str2, String str3, String str4, boolean z11, ZAdsBundleListener zAdsBundleListener, boolean z12) {
        int i11;
        HashMap<String, Integer> hashMap2;
        String str5;
        Iterator<String> it;
        String str6;
        String optString;
        String str7;
        Object m447c;
        ArrayList arrayList;
        Object obj;
        JSONObject jSONObject2 = jSONObject;
        String str8 = str;
        String str9 = str3;
        String str10 = "adtima";
        if (jSONObject2 != null) {
            try {
                if (jSONObject.length() != 0 && hashMap != null && !hashMap.isEmpty()) {
                    if (zAdsBundleListener != null) {
                        try {
                            hashMap2 = new HashMap<>();
                        } catch (Exception e11) {
                            e = e11;
                            i11 = 0;
                            Adtima.m18328e(f99970o, "ProcessRawData " + e.toString());
                            return i11;
                        }
                    } else {
                        hashMap2 = null;
                    }
                    Iterator<String> keys = jSONObject.keys();
                    int i12 = 0;
                    while (true) {
                        try {
                            if (!keys.hasNext()) {
                                i11 = i12;
                                break;
                            }
                            String next = keys.next();
                            String str11 = (String) hashMap.get(next);
                            if (zAdsBundleListener != null) {
                                C20221y.m105659d().m105661c(next, str2, str8);
                            }
                            JSONObject optJSONObject = jSONObject2.optJSONObject(next);
                            if (optJSONObject == null || optJSONObject.length() == 0) {
                                str5 = str10;
                                it = keys;
                            } else {
                                JSONArray jSONArray = new JSONArray();
                                JSONArray optJSONArray = optJSONObject.optJSONArray("ads");
                                if (optJSONArray == null || optJSONArray.length() == 0) {
                                    it = keys;
                                } else {
                                    it = keys;
                                    for (int i13 = 0; i13 < optJSONArray.length(); i13++) {
                                        jSONArray.put(optJSONArray.optJSONObject(i13));
                                    }
                                }
                                String str12 = (String) hashMap.get(next);
                                if (!z12) {
                                    m105542Y(optJSONObject.optJSONArray("backup"), next, str12);
                                }
                                if (jSONArray.length() == 0) {
                                    int i14 = optJSONObject.optInt("resultCode", -1) == -1 ? -4 : -8;
                                    if (zAdsBundleListener != null) {
                                        zAdsBundleListener.onAdsLoadFailed(next, str2, i14);
                                        hashMap2.put(next, Integer.valueOf(i14));
                                    } else if (str8 != null) {
                                        C20221y.m105659d().m105661c(next, str2, str8);
                                    } else {
                                        C20221y.m105659d().m105660b(next, str2);
                                    }
                                    if (hashMap.size() == 1) {
                                        i11 = i14;
                                        break;
                                    }
                                    str5 = str10;
                                } else {
                                    C0101f c0101f = new C0101f();
                                    int i15 = 0;
                                    while (i15 < jSONArray.length()) {
                                        JSONObject optJSONObject2 = jSONArray.optJSONObject(i15);
                                        if (optJSONObject2 != null && (optString = optJSONObject2.optString("adNetwork")) != null) {
                                            if (Adtima.isSupport(str10, str9) && optString.equals(str10)) {
                                                C0098c m441d = C0098c.m441d(optString, optJSONObject2);
                                                if (m441d != null && m105565r0(m441d)) {
                                                    if (z12) {
                                                        obj = m441d;
                                                        if (m441d.f469B0.equals("programmatic")) {
                                                            str6 = str4;
                                                            str5 = str10;
                                                            i12 = -2;
                                                            break;
                                                        }
                                                    } else {
                                                        obj = m441d;
                                                    }
                                                    arrayList = c0101f.f575a;
                                                    m447c = obj;
                                                    str7 = str10;
                                                    arrayList.add(m447c);
                                                    i15++;
                                                    str9 = str3;
                                                    str10 = str7;
                                                }
                                            } else if (Adtima.isSupport(optString, str9)) {
                                                if (z12) {
                                                    str6 = str4;
                                                    str5 = str10;
                                                    i12 = -2;
                                                    break;
                                                }
                                                String optString2 = optJSONObject2.optString("kind");
                                                str7 = str10;
                                                if (!optString.equals("ima") || optString2 == null) {
                                                    m447c = C0099d.m447c(optString, str11, optJSONObject2);
                                                    if (m447c != null) {
                                                        arrayList = c0101f.f575a;
                                                    } else {
                                                        i15++;
                                                        str9 = str3;
                                                        str10 = str7;
                                                    }
                                                } else {
                                                    m447c = C0098c.m441d(optString, optJSONObject2);
                                                    if (m447c == null) {
                                                        i15++;
                                                        str9 = str3;
                                                        str10 = str7;
                                                    }
                                                    arrayList = c0101f.f575a;
                                                }
                                                arrayList.add(m447c);
                                                i15++;
                                                str9 = str3;
                                                str10 = str7;
                                            }
                                        }
                                        str7 = str10;
                                        i15++;
                                        str9 = str3;
                                        str10 = str7;
                                    }
                                    str5 = str10;
                                    str6 = str4;
                                    m105527C(c0101f, str6);
                                    if (z11) {
                                        m105525B(c0101f);
                                    }
                                    C20911b.m109386a().m109387b(str12, next, str2, c0101f);
                                    if (zAdsBundleListener != null) {
                                        zAdsBundleListener.onAdsLoadFinished(next, str2);
                                        hashMap2.put(next, 0);
                                        jSONObject2 = jSONObject;
                                        str8 = str;
                                        str9 = str3;
                                        keys = it;
                                        str10 = str5;
                                    }
                                }
                            }
                            jSONObject2 = jSONObject;
                            str8 = str;
                            str9 = str3;
                            keys = it;
                            str10 = str5;
                        } catch (Exception e12) {
                            e = e12;
                            i11 = i12;
                        }
                    }
                    if (zAdsBundleListener == null) {
                        return i11;
                    }
                    try {
                        zAdsBundleListener.onBundleAdsFetch(hashMap2, str2);
                        return i11;
                    } catch (Exception e13) {
                        e = e13;
                        Adtima.m18328e(f99970o, "ProcessRawData " + e.toString());
                        return i11;
                    }
                }
            } catch (Exception e14) {
                e = e14;
            }
        }
        try {
            m105531F(zAdsBundleListener, hashMap, str2, -2);
            return -2;
        } catch (Exception e15) {
            e = e15;
            i11 = -2;
            Adtima.m18328e(f99970o, "ProcessRawData " + e.toString());
            return i11;
        }
    }

    /* renamed from: c */
    public long m105546c(long j11) {
        try {
            long currentTimeMillis = System.currentTimeMillis() + AbstractC20202f.f99850z0;
            if (j11 - currentTimeMillis > 0) {
                j11 = currentTimeMillis;
            }
            Adtima.m18328e(f99970o, "updateExpiredTime: " + j11);
        } catch (Exception unused) {
        }
        return j11;
    }

    /* renamed from: c0 */
    public Object m105547c0(String str, String str2, String str3) {
        ArrayList arrayList;
        Object obj = null;
        try {
            C0101f m109390e = C20911b.m109386a().m109390e(str, str2, str3);
            if (m109390e == null || (arrayList = m109390e.f575a) == null) {
                return null;
            }
            if (arrayList.size() == 0) {
                return null;
            }
            Object obj2 = null;
            do {
                try {
                    obj2 = m109390e.f575a.remove(0);
                    if (obj2 != null) {
                        if (!(obj2 instanceof C0098c)) {
                            if (obj2 instanceof C0099d) {
                                break;
                            }
                        } else {
                            if (!C20218v.m105636a().m105640e(((C0098c) obj2).f492X)) {
                                break;
                            }
                            obj2 = null;
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    obj = obj2;
                    Adtima.m18329e(f99970o, "popQueue", e);
                    return obj;
                }
            } while (m109390e.f575a.size() > 0);
            if (m109390e.f575a.size() == 0) {
                C20911b.m109386a().m109391f(str, str2, str3, null);
            } else {
                C20911b.m109386a().m109391f(str, str2, str3, m109390e);
            }
            return obj2;
        } catch (Exception e12) {
            e = e12;
        }
    }

    /* renamed from: d0 */
    private String m105549d0(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder();
        if (bundle != null) {
            try {
                for (String str : bundle.keySet()) {
                    String string = bundle.getString(str);
                    sb2.append(str);
                    sb2.append("=");
                    sb2.append(string);
                    sb2.append(";");
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "parseBundleData", e11);
            }
        }
        return sb2.toString();
    }

    /* renamed from: f0 */
    private void m105552f0() {
        try {
            C0009d.m11g(new n(this));
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "doResetBackup", e11);
        }
    }

    /* renamed from: g */
    private Bundle m105553g(Bundle bundle) {
        try {
            this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putString("os", "android");
            String str = C20205i.m105364t().f99877l;
            if (str != null && str.length() != 0) {
                bundle.putString("model", str);
            }
            String str2 = C20205i.m105364t().f99879n;
            if (str2 != null && str2.length() != 0) {
                bundle.putString("brand", str2);
            }
            bundle.putString("version", String.valueOf(Build.VERSION.SDK_INT));
            String m100799e = AbstractC19207b.m100799e(this.f99972a);
            if (m100799e != null) {
                bundle.putString("network", m100799e);
            }
            if (C20218v.m105636a().m105640e(BuildConfig.APPLICATION_ID)) {
                bundle.putString("iszalo", "true");
            }
            String m100797c = AbstractC19207b.m100797c(this.f99972a);
            if (m100797c != null && m100797c.length() != 0) {
                String m100796b = AbstractC19207b.m100796b(m100797c);
                if (m100796b != null && m100796b.length() != 0) {
                    bundle.putString("mcc", m100796b);
                }
                String m100798d = AbstractC19207b.m100798d(m100797c);
                if (m100798d != null && m100798d.length() != 0) {
                    bundle.putString("mnc", m100798d);
                }
            }
            String m100794a = C19206a.m100793b().m100794a();
            if (m100794a != null && m100794a.length() != 0) {
                bundle.putString("appVer", m100794a);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "attachAdsTargeting", e11);
        }
        return bundle;
    }

    /* renamed from: j */
    public String m105556j(int i11, String str, Bundle bundle, JSONObject jSONObject, String str2, int i12) {
        try {
            this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
            String m105380x = C20205i.m105364t().m105380x();
            C0097b m105518m = C20215s.m105509k().m105518m();
            if (m105518m == null) {
                this.f99973b = false;
                return null;
            }
            String packageName = this.f99972a.getPackageName();
            String m105657b = C20220x.m105656c().m105657b();
            String m105331g = jSONObject == null ? "" : AbstractC20198b.m105331g(jSONObject.toString(), false);
            String m100794a = C19206a.m100793b().m100794a();
            String m105381y = C20205i.m105364t().m105381y();
            Bundle bundle2 = new Bundle();
            bundle2.putString("deviceId", m105380x);
            bundle2.putString("sdkVer", String.valueOf(i11));
            bundle2.putString("sdkName", Adtima.SDK_VERSION_NAME);
            bundle2.putString("sdkBuild", Adtima.SDK_BUILD_NUMBER);
            bundle2.putString("templateVer", String.valueOf(m105518m.f460a));
            bundle2.putString("zoneIds", str);
            bundle2.putString("count", String.valueOf(5));
            bundle2.putString("appId", packageName);
            bundle2.putString("appVer", m100794a);
            bundle2.putString("zaloSdkVer", m105381y);
            bundle2.putString("udata", m105657b);
            bundle2.putString("adconfig", m105331g);
            if (str2 != null && str2.trim().length() != 0) {
                bundle2.putString("servingToken", str2);
            }
            if (i12 > 0) {
                bundle2.putString("retry", String.valueOf(i12));
            }
            String str3 = this.f99975d;
            if (str3 != null && str3.trim().length() != 0) {
                bundle2.putString("siteId", this.f99975d);
            }
            if (this.f99978g) {
                bundle2.putString("outsideZaloLogin", "true");
            } else {
                bundle2.putString("outsideZaloLogin", "false");
            }
            String str4 = this.f99977f;
            if (str4 == null || str4.trim().length() == 0) {
                bundle2.putString("zalologin", "false");
            } else {
                bundle2.putString("zalologin", "true");
                bundle2.putString("zuid", this.f99977f);
            }
            String m105549d0 = m105549d0(m105553g(bundle));
            if (m105549d0.length() != 0) {
                bundle2.putString("vs", m105549d0);
            }
            if (!this.f99985n.equals("")) {
                bundle2.putString("4d", this.f99985n);
            }
            String m105504s = C20214r.m105487b().m105504s(AbstractC20206j.m105386b(), bundle2, 2);
            if (m105504s == null || m105504s.length() == 0) {
                return null;
            }
            return m105504s;
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "getAds", e11);
            return null;
        }
    }

    /* renamed from: n */
    private void m105560n() {
        try {
            C0009d.m11g(new o());
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "doCheckAdtimaId", e11);
        }
    }

    /* renamed from: n0 */
    private void m105561n0(String str, String str2) {
        String m105369c;
        if (str2 != null) {
            try {
                if (str2.length() == 0 || (m105369c = C20205i.m105364t().m105369c(str, str2)) == null || m105369c.length() == 0) {
                    return;
                }
                C20214r.m105487b().m105499h(m105369c, null, 2, null);
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "sendGetRequestWithMacroASync", e11);
            }
        }
    }

    /* renamed from: o0 */
    private void m105562o0(String str, String str2, int i11) {
        try {
            String m105368b = C20205i.m105364t().m105368b(C20205i.m105364t().m105374k(str, str2), i11);
            if (m105368b == null || m105368b.length() == 0) {
                return;
            }
            C20214r.m105487b().m105499h(m105368b, null, 2, null);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "sendGetRequestImpressionWithMacroAsync", e11);
        }
    }

    /* renamed from: p0 */
    private void m105563p0(String str, List list) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String m105378q = C20205i.m105364t().m105378q(str, (String) it.next());
                    if (m105378q != null && m105378q.length() != 0) {
                        C20214r.m105487b().m105499h(m105378q, null, 2, null);
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "sendGetRequestWithMacroASync", e11);
            }
        }
    }

    /* renamed from: q0 */
    private void m105564q0(List list, String str) {
        if (list != null) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String m105374k = C20205i.m105364t().m105374k((String) it.next(), str);
                    if (m105374k != null && m105374k.length() != 0) {
                        C20214r.m105487b().m105499h(m105374k, null, 2, null);
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "sendGetRequestWithMacroASync", e11);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[Catch: Exception -> 0x016a, TryCatch #0 {Exception -> 0x016a, blocks: (B:4:0x0005, B:7:0x0010, B:9:0x0016, B:11:0x0032, B:13:0x0035, B:15:0x0039, B:20:0x0047, B:22:0x004b, B:24:0x0051, B:26:0x006d, B:28:0x0070, B:30:0x0074, B:32:0x007d, B:37:0x0083, B:39:0x0087, B:41:0x008d, B:43:0x00a9, B:45:0x00ac, B:47:0x00b0, B:52:0x00be, B:54:0x00c2, B:56:0x00c8, B:58:0x00e4, B:60:0x00e7, B:62:0x00eb, B:64:0x00f4, B:74:0x0104, B:49:0x00ba, B:17:0x0043), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00eb A[Catch: Exception -> 0x016a, TryCatch #0 {Exception -> 0x016a, blocks: (B:4:0x0005, B:7:0x0010, B:9:0x0016, B:11:0x0032, B:13:0x0035, B:15:0x0039, B:20:0x0047, B:22:0x004b, B:24:0x0051, B:26:0x006d, B:28:0x0070, B:30:0x0074, B:32:0x007d, B:37:0x0083, B:39:0x0087, B:41:0x008d, B:43:0x00a9, B:45:0x00ac, B:47:0x00b0, B:52:0x00be, B:54:0x00c2, B:56:0x00c8, B:58:0x00e4, B:60:0x00e7, B:62:0x00eb, B:64:0x00f4, B:74:0x0104, B:49:0x00ba, B:17:0x0043), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fc A[ADDED_TO_REGION] */
    /* renamed from: r0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m105565r0(C0098c c0098c) {
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        String str2;
        boolean z14;
        String[] split;
        String[] split2;
        boolean z15 = true;
        if (c0098c != null) {
            try {
                C20218v m105636a = C20218v.m105636a();
                String str3 = c0098c.f468B;
                if (str3 != null && str3.length() != 0) {
                    Adtima.m18326d(f99970o, "includeAnd:" + str3);
                    String[] split3 = str3.split(";");
                    if (split3 != null && split3.length != 0) {
                        for (String str4 : split3) {
                            if (!m105636a.m105640e(str4)) {
                                z11 = false;
                                break;
                            }
                        }
                    }
                }
                z11 = true;
                String str5 = c0098c.f466A;
                if (str5 != null && str5.length() != 0) {
                    Adtima.m18326d(f99970o, "includeOr:" + str5);
                    String[] split4 = str5.split(";");
                    if (split4 != null && split4.length != 0) {
                        for (String str6 : split4) {
                            if (!m105636a.m105640e(str6)) {
                            }
                        }
                    }
                    z12 = false;
                    str = c0098c.f545z;
                    if (str != null && str.length() != 0) {
                        Adtima.m18326d(f99970o, "excludeAnd:" + str);
                        split2 = str.split(";");
                        if (split2 != null && split2.length != 0) {
                            for (String str7 : split2) {
                                if (m105636a.m105640e(str7)) {
                                    z13 = false;
                                    break;
                                }
                            }
                        }
                    }
                    z13 = true;
                    str2 = c0098c.f543y;
                    if (str2 != null && str2.length() != 0) {
                        Adtima.m18326d(f99970o, "excludeOr:" + str2);
                        split = str2.split(";");
                        if (split != null && split.length != 0) {
                            for (String str8 : split) {
                                if (m105636a.m105640e(str8)) {
                                }
                            }
                        }
                        z14 = false;
                        if (z11 || !z12 || !z13 || !z14) {
                            z15 = false;
                        }
                        String str9 = f99970o;
                        Adtima.m18326d(str9, "isIncludeAnd:" + z11);
                        Adtima.m18326d(str9, "isIncludeOr:" + z12);
                        Adtima.m18326d(str9, "isExcludeAnd:" + z13);
                        Adtima.m18326d(str9, "isExcludeOr:" + z14);
                        Adtima.m18326d(str9, "shouldServe:" + z15);
                    }
                    z14 = true;
                    if (z11) {
                    }
                    z15 = false;
                    String str92 = f99970o;
                    Adtima.m18326d(str92, "isIncludeAnd:" + z11);
                    Adtima.m18326d(str92, "isIncludeOr:" + z12);
                    Adtima.m18326d(str92, "isExcludeAnd:" + z13);
                    Adtima.m18326d(str92, "isExcludeOr:" + z14);
                    Adtima.m18326d(str92, "shouldServe:" + z15);
                }
                z12 = true;
                str = c0098c.f545z;
                if (str != null) {
                    Adtima.m18326d(f99970o, "excludeAnd:" + str);
                    split2 = str.split(";");
                    if (split2 != null) {
                        while (r8 < r7) {
                        }
                    }
                }
                z13 = true;
                str2 = c0098c.f543y;
                if (str2 != null) {
                    Adtima.m18326d(f99970o, "excludeOr:" + str2);
                    split = str2.split(";");
                    if (split != null) {
                        while (r7 < r3) {
                        }
                    }
                    z14 = false;
                    if (z11) {
                    }
                    z15 = false;
                    String str922 = f99970o;
                    Adtima.m18326d(str922, "isIncludeAnd:" + z11);
                    Adtima.m18326d(str922, "isIncludeOr:" + z12);
                    Adtima.m18326d(str922, "isExcludeAnd:" + z13);
                    Adtima.m18326d(str922, "isExcludeOr:" + z14);
                    Adtima.m18326d(str922, "shouldServe:" + z15);
                }
                z14 = true;
                if (z11) {
                }
                z15 = false;
                String str9222 = f99970o;
                Adtima.m18326d(str9222, "isIncludeAnd:" + z11);
                Adtima.m18326d(str9222, "isIncludeOr:" + z12);
                Adtima.m18326d(str9222, "isExcludeAnd:" + z13);
                Adtima.m18326d(str9222, "isExcludeOr:" + z14);
                Adtima.m18326d(str9222, "shouldServe:" + z15);
            } catch (Exception unused) {
            }
        }
        return z15;
    }

    /* renamed from: s */
    private void m105566s(int i11, String str, String str2) {
        try {
            String m105367a = C20205i.m105364t().m105367a(i11, C20205i.m105364t().m105374k(str, str2));
            if (m105367a == null || m105367a.length() == 0) {
                return;
            }
            C20214r.m105487b().m105499h(m105367a, null, 2, null);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "sendGetRequestWithMacroAsync", e11);
        }
    }

    /* renamed from: x0 */
    private void m105569x0(String str, String str2) {
        String m105374k;
        try {
            if (!C20210n.m105453a().m105455c() || (m105374k = C20205i.m105364t().m105374k(str, str2)) == null || m105374k.length() == 0) {
                return;
            }
            C20214r.m105487b().m105499h(m105374k, null, 2, null);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "sendGetRequestWithMacroAsync", e11);
        }
    }

    /* renamed from: y0 */
    private void m105570y0(String str, String str2, String str3) {
        try {
            String m105377o = C20205i.m105364t().m105377o(C20205i.m105364t().m105374k(str, str2), str3);
            if (m105377o == null || m105377o.length() == 0) {
                return;
            }
            C20214r.m105487b().m105499h(m105377o, null, 2, null);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "sendGetRequestWithMacroAsync", e11);
        }
    }

    /* renamed from: A */
    public void m105572A(C0099d c0099d, boolean z11) {
        String str;
        if (c0099d != null) {
            try {
                String str2 = c0099d.f566t;
                if (str2 == null || str2.trim().length() == 0 || (str = c0099d.f571y) == null || str.trim().length() == 0) {
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("__KIND__", z11 ? "win" : "loss");
                hashMap.put("__PRICE__", c0099d.f571y);
                m105541U(c0099d.f566t, hashMap);
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "handleAdtimaAdsTracking", e11);
            }
        }
    }

    /* renamed from: D */
    public void m105573D(ZAdsBannerSize zAdsBannerSize, String str) {
        try {
            HashMap hashMap = this.f99980i;
            if (hashMap == null || hashMap.size() == 0) {
                return;
            }
            AbstractRunnableC0008c abstractRunnableC0008c = (AbstractRunnableC0008c) this.f99980i.remove(ZAdsBannerSize.toString(zAdsBannerSize) + "-" + str);
            if (abstractRunnableC0008c == null || abstractRunnableC0008c.getStatus() != AbstractRunnableC0008c.d.RUNNING) {
                return;
            }
            C0009d.m7c(abstractRunnableC0008c);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "cancelScheduleBannerAds", e11);
        }
    }

    /* renamed from: E */
    public void m105574E(ZAdsBannerSize zAdsBannerSize, String str, String str2, String str3, boolean z11, InterfaceC19740b interfaceC19740b, boolean z12) {
        String str4 = ZAdsBannerSize.toString(zAdsBannerSize) + "-" + str;
        this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
        AbstractRunnableC0008c abstractRunnableC0008c = (AbstractRunnableC0008c) this.f99980i.get(str4);
        if (abstractRunnableC0008c != null && abstractRunnableC0008c.getStatus() == AbstractRunnableC0008c.d.RUNNING) {
            C0009d.m7c(abstractRunnableC0008c);
        }
        s sVar = new s(str, str2, z11, str3, zAdsBannerSize, z12, interfaceC19740b);
        C0009d.m11g(sVar);
        this.f99980i.put(str4, sVar);
    }

    /* renamed from: G */
    public void m105575G(EnumC20200d enumC20200d, String str) {
        try {
            m105561n0(enumC20200d.toString(), str);
        } catch (Exception unused) {
        }
    }

    /* renamed from: G0 */
    public void m105576G0() {
        try {
            m105528C0();
            m105529D0();
            m105552f0();
            m105560n();
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "doSubTasks", e11);
        }
    }

    /* renamed from: I0 */
    public String m105577I0() {
        String str = this.f99975d;
        return str == null ? "" : str;
    }

    /* renamed from: J */
    public void m105578J(String str, int i11) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("__FEEDBACK_ID__", Integer.valueOf(i11));
            m105541U(str, hashMap);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleAdtimaAdsFeedback", e11);
        }
    }

    /* renamed from: J0 */
    public synchronized String m105579J0() {
        String str;
        try {
            str = C20205i.m105364t().m105380x();
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "getDeviceId", e11);
            str = null;
        }
        return str;
    }

    /* renamed from: K */
    public void m105580K(String str, long j11, int i11) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("__PERFORMANCE__", Long.valueOf(j11));
            hashMap.put("__ERROR_CODE_PAGE__", Integer.valueOf(i11));
            m105541U(str, hashMap);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleAdtimaAdsPerformance", e11);
        }
    }

    /* renamed from: L */
    public void m105581L(String str, InterfaceC19745g interfaceC19745g) {
        this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
        C0009d.m11g(new j(str, interfaceC19745g));
    }

    /* renamed from: L0 */
    public int m105582L0() {
        return this.f99984m;
    }

    /* renamed from: M */
    public void m105583M(String str, String str2) {
        try {
            Adtima.m18328e(f99970o, "handleVastTarget - open browser with target link");
            C20218v.m105636a().m105643h(C20205i.m105364t().m105374k(str, str2));
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleVastTarget", e11);
        }
    }

    /* renamed from: N */
    public void m105584N(String str, String str2, int i11) {
        try {
            Adtima.m18328e(f99970o, "handleScenarioAdsAction\n" + str);
            String m105368b = C20205i.m105364t().m105368b(C20205i.m105364t().m105374k(str, str2), i11);
            if (m105368b == null || m105368b.length() == 0) {
                return;
            }
            C20214r.m105487b().m105499h(m105368b, null, 2, null);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleScenarioAdsAction", e11);
        }
    }

    /* renamed from: O */
    public void m105585O(String str, String str2, InterfaceC19743e interfaceC19743e) {
        C0009d.m11g(new a(str, str2, interfaceC19743e));
    }

    /* renamed from: O0 */
    public String m105586O0() {
        return this.f99985n;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:2:0x0000, B:4:0x002c, B:6:0x0034, B:8:0x003c, B:10:0x0044, B:13:0x0056, B:15:0x0060, B:17:0x0064, B:19:0x006a, B:20:0x0070, B:22:0x0076, B:33:0x007e, B:28:0x008b, B:24:0x0083, B:27:0x0087, B:35:0x0091, B:39:0x004f), top: B:1:0x0000 }] */
    /* renamed from: P */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m105587P(String str, String str2, String str3) {
        C0101f m109390e;
        ArrayList arrayList;
        Iterator it;
        String str4;
        try {
            Adtima.m18328e(f99970o, "Clean queue: " + AbstractC20202f.f99813h + " | Size: " + C20911b.m109386a().m109393h(str, str2, str3));
            if (AbstractC20202f.f99813h) {
                if (!str.equals("banner")) {
                    if (!str.equals("interstitial")) {
                        if (!str.equals("incentivized")) {
                            if (str.equals("native")) {
                            }
                            m109390e = C20911b.m109386a().m109390e(str, str2, str3);
                            if (m109390e != null && (arrayList = m109390e.f575a) != null && arrayList.size() != 0) {
                                it = m109390e.f575a.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    if (next instanceof C0098c) {
                                        str4 = ((C0098c) next).f473E;
                                    } else if (next instanceof C0099d) {
                                        str4 = ((C0099d) next).f561o;
                                    }
                                    m105569x0(str4, "");
                                }
                            }
                            C20911b.m109386a().m109389d(str, str2, str3);
                        }
                    }
                }
                C20221y.m105659d().m105660b(str2, str3);
                m109390e = C20911b.m109386a().m109390e(str, str2, str3);
                if (m109390e != null) {
                    it = m109390e.f575a.iterator();
                    while (it.hasNext()) {
                    }
                }
                C20911b.m109386a().m109389d(str, str2, str3);
            }
        } catch (Exception e11) {
            String str5 = f99970o;
            Adtima.m18328e(str5, str5 + " - " + e11.toString());
        }
    }

    /* renamed from: P0 */
    public C18192c m105588P0() {
        return this.f99979h;
    }

    /* renamed from: Q */
    public void m105589Q(String str, String str2, String str3, InterfaceC19739a interfaceC19739a) {
        C0009d.m11g(new c(str, str2, str3, interfaceC19739a));
    }

    /* renamed from: Q0 */
    public String m105590Q0() {
        return this.f99977f;
    }

    /* renamed from: R */
    public void m105591R(String str, String str2, String str3, InterfaceC19741c interfaceC19741c) {
        this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
        C0009d.m11g(new e(str, str2, str3, interfaceC19741c));
    }

    /* renamed from: S */
    public void m105592S(String str, String str2, String str3, InterfaceC19742d interfaceC19742d) {
        this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
        C0009d.m11g(new d(str, str2, str3, interfaceC19742d));
    }

    /* renamed from: T */
    public void m105593T(String str, String str2, String str3, InterfaceC19746h interfaceC19746h) {
        C0009d.m11g(new b(str, str2, str3, interfaceC19746h));
    }

    /* renamed from: V */
    public void m105594V(String str, List list) {
        try {
            Adtima.m18328e(f99970o, "handleVastEvent - track event");
            m105563p0(str, list);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleVastEvent", e11);
        }
    }

    /* renamed from: W */
    public void m105595W(String str, boolean z11) {
        try {
            if (C20210n.m105453a().m105455c()) {
                Adtima.m18328e(f99970o, "handleTrackInventory - filled is " + z11);
                C0097b m105518m = C20215s.m105509k().m105518m();
                if (m105518m == null || m105518m.f465f == null) {
                    return;
                }
                m105569x0(C20205i.m105364t().m105370d(m105518m.f465f, str, z11), "");
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleTrackInventory", e11);
        }
    }

    /* renamed from: X */
    public void m105596X(List list, String str) {
        try {
            Adtima.m18328e(f99970o, "handleVastEvent - track event");
            m105564q0(list, str);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleVastEvent", e11);
        }
    }

    /* renamed from: Z */
    public void m105597Z(boolean z11) {
        try {
            this.f99978g = z11;
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "setIsLoginZalo", e11);
        }
    }

    /* renamed from: b0 */
    public boolean m105598b0(String str, String str2, String str3, String str4) {
        ArrayList arrayList;
        try {
            C0101f m109390e = C20911b.m109386a().m109390e(str, str2, str3);
            if (m109390e != null && (arrayList = m109390e.f575a) != null && arrayList.size() != 0) {
                Iterator it = m109390e.f575a.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof C0098c) {
                        C0098c c0098c = (C0098c) next;
                        if (!c0098c.m443e(str4) && c0098c.m445h(str4)) {
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "checkAdsTargeting", e11);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00be, code lost:            if (p178g3.C19212g.m100811q().m100815c(r1.f515k.replace("file://", "")) == false) goto L137;     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00ca, code lost:            if (r1.f515k.endsWith(".html") != false) goto L141;     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0171 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x000b, B:10:0x0019, B:21:0x0026, B:24:0x0035, B:26:0x003b, B:28:0x0043, B:30:0x004b, B:32:0x007d, B:33:0x0088, B:34:0x00a5, B:36:0x00cf, B:38:0x00d3, B:40:0x00d9, B:42:0x00e1, B:44:0x00e9, B:46:0x011b, B:47:0x0126, B:48:0x0143, B:50:0x016d, B:52:0x0171, B:54:0x0177, B:56:0x017f, B:58:0x0187, B:60:0x01b9, B:61:0x01c4, B:62:0x01e1, B:64:0x01c9, B:66:0x01d5, B:67:0x01e4, B:69:0x01ec, B:73:0x0201, B:77:0x012b, B:79:0x0137, B:80:0x0146, B:82:0x014e, B:85:0x0163, B:89:0x008d, B:91:0x0099, B:92:0x00a8, B:94:0x00b0, B:96:0x00c4), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ec A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x000b, B:10:0x0019, B:21:0x0026, B:24:0x0035, B:26:0x003b, B:28:0x0043, B:30:0x004b, B:32:0x007d, B:33:0x0088, B:34:0x00a5, B:36:0x00cf, B:38:0x00d3, B:40:0x00d9, B:42:0x00e1, B:44:0x00e9, B:46:0x011b, B:47:0x0126, B:48:0x0143, B:50:0x016d, B:52:0x0171, B:54:0x0177, B:56:0x017f, B:58:0x0187, B:60:0x01b9, B:61:0x01c4, B:62:0x01e1, B:64:0x01c9, B:66:0x01d5, B:67:0x01e4, B:69:0x01ec, B:73:0x0201, B:77:0x012b, B:79:0x0137, B:80:0x0146, B:82:0x014e, B:85:0x0163, B:89:0x008d, B:91:0x0099, B:92:0x00a8, B:94:0x00b0, B:96:0x00c4), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0201 A[Catch: Exception -> 0x0016, TRY_LEAVE, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x000b, B:10:0x0019, B:21:0x0026, B:24:0x0035, B:26:0x003b, B:28:0x0043, B:30:0x004b, B:32:0x007d, B:33:0x0088, B:34:0x00a5, B:36:0x00cf, B:38:0x00d3, B:40:0x00d9, B:42:0x00e1, B:44:0x00e9, B:46:0x011b, B:47:0x0126, B:48:0x0143, B:50:0x016d, B:52:0x0171, B:54:0x0177, B:56:0x017f, B:58:0x0187, B:60:0x01b9, B:61:0x01c4, B:62:0x01e1, B:64:0x01c9, B:66:0x01d5, B:67:0x01e4, B:69:0x01ec, B:73:0x0201, B:77:0x012b, B:79:0x0137, B:80:0x0146, B:82:0x014e, B:85:0x0163, B:89:0x008d, B:91:0x0099, B:92:0x00a8, B:94:0x00b0, B:96:0x00c4), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014e A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x000b, B:10:0x0019, B:21:0x0026, B:24:0x0035, B:26:0x003b, B:28:0x0043, B:30:0x004b, B:32:0x007d, B:33:0x0088, B:34:0x00a5, B:36:0x00cf, B:38:0x00d3, B:40:0x00d9, B:42:0x00e1, B:44:0x00e9, B:46:0x011b, B:47:0x0126, B:48:0x0143, B:50:0x016d, B:52:0x0171, B:54:0x0177, B:56:0x017f, B:58:0x0187, B:60:0x01b9, B:61:0x01c4, B:62:0x01e1, B:64:0x01c9, B:66:0x01d5, B:67:0x01e4, B:69:0x01ec, B:73:0x0201, B:77:0x012b, B:79:0x0137, B:80:0x0146, B:82:0x014e, B:85:0x0163, B:89:0x008d, B:91:0x0099, B:92:0x00a8, B:94:0x00b0, B:96:0x00c4), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0163 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:3:0x0001, B:5:0x000b, B:10:0x0019, B:21:0x0026, B:24:0x0035, B:26:0x003b, B:28:0x0043, B:30:0x004b, B:32:0x007d, B:33:0x0088, B:34:0x00a5, B:36:0x00cf, B:38:0x00d3, B:40:0x00d9, B:42:0x00e1, B:44:0x00e9, B:46:0x011b, B:47:0x0126, B:48:0x0143, B:50:0x016d, B:52:0x0171, B:54:0x0177, B:56:0x017f, B:58:0x0187, B:60:0x01b9, B:61:0x01c4, B:62:0x01e1, B:64:0x01c9, B:66:0x01d5, B:67:0x01e4, B:69:0x01ec, B:73:0x0201, B:77:0x012b, B:79:0x0137, B:80:0x0146, B:82:0x014e, B:85:0x0163, B:89:0x008d, B:91:0x0099, B:92:0x00a8, B:94:0x00b0, B:96:0x00c4), top: B:2:0x0001 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0098c m105599e(C0098c c0098c) {
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        String str2;
        StringBuilder sb2;
        StringBuilder sb3;
        StringBuilder sb4;
        try {
            if (!c0098c.f537v.equals("native") && !c0098c.f537v.equals("graphic")) {
                return c0098c;
            }
            C0098c m442g = C0098c.m442g(c0098c.m446i());
            boolean z14 = false;
            if (m442g != null) {
                String str3 = m442g.f515k;
                z11 = true;
                if (str3 != null && str3.length() != 0) {
                    if (!m442g.f515k.startsWith("http") || m442g.f515k.endsWith(".html")) {
                        if (m442g.f515k.startsWith("file")) {
                        }
                        z12 = true;
                    } else {
                        String str4 = C19212g.m100811q().m100819i() + new File(UUID.randomUUID().toString()).getName();
                        if (C19212g.m100811q().m100815c(str4)) {
                            sb4 = new StringBuilder();
                            sb4.append("file://");
                            sb4.append(str4);
                        } else if (C20214r.m105487b().m105500j(m442g.f515k, str4)) {
                            sb4 = new StringBuilder();
                            sb4.append("file://");
                            sb4.append(str4);
                        }
                        m442g.f515k = sb4.toString();
                        z12 = true;
                    }
                    str = m442g.f517l;
                    if (str != null && str.length() != 0) {
                        if (!m442g.f517l.startsWith("http") && !m442g.f517l.endsWith(".html")) {
                            String str5 = C19212g.m100811q().m100819i() + new File(UUID.randomUUID().toString()).getName();
                            if (C19212g.m100811q().m100815c(str5)) {
                                sb3 = new StringBuilder();
                                sb3.append("file://");
                                sb3.append(str5);
                            } else if (C20214r.m105487b().m105500j(m442g.f517l, str5)) {
                                sb3 = new StringBuilder();
                                sb3.append("file://");
                                sb3.append(str5);
                            }
                            m442g.f517l = sb3.toString();
                            z13 = true;
                        } else if (!m442g.f517l.startsWith("file")) {
                            if (!C19212g.m100811q().m100815c(m442g.f517l.replace("file://", ""))) {
                                z11 = z12;
                                z13 = false;
                                return (!z11 || z14 || z13) ? m442g : c0098c;
                            }
                            z13 = true;
                        } else if (m442g.f517l.endsWith(".html")) {
                            z12 = true;
                        }
                        str2 = m442g.f519m;
                        if (str2 != null && str2.length() != 0) {
                            if (!m442g.f519m.startsWith("http") && !m442g.f519m.endsWith(".html")) {
                                String str6 = C19212g.m100811q().m100819i() + new File(UUID.randomUUID().toString()).getName();
                                if (C19212g.m100811q().m100815c(str6)) {
                                    sb2 = new StringBuilder();
                                    sb2.append("file://");
                                    sb2.append(str6);
                                } else if (C20214r.m105487b().m105500j(m442g.f519m, str6)) {
                                    sb2 = new StringBuilder();
                                    sb2.append("file://");
                                    sb2.append(str6);
                                }
                                m442g.f519m = sb2.toString();
                                c0098c = null;
                                z11 = z12;
                                z14 = true;
                            } else if (!m442g.f519m.startsWith("file")) {
                                if (!C19212g.m100811q().m100815c(m442g.f519m.replace("file://", ""))) {
                                    z11 = z12;
                                }
                                c0098c = null;
                                z11 = z12;
                                z14 = true;
                            } else if (m442g.f519m.endsWith(".html")) {
                                c0098c = null;
                            }
                            if (z11) {
                            }
                        }
                        c0098c = null;
                        z11 = z12;
                        if (z11) {
                        }
                    }
                    z13 = false;
                    str2 = m442g.f519m;
                    if (str2 != null) {
                        if (!m442g.f519m.startsWith("http")) {
                        }
                        if (!m442g.f519m.startsWith("file")) {
                        }
                    }
                    c0098c = null;
                    z11 = z12;
                    if (z11) {
                    }
                }
                z12 = false;
                str = m442g.f517l;
                if (str != null) {
                    if (!m442g.f517l.startsWith("http")) {
                    }
                    if (!m442g.f517l.startsWith("file")) {
                    }
                }
                z13 = false;
                str2 = m442g.f519m;
                if (str2 != null) {
                }
                c0098c = null;
                z11 = z12;
                if (z11) {
                }
            }
            z11 = false;
            z13 = false;
            if (z11) {
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "downloadAdsResource", e11);
            return null;
        }
    }

    /* renamed from: g0 */
    public void m105600g0(int i11) {
        this.f99984m = i11;
    }

    /* renamed from: h0 */
    public void m105601h0(int i11, C0098c c0098c, String str) {
        try {
            if (C20210n.m105453a().m105455c() && !c0098c.f467A0) {
                Adtima.m18328e(f99970o, "handleAdsAction - track active view with duration");
                m105566s(i11, c0098c.f474F, str);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleAdtimaAdsActiveViewWithDuration", e11);
        }
    }

    /* renamed from: i0 */
    public void m105602i0(int i11, C0099d c0099d, String str) {
        try {
            if (C20210n.m105453a().m105455c()) {
                Adtima.m18328e(f99970o, "handleAdsAction - track active view with duation");
                m105566s(i11, c0099d.f563q, str);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleNetworkAdsActiveViewWithDuration", e11);
        }
    }

    /* renamed from: j0 */
    public synchronized void m105603j0(int i11, String str) {
        if (str != null) {
            if (str.length() != 0) {
                this.f99975d = str;
            }
        }
    }

    /* renamed from: k0 */
    public void m105604k0(int i11, String str, String str2, String str3, String str4, String str5, Bundle bundle, InterfaceC19745g interfaceC19745g, int i12) {
        this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
        C0009d.m11g(new h(str, str3, str4, str5, i11, bundle, i12, str2, interfaceC19745g));
    }

    /* renamed from: m */
    public String m105605m(String str) {
        try {
            String m105325a = AbstractC20198b.m105325a(str, true);
            Adtima.m18326d(f99970o, "DES Data: " + m105325a);
            return m105325a;
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "buildDesResponseData", e11);
            return null;
        }
    }

    /* renamed from: m0 */
    public void m105606m0(String str) {
        this.f99985n = str;
    }

    /* renamed from: o */
    public synchronized void m105607o(int i11) {
        if (this.f99974c) {
            Adtima.m18326d(f99970o, "SDK is initializing, wait...");
            return;
        }
        if (this.f99973b) {
            Adtima.m18326d(f99970o, "SDK is ready");
            return;
        }
        this.f99983l = System.currentTimeMillis();
        Adtima.m18328e(f99970o, "ZAD_SDK startTime: " + this.f99983l);
        this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
        C0009d.m11g(new p(i11));
    }

    /* renamed from: p */
    public void m105608p(int i11, C0098c c0098c, String str) {
        String str2;
        if (c0098c != null) {
            try {
                try {
                    if (i11 == 4) {
                        if (!c0098c.f467A0) {
                            Adtima.m18328e(f99970o, "handleAdsAction - track click & 3rd click");
                            m105569x0(c0098c.f476H, str);
                            m105564q0(c0098c.f489U, str);
                        }
                        if (c0098c.f510h0 && (str2 = c0098c.f492X) != null && str2.length() != 0) {
                            Adtima.m18328e(f99970o, "handleAdsTarget - open store with package id");
                            C20218v.m105636a().m105642g(c0098c.f492X);
                            return;
                        }
                        Adtima.m18328e(f99970o, "handleAdsTarget - open target with click to");
                        String str3 = c0098c.f513j;
                        String str4 = (str3 == null || str3.length() == 0) ? AbstractC20202f.f99823m : c0098c.f513j;
                        if (str4 == null || str4.length() == 0) {
                            str4 = AbstractC20202f.f99817j;
                        }
                        if (str4.equals(AbstractC20202f.f99821l)) {
                            C20218v.m105636a().m105643h(c0098c.f507g);
                            return;
                        } else {
                            C20218v.m105636a().m105637b(c0098c, str);
                            return;
                        }
                    }
                    if (i11 != 6 && i11 != 5 && i11 != 7) {
                        if (c0098c.f467A0) {
                            return;
                        }
                        if (i11 == 0) {
                            Adtima.m18328e(f99970o, "handleAdsAction - track request");
                            m105569x0(c0098c.f470C, str);
                            return;
                        }
                        if (i11 == 1) {
                            Adtima.m18328e(f99970o, "handleAdsAction - track impression ");
                            m105562o0(c0098c.f475G, str, c0098c.f528q0);
                            m105564q0(c0098c.f490V, str);
                            return;
                        } else if (i11 == 2) {
                            Adtima.m18328e(f99970o, "handleAdsAction - track active view");
                            m105569x0(c0098c.f474F, str);
                            return;
                        } else if (i11 == 3) {
                            Adtima.m18328e(f99970o, "handleAdsAction - track conversion");
                            m105569x0(c0098c.f478J, str);
                            return;
                        } else {
                            if (i11 == 8) {
                                Adtima.m18328e(f99970o, "handleAdsAction - track true impression");
                                m105562o0(c0098c.f482N, str, c0098c.f528q0);
                                return;
                            }
                            return;
                        }
                    }
                    if (!c0098c.f467A0) {
                        Adtima.m18328e(f99970o, "handleAdsAction - track click & 3rd click & action");
                        m105569x0(c0098c.f476H, str);
                        m105564q0(c0098c.f489U, str);
                        m105569x0(c0098c.f477I, str);
                    }
                    if (i11 == 6) {
                        Adtima.m18328e(f99970o, "handleAdsTarget - open call dial with action to");
                        C20218v.m105636a().m105638c(c0098c.f509h);
                    } else {
                        Adtima.m18328e(f99970o, "handleAdsTarget - open Zalo with action to");
                        C20218v.m105636a().m105645j(c0098c.f509h);
                    }
                } catch (Exception e11) {
                    Adtima.m18329e(f99970o, "handleAdsAction", e11);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: q */
    public void m105609q(int i11, C0099d c0099d, String str) {
        String str2;
        if (C20210n.m105453a().m105455c()) {
            try {
                if (i11 == 0) {
                    Adtima.m18328e(f99970o, "handleAdsAction - track request");
                    str2 = c0099d.f558l;
                } else if (i11 == 4) {
                    Adtima.m18328e(f99970o, "handleAdsAction - track click");
                    str2 = c0099d.f560n;
                } else if (i11 == 1) {
                    Adtima.m18328e(f99970o, "handleAdsAction - track impression");
                    str2 = c0099d.f562p;
                } else if (i11 == 2) {
                    Adtima.m18328e(f99970o, "handleAdsAction - track active view");
                    str2 = c0099d.f563q;
                } else if (i11 == 3) {
                    Adtima.m18328e(f99970o, "handleAdsAction - track conversion");
                    str2 = c0099d.f564r;
                } else {
                    if (i11 != 8) {
                        return;
                    }
                    Adtima.m18328e(f99970o, "handleAdsAction - track true impression");
                    str2 = c0099d.f567u;
                }
                m105569x0(str2, str);
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "handleAdsAction", e11);
            }
        }
    }

    /* renamed from: r */
    public synchronized void m105610r(int i11, String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    this.f99975d = str;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m105607o(i11);
    }

    /* renamed from: t */
    public void m105611t(int i11, String str, String str2, String str3, String str4, String str5, Bundle bundle, InterfaceC19745g interfaceC19745g, int i12) {
        this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
        C0009d.m11g(new g(str, str3, str4, str5, i12, i11, bundle, str2, interfaceC19745g));
    }

    /* renamed from: u */
    public void m105612u(int i11, HashMap hashMap, String str, Bundle bundle, HashMap hashMap2, boolean z11, ZAdsBundleListener zAdsBundleListener) {
        this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
        C0009d.m11g(new f(hashMap, hashMap2, i11, bundle, zAdsBundleListener, str, z11));
    }

    /* renamed from: u0 */
    public synchronized void m105613u0() {
        this.f99972a = C19208c.m100802b().m100803a(this.f99972a);
        C0009d.m11g(new r(this));
    }

    /* renamed from: v */
    public void m105614v(C0098c c0098c, String str) {
        try {
            Adtima.m18328e(f99970o, "handleAdsAction - track click & 3rd click & without open zalo by us");
            if (c0098c == null || c0098c.f467A0) {
                return;
            }
            m105569x0(c0098c.f476H, str);
            m105564q0(c0098c.f489U, str);
            m105569x0(c0098c.f477I, str);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleAdtimaAdsActionFollowAuto", e11);
        }
    }

    /* renamed from: v0 */
    public void m105615v0(int i11, C0098c c0098c, String str) {
        if (c0098c != null) {
            try {
                if (!c0098c.f467A0 && i11 == 4) {
                    m105569x0(c0098c.f476H, str);
                    m105564q0(c0098c.f489U, str);
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "handleAdtimaAdsTracking", e11);
            }
        }
    }

    /* renamed from: w */
    public void m105616w(C0098c c0098c, String str, String str2) {
        try {
            Adtima.m18328e(f99970o, "handleVastTarget - open browser with target link : " + str);
            String m105374k = C20205i.m105364t().m105374k(str, str2);
            if (!AbstractC20202f.f99823m.equals(AbstractC20202f.f99821l)) {
                if (!AbstractC20202f.f99823m.equals(AbstractC20202f.f99819k)) {
                    if (!AbstractC20202f.f99823m.equals(AbstractC20202f.f99817j)) {
                        return;
                    }
                    String str3 = c0098c.f513j;
                    if (str3 != null) {
                        if (str3.length() != 0) {
                            if (c0098c.f513j.equals(AbstractC20202f.f99819k)) {
                            }
                        }
                    }
                }
                C20218v.m105636a().m105639d(m105374k, c0098c);
                return;
            }
            C20218v.m105636a().m105643h(m105374k);
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleVastTarget", e11);
        }
    }

    /* renamed from: w0 */
    public void m105617w0(String str) {
        try {
            this.f99977f = str;
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "setZaloUserId", e11);
        }
    }

    /* renamed from: x */
    public void m105618x(C0098c c0098c, String str, ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (sb2.length() != 0) {
                            sb2.append(",");
                        }
                        sb2.append(intValue);
                    }
                    m105570y0(c0098c.f479K, str, sb2.toString());
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "handleAdtimaAdsFeedback", e11);
            }
        }
    }

    /* renamed from: y */
    public void m105619y(C0098c c0098c, boolean z11, String str) {
        try {
            if (z11) {
                Adtima.m18328e(f99970o, "handleAdsAction - App DOES handle, sdk will just track click");
                if (c0098c != null) {
                    if (c0098c.f467A0) {
                        return;
                    }
                    m105569x0(c0098c.f476H, str);
                    m105564q0(c0098c.f489U, str);
                }
            } else {
                Adtima.m18328e(f99970o, "handleAdsContent - App DOES NOT handle, sdk will take action like click");
                m105608p(4, c0098c, str);
            }
        } catch (Exception e11) {
            Adtima.m18329e(f99970o, "handleAdsContent", e11);
        }
    }

    /* renamed from: z */
    public void m105620z(C0099d c0099d, String str, ArrayList arrayList) {
        if (arrayList != null) {
            try {
                if (arrayList.size() != 0) {
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int intValue = ((Integer) it.next()).intValue();
                        if (sb2.length() != 0) {
                            sb2.append(",");
                        }
                        sb2.append(intValue);
                    }
                    m105570y0(c0099d.f565s, str, sb2.toString());
                }
            } catch (Exception e11) {
                Adtima.m18329e(f99970o, "handleNetworkAdsFeedback", e11);
            }
        }
    }
}
