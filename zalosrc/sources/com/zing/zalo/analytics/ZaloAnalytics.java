package com.zing.zalo.analytics;

import ac.C0692a;
import ac.C0697c0;
import ac.C0711j0;
import ac.C0717m0;
import ac.C0718n;
import ac.C0722p;
import ac.C0732w;
import ac.InterfaceC0724q;
import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.InterfaceC1799v;
import bg0.C2797c;
import cc.AbstractC3406a;
import cc.AbstractC3407b;
import cc.AbstractC3408c;
import cc.AbstractC3409d;
import cc.AbstractC3410e;
import cc.AbstractC3411f;
import cc.AbstractC3412g;
import cc.AbstractC3413h;
import cc.AbstractC3414i;
import cc.AbstractC3415j;
import cc.AbstractC3416k;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.analytics.ZaloAnalytics;
import com.zing.zalo.analytics.p059db.AnalyticsRoomDatabase;
import com.zing.zalo.utils.cryptology.Utils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalocore.CoreUtility;
import com.zing.zalocore.connection.socket.AbstractC17527f;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19057i0;
import hm0.C20096c;
import hm0.C20097d;
import hm0.InterfaceC20098e;
import ho0.AbstractC20110a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import nh0.InterfaceC23792b;
import org.json.JSONArray;
import org.json.JSONObject;
import p036bc.C2716c;
import p036bc.C2719f;
import p036bc.C2722i;
import p036bc.C2725l;
import p602w9.C28825a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import s00.AbstractC26080o;

/* loaded from: classes.dex */
public final class ZaloAnalytics implements Application.ActivityLifecycleCallbacks, InterfaceC1799v {
    public static final C7293b Companion = new C7293b(null);

    /* renamed from: Q */
    private static final InterfaceC24854k f39965Q;

    /* renamed from: K */
    private final InterfaceC24854k f39976K;

    /* renamed from: L */
    private final InterfaceC24854k f39977L;

    /* renamed from: M */
    private final InterfaceC24854k f39978M;

    /* renamed from: N */
    private boolean f39979N;

    /* renamed from: O */
    private ArrayList f39980O;

    /* renamed from: P */
    private ArrayList f39981P;

    /* renamed from: p */
    private boolean f39982p;

    /* renamed from: r */
    public InterfaceC23792b f39984r;

    /* renamed from: s */
    private boolean f39985s;

    /* renamed from: v */
    private boolean f39988v;

    /* renamed from: q */
    private final C0692a f39983q = new C0692a();

    /* renamed from: t */
    private final C2797c f39986t = new C2797c(AbstractC0837p0.Companion.m2237f());

    /* renamed from: u */
    private String f39987u = "";

    /* renamed from: w */
    private long f39989w = 21600;

    /* renamed from: x */
    private int f39990x = 3;

    /* renamed from: y */
    private int f39991y = 100;

    /* renamed from: z */
    private long f39992z = 604800;

    /* renamed from: A */
    private int f39966A = 50;

    /* renamed from: B */
    private int f39967B = ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE;

    /* renamed from: C */
    private int f39968C = AbstractC26080o.a.f124275b;

    /* renamed from: D */
    private long f39969D = 604800;

    /* renamed from: E */
    private long f39970E = 300;

    /* renamed from: F */
    private int f39971F = 10;

    /* renamed from: G */
    private int f39972G = 50;

    /* renamed from: H */
    private int f39973H = 49;

    /* renamed from: I */
    private int f39974I = 1024;

    /* renamed from: J */
    private EnumC7295d f39975J = EnumC7295d.APP_MODE;

    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$a */
    /* loaded from: classes.dex */
    static final class C7292a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C7292a f39993q = new C7292a();

        C7292a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ZaloAnalytics mo12V4() {
            return C7294c.f39994a.m37222a();
        }
    }

    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$b */
    /* loaded from: classes.dex */
    public static final class C7293b {
        private C7293b() {
        }

        public /* synthetic */ C7293b(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m37218a() {
            m37219b().m37191y();
        }

        /* renamed from: b */
        public final ZaloAnalytics m37219b() {
            return (ZaloAnalytics) ZaloAnalytics.f39965Q.getValue();
        }

        /* renamed from: c */
        public final void m37220c(InterfaceC23792b interfaceC23792b, JSONObject jSONObject) {
            AbstractC19074t.m100208f(interfaceC23792b, "timeProvider");
            AbstractC19074t.m100208f(jSONObject, "config");
            m37219b().m37163T(interfaceC23792b, jSONObject);
        }

        /* renamed from: d */
        public final void m37221d(Application application) {
            AbstractC19074t.m100208f(application, "application");
            m37219b().m37164U(application);
        }
    }

    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$c */
    /* loaded from: classes.dex */
    public static final class C7294c {

        /* renamed from: a */
        public static final C7294c f39994a = new C7294c();

        /* renamed from: b */
        private static final ZaloAnalytics f39995b = new ZaloAnalytics();

        private C7294c() {
        }

        /* renamed from: a */
        public final ZaloAnalytics m37222a() {
            return f39995b;
        }
    }

    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$d */
    /* loaded from: classes.dex */
    public enum EnumC7295d {
        APP_MODE(0),
        CHAT_HEAD(1);


        /* renamed from: p */
        private final int f39999p;

        EnumC7295d(int i11) {
            this.f39999p = i11;
        }
    }

    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$e */
    /* loaded from: classes3.dex */
    public static class C7296e {
        /* renamed from: a */
        public void mo37224a() {
        }

        /* renamed from: b */
        public void mo37225b() {
        }

        /* renamed from: c */
        public void mo37226c() {
        }

        /* renamed from: d */
        public void mo37227d(int i11, byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "byteBuf");
        }

        /* renamed from: e */
        public void mo2312e() {
        }

        /* renamed from: f */
        public void mo2313f() {
        }
    }

    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$f */
    /* loaded from: classes3.dex */
    public static final class C7297f extends C7296e {

        /* renamed from: b */
        final /* synthetic */ String f40001b;

        /* renamed from: c */
        final /* synthetic */ C7296e f40002c;

        /* renamed from: d */
        final /* synthetic */ C19057i0 f40003d;

        /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$f$a */
        /* loaded from: classes3.dex */
        public static final class a extends C7296e {

            /* renamed from: a */
            final /* synthetic */ ZaloAnalytics f40004a;

            /* renamed from: b */
            final /* synthetic */ C7296e f40005b;

            /* renamed from: c */
            final /* synthetic */ C19057i0 f40006c;

            a(ZaloAnalytics zaloAnalytics, C7296e c7296e, C19057i0 c19057i0) {
                this.f40004a = zaloAnalytics;
                this.f40005b = c7296e;
                this.f40006c = c19057i0;
            }

            @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
            /* renamed from: e */
            public void mo2312e() {
                this.f40004a.m37185n0();
                C7296e c7296e = this.f40005b;
                if (c7296e != null) {
                    c7296e.mo2312e();
                }
                if (this.f40006c.f94939p > 0) {
                    AbstractC20110a.m104542k(8, "[Event] Submit log event fail... time = " + System.currentTimeMillis(), new Object[0]);
                }
            }

            @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
            /* renamed from: f */
            public void mo2313f() {
                this.f40004a.m37181l0();
                C7296e c7296e = this.f40005b;
                if (c7296e != null) {
                    c7296e.mo2313f();
                }
                if (this.f40006c.f94939p > 0) {
                    AbstractC20110a.m104542k(8, "[Event] Submit log event success... time = " + System.currentTimeMillis(), new Object[0]);
                }
            }
        }

        C7297f(String str, C7296e c7296e, C19057i0 c19057i0) {
            this.f40001b = str;
            this.f40002c = c7296e;
            this.f40003d = c19057i0;
        }

        @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
        /* renamed from: c */
        public void mo37226c() {
            ZaloAnalytics.this.m37185n0();
            C7296e c7296e = this.f40002c;
            if (c7296e != null) {
                c7296e.mo2312e();
            }
        }

        @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
        /* renamed from: d */
        public void mo37227d(int i11, byte[] bArr) {
            AbstractC19074t.m100208f(bArr, "byteBuf");
            ZaloAnalytics zaloAnalytics = ZaloAnalytics.this;
            zaloAnalytics.m37158B(i11, bArr, zaloAnalytics.f39987u, this.f40001b, new a(ZaloAnalytics.this, this.f40002c, this.f40003d));
        }
    }

    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$g */
    /* loaded from: classes3.dex */
    public static final class C7298g implements InterfaceC20098e {

        /* renamed from: b */
        final /* synthetic */ C7296e f40008b;

        C7298g(C7296e c7296e) {
            this.f40008b = c7296e;
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: a */
        public void mo2128a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            ZaloAnalytics.this.f39988v = false;
            C7296e c7296e = this.f40008b;
            if (c7296e != null) {
                c7296e.mo2312e();
            }
            AbstractC20110a.m104542k(8, "[ZaloAnalytics] Submit to server fail !!! Message : " + c20096c.m104492d(), new Object[0]);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: b */
        public void mo2129b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            ZaloAnalytics.this.f39988v = false;
            C7296e c7296e = this.f40008b;
            if (c7296e != null) {
                c7296e.mo2313f();
            }
            AbstractC20110a.m104542k(8, "[ZaloAnalytics] Submit to server success : " + obj, new Object[0]);
        }

        @Override // hm0.InterfaceC20098e
        /* renamed from: c */
        public void mo2130c(long j11, String str) {
            AbstractC19074t.m100208f(str, "des");
        }
    }

    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$h */
    /* loaded from: classes3.dex */
    public static final class C7299h extends C7296e {

        /* renamed from: b */
        final /* synthetic */ String f40010b;

        /* renamed from: c */
        final /* synthetic */ C7296e f40011c;

        /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$h$a */
        /* loaded from: classes3.dex */
        public static final class a extends C7296e {

            /* renamed from: a */
            final /* synthetic */ ZaloAnalytics f40012a;

            /* renamed from: b */
            final /* synthetic */ String f40013b;

            /* renamed from: c */
            final /* synthetic */ C7296e f40014c;

            /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$h$a$a */
            /* loaded from: classes3.dex */
            public static final class C32701a extends C7296e {

                /* renamed from: a */
                final /* synthetic */ ZaloAnalytics f40015a;

                /* renamed from: b */
                final /* synthetic */ String f40016b;

                /* renamed from: c */
                final /* synthetic */ C7296e f40017c;

                /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$h$a$a$a */
                /* loaded from: classes3.dex */
                public static final class C32702a extends C7296e {

                    /* renamed from: a */
                    final /* synthetic */ ZaloAnalytics f40018a;

                    /* renamed from: b */
                    final /* synthetic */ C7296e f40019b;

                    C32702a(ZaloAnalytics zaloAnalytics, C7296e c7296e) {
                        this.f40018a = zaloAnalytics;
                        this.f40019b = c7296e;
                    }

                    @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
                    /* renamed from: e */
                    public void mo2312e() {
                        this.f40018a.m37177j0();
                        C7296e c7296e = this.f40019b;
                        if (c7296e != null) {
                            c7296e.mo2312e();
                        }
                    }

                    @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
                    /* renamed from: f */
                    public void mo2313f() {
                        this.f40018a.m37177j0();
                        C7296e c7296e = this.f40019b;
                        if (c7296e != null) {
                            c7296e.mo2313f();
                        }
                    }
                }

                C32701a(ZaloAnalytics zaloAnalytics, String str, C7296e c7296e) {
                    this.f40015a = zaloAnalytics;
                    this.f40016b = str;
                    this.f40017c = c7296e;
                }

                @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
                /* renamed from: c */
                public void mo37226c() {
                    this.f40015a.m37177j0();
                    C7296e c7296e = this.f40017c;
                    if (c7296e != null) {
                        c7296e.mo2312e();
                    }
                }

                @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
                /* renamed from: d */
                public void mo37227d(int i11, byte[] bArr) {
                    AbstractC19074t.m100208f(bArr, "byteBuf");
                    ZaloAnalytics zaloAnalytics = this.f40015a;
                    zaloAnalytics.m37158B(i11, bArr, zaloAnalytics.f39987u, this.f40016b, new C32702a(this.f40015a, this.f40017c));
                }
            }

            a(ZaloAnalytics zaloAnalytics, String str, C7296e c7296e) {
                this.f40012a = zaloAnalytics;
                this.f40013b = str;
                this.f40014c = c7296e;
            }

            @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
            /* renamed from: b */
            public void mo37225b() {
                ZaloAnalytics zaloAnalytics = this.f40012a;
                zaloAnalytics.m37159E(new C32701a(zaloAnalytics, this.f40013b, this.f40014c));
            }
        }

        C7299h(String str, C7296e c7296e) {
            this.f40010b = str;
            this.f40011c = c7296e;
        }

        @Override // com.zing.zalo.analytics.ZaloAnalytics.C7296e
        /* renamed from: a */
        public void mo37224a() {
            C0711j0.Companion.m1104a().m1095m(new a(ZaloAnalytics.this, this.f40010b, this.f40011c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$i */
    /* loaded from: classes.dex */
    public static final class C7300i extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C7300i f40020q = new C7300i();

        C7300i() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final HashMap mo12V4() {
            return new HashMap();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$j */
    /* loaded from: classes.dex */
    public static final class C7301j extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C7301j f40021q = new C7301j();

        C7301j() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Map mo12V4() {
            return Collections.synchronizedMap(new HashMap());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$k */
    /* loaded from: classes.dex */
    public static final class C7302k extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C7302k f40022q = new C7302k();

        C7302k() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final ArrayList mo12V4() {
            return new ArrayList();
        }
    }

    /* renamed from: com.zing.zalo.analytics.ZaloAnalytics$l */
    /* loaded from: classes.dex */
    public static final class C7303l extends C17487o0.j {
        C7303l() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zing.zalo.zview.C17487o0.j
        /* renamed from: b */
        public void mo37231b(C17487o0 c17487o0, ZaloView zaloView, Bundle bundle) {
            AbstractC19074t.m100208f(c17487o0, "fm");
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC20110a.m104535d("onZaloViewCreated: " + zaloView, new Object[0]);
            if (zaloView instanceof InterfaceC0733x) {
                InterfaceC0733x interfaceC0733x = (InterfaceC0733x) zaloView;
                if (!TextUtils.isEmpty(interfaceC0733x.getTrackingKey())) {
                    C0697c0.Companion.m1048b().m1039n().add(interfaceC0733x.getTrackingKey());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zing.zalo.zview.C17487o0.j
        /* renamed from: c */
        public void mo37232c(C17487o0 c17487o0, ZaloView zaloView) {
            AbstractC19074t.m100208f(c17487o0, "fm");
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC20110a.m104535d("onZaloViewDestroyed: " + zaloView, new Object[0]);
            if (zaloView instanceof InterfaceC0733x) {
                InterfaceC0733x interfaceC0733x = (InterfaceC0733x) zaloView;
                if (!TextUtils.isEmpty(interfaceC0733x.getTrackingKey())) {
                    C0697c0.Companion.m1048b().m1039n().remove(interfaceC0733x.getTrackingKey());
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zing.zalo.zview.C17487o0.j
        /* renamed from: e */
        public void mo37233e(C17487o0 c17487o0, ZaloView zaloView) {
            AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC20110a.m104535d("onZaloViewPaused: " + zaloView, new Object[0]);
            if (zaloView instanceof InterfaceC0733x) {
                C0697c0.Companion.m1048b().m1036i(((InterfaceC0733x) zaloView).getTrackingKey());
            }
        }

        @Override // com.zing.zalo.zview.C17487o0.j
        /* renamed from: f */
        public void mo37234f(C17487o0 c17487o0, ZaloView zaloView, Bundle bundle) {
            AbstractC19074t.m100208f(c17487o0, "fm");
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC20110a.m104535d("onZaloViewPreCreated: " + zaloView, new Object[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zing.zalo.zview.C17487o0.j
        /* renamed from: g */
        public void mo37235g(C17487o0 c17487o0, ZaloView zaloView) {
            Bundle bundle;
            AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC20110a.m104535d("onZaloViewResumed: " + zaloView, new Object[0]);
            if (zaloView instanceof InterfaceC0733x) {
                InterfaceC0733x interfaceC0733x = (InterfaceC0733x) zaloView;
                if (!ZaloAnalytics.this.m37214w(interfaceC0733x.getTrackingKey()) || ZaloAnalytics.this.m37203V(interfaceC0733x.getTrackingKey())) {
                    C0697c0.m1031x(C0697c0.Companion.m1048b(), interfaceC0733x.getTrackingKey(), false, 2, null);
                    Context m92648SI = zaloView.m92648SI();
                    if (m92648SI != null && (m92648SI instanceof ZaloTrackingActivity)) {
                        ((ZaloTrackingActivity) m92648SI).m37238G2(interfaceC0733x);
                    }
                    Bundle m92642L3 = zaloView.m92642L3();
                    if (m92642L3 != null && m92642L3.containsKey("EXTRA_DATA_TRACKING") && (bundle = m92642L3.getBundle("EXTRA_DATA_TRACKING")) != null) {
                        for (String str : bundle.keySet()) {
                            Object obj = bundle.get(str);
                            if (obj != null) {
                                C0697c0.b bVar = C0697c0.Companion;
                                String trackingKey = interfaceC0733x.getTrackingKey();
                                AbstractC19074t.m100207e(obj, "it1");
                                bVar.m1054h(trackingKey, str, obj);
                            }
                        }
                    }
                }
            }
        }

        @Override // com.zing.zalo.zview.C17487o0.j
        /* renamed from: i */
        public void mo37236i(C17487o0 c17487o0, ZaloView zaloView) {
            AbstractC19074t.m100208f(c17487o0, "fm");
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC20110a.m104535d("onZaloViewStarted: " + zaloView, new Object[0]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.zing.zalo.zview.C17487o0.j
        /* renamed from: j */
        public void mo37237j(C17487o0 c17487o0, ZaloView zaloView) {
            AbstractC19074t.m100208f(c17487o0, "fm");
            AbstractC19074t.m100208f(zaloView, "zaloView");
            AbstractC20110a.m104535d("onZaloViewStopped: " + zaloView, new Object[0]);
            if (zaloView instanceof InterfaceC0733x) {
                C0697c0.Companion.m1048b().m1036i(((InterfaceC0733x) zaloView).getTrackingKey());
            }
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C7292a.f39993q);
        f39965Q = m129210a;
    }

    public ZaloAnalytics() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(C7301j.f40021q);
        this.f39976K = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C7302k.f40022q);
        this.f39977L = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C7300i.f40020q);
        this.f39978M = m129210a3;
    }

    /* renamed from: B */
    public final void m37158B(int i11, byte[] bArr, String str, String str2, C7296e c7296e) {
        try {
            if (this.f39988v || TextUtils.isEmpty(str)) {
                return;
            }
            AbstractC20110a.m104535d("doUploadZaloAnalyticsToServer ... ", new Object[0]);
            this.f39988v = true;
            new C20097d().m104501g(str, bArr, new C7298g(c7296e), str2, CoreUtility.f89226b, CoreUtility.f89227c, i11);
        } catch (Throwable th2) {
            AbstractC20110a.m104539h(th2);
            this.f39988v = false;
            if (c7296e != null) {
                c7296e.mo2312e();
            }
        }
    }

    /* renamed from: E */
    public final void m37159E(C7296e c7296e) {
        this.f39986t.mo13474a(new Runnable() { // from class: ac.r0

            /* renamed from: q */
            public final /* synthetic */ ZaloAnalytics f2426q;

            public /* synthetic */ RunnableC0727r0(ZaloAnalytics this) {
                r2 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloAnalytics.m37160F(ZaloAnalytics.C7296e.this, r2);
            }
        });
    }

    /* renamed from: F */
    public static final void m37160F(C7296e c7296e, ZaloAnalytics zaloAnalytics) {
        AbstractC19074t.m100208f(zaloAnalytics, "this$0");
        try {
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            AnalyticsRoomDatabase m37245a = c7304a.m37245a(appContext);
            ArrayList arrayList = new ArrayList(m37245a.mo37243K().mo13256d());
            ArrayList arrayList2 = new ArrayList(m37245a.mo37241I().mo13209d());
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                if (c7296e != null) {
                    c7296e.mo37226c();
                    return;
                }
                return;
            }
            byte[] m37167b0 = zaloAnalytics.m37167b0(arrayList, arrayList2, m37245a);
            if (m37167b0 == null) {
                if (c7296e != null) {
                    c7296e.mo37226c();
                    return;
                }
                return;
            }
            byte[] m37175g0 = zaloAnalytics.m37175g0(m37167b0);
            if (m37175g0 == null) {
                if (c7296e != null) {
                    c7296e.mo37226c();
                }
            } else if (c7296e != null) {
                c7296e.mo37227d(m37175g0.length, m37175g0);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            if (c7296e != null) {
                c7296e.mo37226c();
            }
        }
    }

    /* renamed from: H */
    private final void m37161H(long j11, long j12, C7296e c7296e) {
        this.f39986t.mo13474a(new Runnable() { // from class: ac.o0

            /* renamed from: q */
            public final /* synthetic */ long f2398q;

            /* renamed from: r */
            public final /* synthetic */ long f2399r;

            /* renamed from: s */
            public final /* synthetic */ ZaloAnalytics f2400s;

            public /* synthetic */ RunnableC0721o0(long j112, long j122, ZaloAnalytics this) {
                r2 = j112;
                r4 = j122;
                r6 = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloAnalytics.m37162I(ZaloAnalytics.C7296e.this, r2, r4, r6);
            }
        });
    }

    /* renamed from: I */
    public static final void m37162I(C7296e c7296e, long j11, long j12, ZaloAnalytics zaloAnalytics) {
        AbstractC19074t.m100208f(zaloAnalytics, "this$0");
        try {
            C0711j0.b bVar = C0711j0.Companion;
            if (bVar.m1104a().m1096o() == null) {
                if (c7296e != null) {
                    c7296e.mo37226c();
                    return;
                }
                return;
            }
            C0722p m1096o = bVar.m1104a().m1096o();
            if (m1096o != null) {
                AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
                Context appContext = CoreUtility.getAppContext();
                AbstractC19074t.m100207e(appContext, "getAppContext()");
                AnalyticsRoomDatabase m37245a = c7304a.m37245a(appContext);
                ArrayList arrayList = new ArrayList(m37245a.mo37243K().mo13259g(j11, m1096o.m1152c()));
                ArrayList arrayList2 = new ArrayList(m37245a.mo37241I().mo13213h(j12));
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    if (c7296e != null) {
                        c7296e.mo37226c();
                        return;
                    }
                    return;
                }
                zaloAnalytics.f39980O = arrayList;
                zaloAnalytics.f39981P = arrayList2;
                byte[] m37167b0 = zaloAnalytics.m37167b0(arrayList, arrayList2, m37245a);
                if (m37167b0 == null) {
                    if (c7296e != null) {
                        c7296e.mo37226c();
                        return;
                    }
                    return;
                }
                byte[] m37175g0 = zaloAnalytics.m37175g0(m37167b0);
                if (m37175g0 == null) {
                    if (c7296e != null) {
                        c7296e.mo37226c();
                        return;
                    }
                    return;
                }
                AbstractC20110a.m104535d("dataParsed=" + m37167b0.length + ", dataProcessed=" + m37175g0.length, new Object[0]);
                AbstractC20110a.m104542k(8, "[ZaloAnalytics] data_submit_size = " + (m37175g0.length / 1024) + " kb, limit_total_submit_size=" + zaloAnalytics.f39973H + " kb", new Object[0]);
                if (c7296e != null) {
                    c7296e.mo37227d(m37175g0.length, m37175g0);
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            if (c7296e != null) {
                c7296e.mo37226c();
            }
        }
    }

    /* renamed from: T */
    public final void m37163T(InterfaceC23792b interfaceC23792b, JSONObject jSONObject) {
        if (this.f39982p) {
            return;
        }
        this.f39982p = true;
        m37210o0(interfaceC23792b);
        boolean optBoolean = jSONObject.optBoolean("enable");
        this.f39985s = optBoolean;
        if (!optBoolean) {
            return;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("submit");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        m37173f0(optJSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("config");
        if (optJSONObject2 == null) {
            optJSONObject2 = new JSONObject();
        }
        m37169c0(optJSONObject2);
        C0711j0 m1104a = C0711j0.Companion.m1104a();
        JSONObject optJSONObject3 = jSONObject.optJSONObject("sessions_tracking");
        if (optJSONObject3 == null) {
            optJSONObject3 = new JSONObject();
        }
        m1104a.m1098q(optJSONObject3, this.f39985s);
        C0697c0 m1048b = C0697c0.Companion.m1048b();
        JSONObject optJSONObject4 = jSONObject.optJSONObject("screens_tracking");
        if (optJSONObject4 == null) {
            optJSONObject4 = new JSONObject();
        }
        m1048b.m1040p(optJSONObject4);
        C0717m0 m1125a = C0717m0.Companion.m1125a();
        JSONObject optJSONObject5 = jSONObject.optJSONObject("views_tracking");
        if (optJSONObject5 == null) {
            optJSONObject5 = new JSONObject();
        }
        m1125a.m1117i(optJSONObject5);
        C0732w m1189a = C0732w.Companion.m1189a();
        JSONObject optJSONObject6 = jSONObject.optJSONObject("events_tracking");
        if (optJSONObject6 == null) {
            optJSONObject6 = new JSONObject();
        }
        m1189a.m1184m(optJSONObject6);
    }

    /* renamed from: U */
    public final void m37164U(Application application) {
        application.registerActivityLifecycleCallbacks(Companion.m37219b());
    }

    /* renamed from: a0 */
    private final void m37165a0(C28825a c28825a, JSONArray jSONArray, int[] iArr, byte[] bArr) {
        if (jSONArray.length() <= 0) {
            return;
        }
        int length = jSONArray.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (jSONArray.get(i11) instanceof Boolean) {
                AbstractC3406a.m17109j(c28825a);
                Object obj = jSONArray.get(i11);
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type kotlin.Boolean");
                AbstractC3406a.m17107h(c28825a, ((Boolean) obj).booleanValue());
                iArr[i11] = AbstractC3406a.m17108i(c28825a);
                bArr[i11] = 1;
            } else if (jSONArray.get(i11) instanceof Integer) {
                AbstractC3409d.m17129j(c28825a);
                Object obj2 = jSONArray.get(i11);
                AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type kotlin.Int");
                AbstractC3409d.m17127h(c28825a, ((Integer) obj2).intValue());
                iArr[i11] = AbstractC3409d.m17128i(c28825a);
                bArr[i11] = 2;
            } else if (jSONArray.get(i11) instanceof String) {
                Object obj3 = jSONArray.get(i11);
                AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
                int mo101957o = c28825a.mo101957o((String) obj3);
                AbstractC3416k.m17177j(c28825a);
                AbstractC3416k.m17175h(c28825a, mo101957o);
                iArr[i11] = AbstractC3416k.m17176i(c28825a);
                bArr[i11] = 5;
            } else if (jSONArray.get(i11) instanceof Long) {
                AbstractC3411f.m17137j(c28825a);
                Object obj4 = jSONArray.get(i11);
                AbstractC19074t.m100206d(obj4, "null cannot be cast to non-null type kotlin.Long");
                AbstractC3411f.m17135h(c28825a, ((Long) obj4).longValue());
                iArr[i11] = AbstractC3411f.m17136i(c28825a);
                bArr[i11] = 4;
            } else if (jSONArray.get(i11) instanceof Double) {
                AbstractC3407b.m17112j(c28825a);
                Object obj5 = jSONArray.get(i11);
                AbstractC19074t.m100206d(obj5, "null cannot be cast to non-null type kotlin.Double");
                AbstractC3407b.m17110h(c28825a, ((Double) obj5).doubleValue());
                iArr[i11] = AbstractC3407b.m17111i(c28825a);
                bArr[i11] = 3;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x02b9 A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:8:0x0014, B:11:0x002c, B:13:0x0050, B:15:0x00b2, B:17:0x00cc, B:19:0x012b, B:21:0x013f, B:23:0x014e, B:24:0x0154, B:26:0x017c, B:27:0x017f, B:31:0x018c, B:33:0x0195, B:35:0x019e, B:37:0x01a1, B:39:0x01a6, B:43:0x01bb, B:45:0x01c3, B:47:0x01d0, B:49:0x01f7, B:51:0x0209, B:53:0x0211, B:55:0x0227, B:59:0x022d, B:60:0x0237, B:62:0x0241, B:66:0x025d, B:70:0x0266, B:72:0x026a, B:73:0x0275, B:75:0x027f, B:77:0x028e, B:78:0x0294, B:81:0x02b0, B:84:0x02b9, B:86:0x02be, B:87:0x02c1, B:91:0x02cd, B:93:0x02d6, B:95:0x02df, B:97:0x02e2, B:99:0x02e7, B:89:0x02f0, B:108:0x02f8, B:29:0x01b0), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02be A[Catch: Exception -> 0x00af, TryCatch #0 {Exception -> 0x00af, blocks: (B:8:0x0014, B:11:0x002c, B:13:0x0050, B:15:0x00b2, B:17:0x00cc, B:19:0x012b, B:21:0x013f, B:23:0x014e, B:24:0x0154, B:26:0x017c, B:27:0x017f, B:31:0x018c, B:33:0x0195, B:35:0x019e, B:37:0x01a1, B:39:0x01a6, B:43:0x01bb, B:45:0x01c3, B:47:0x01d0, B:49:0x01f7, B:51:0x0209, B:53:0x0211, B:55:0x0227, B:59:0x022d, B:60:0x0237, B:62:0x0241, B:66:0x025d, B:70:0x0266, B:72:0x026a, B:73:0x0275, B:75:0x027f, B:77:0x028e, B:78:0x0294, B:81:0x02b0, B:84:0x02b9, B:86:0x02be, B:87:0x02c1, B:91:0x02cd, B:93:0x02d6, B:95:0x02df, B:97:0x02e2, B:99:0x02e7, B:89:0x02f0, B:108:0x02f8, B:29:0x01b0), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f0 A[Catch: Exception -> 0x00af, LOOP:5: B:46:0x01ce->B:89:0x02f0, LOOP_END, TryCatch #0 {Exception -> 0x00af, blocks: (B:8:0x0014, B:11:0x002c, B:13:0x0050, B:15:0x00b2, B:17:0x00cc, B:19:0x012b, B:21:0x013f, B:23:0x014e, B:24:0x0154, B:26:0x017c, B:27:0x017f, B:31:0x018c, B:33:0x0195, B:35:0x019e, B:37:0x01a1, B:39:0x01a6, B:43:0x01bb, B:45:0x01c3, B:47:0x01d0, B:49:0x01f7, B:51:0x0209, B:53:0x0211, B:55:0x0227, B:59:0x022d, B:60:0x0237, B:62:0x0241, B:66:0x025d, B:70:0x0266, B:72:0x026a, B:73:0x0275, B:75:0x027f, B:77:0x028e, B:78:0x0294, B:81:0x02b0, B:84:0x02b9, B:86:0x02be, B:87:0x02c1, B:91:0x02cd, B:93:0x02d6, B:95:0x02df, B:97:0x02e2, B:99:0x02e7, B:89:0x02f0, B:108:0x02f8, B:29:0x01b0), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02cd A[SYNTHETIC] */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final byte[] m37167b0(ArrayList arrayList, ArrayList arrayList2, AnalyticsRoomDatabase analyticsRoomDatabase) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] m37172e0;
        boolean z11;
        boolean z12;
        int i16;
        int i17;
        int[] m37172e02;
        if (arrayList.isEmpty() && arrayList2.isEmpty()) {
            return null;
        }
        try {
            int i18 = this.f39973H * 5120;
            C28825a c28825a = new C28825a(0);
            int[] iArr = new int[arrayList.size()];
            int size = arrayList.size();
            int i19 = 0;
            while (true) {
                int i21 = 1;
                if (i19 >= size) {
                    break;
                }
                Object obj = arrayList.get(i19);
                AbstractC19074t.m100207e(obj, "sessionList[i]");
                C2722i c2722i = (C2722i) obj;
                List mo13236f = analyticsRoomDatabase.mo37242J().mo13236f(c2722i.m13270f());
                int[] iArr2 = new int[mo13236f.size()];
                int size2 = mo13236f.size();
                int i22 = 0;
                while (i22 < size2) {
                    C2719f c2719f = (C2719f) mo13236f.get(i22);
                    int mo101957o = c28825a.mo101957o(c2719f.m13245e());
                    int[] iArr3 = new int[i21];
                    iArr3[0] = c28825a.mo101957o(c2719f.m13247g());
                    int m17145o = AbstractC3412g.m17145o(c28825a, iArr3);
                    int mo101957o2 = c28825a.mo101957o(c2719f.m13243c());
                    AbstractC3412g.m17147q(c28825a);
                    AbstractC3412g.m17141k(c28825a, mo101957o);
                    AbstractC3412g.m17143m(c28825a, m17145o);
                    AbstractC3412g.m17138h(c28825a, c2719f.m13241a());
                    AbstractC3412g.m17144n(c28825a, c2719f.m13248h());
                    AbstractC3412g.m17139i(c28825a, c2719f.m13242b());
                    AbstractC3412g.m17142l(c28825a, c2719f.m13246f());
                    AbstractC3412g.m17140j(c28825a, mo101957o2);
                    iArr2[i22] = AbstractC3412g.m17146p(c28825a);
                    i22++;
                    i18 = i18;
                    i21 = 1;
                }
                int i23 = i18;
                List mo13276b = analyticsRoomDatabase.mo37244L().mo13276b(c2722i.m13270f());
                int[] iArr4 = new int[mo13276b.size()];
                int size3 = mo13276b.size();
                int i24 = 0;
                while (i24 < size3) {
                    C2725l c2725l = (C2725l) mo13276b.get(i24);
                    int mo101957o3 = c28825a.mo101957o(c2725l.m13288f());
                    int mo101957o4 = c28825a.mo101957o(c2725l.m13289g());
                    List list = mo13276b;
                    int mo101957o5 = c28825a.mo101957o(c2725l.m13283a());
                    int i25 = size3;
                    int mo101957o6 = c28825a.mo101957o(c2725l.m13286d());
                    AbstractC3415j.m17174p(c28825a);
                    AbstractC3415j.m17170l(c28825a, mo101957o3);
                    AbstractC3415j.m17171m(c28825a, mo101957o4);
                    AbstractC3415j.m17172n(c28825a, c2725l.m13290h());
                    AbstractC3415j.m17168j(c28825a, c2725l.m13285c());
                    AbstractC3415j.m17167i(c28825a, c2725l.m13284b());
                    AbstractC3415j.m17166h(c28825a, mo101957o5);
                    AbstractC3415j.m17169k(c28825a, mo101957o6);
                    iArr4[i24] = AbstractC3415j.m17173o(c28825a);
                    i24++;
                    iArr = iArr;
                    i23 = i23;
                    mo13276b = list;
                    size3 = i25;
                }
                int i26 = i23;
                int[] iArr5 = iArr;
                int m17156p = AbstractC3413h.m17156p(c28825a, iArr2);
                int m17157q = AbstractC3413h.m17157q(c28825a, iArr4);
                if (c2722i.m13267c().length() > 0 && (m37172e02 = m37172e0(c28825a, new JSONObject(c2722i.m13267c()))) != null) {
                    i17 = AbstractC3413h.m17155o(c28825a, m37172e02);
                } else {
                    i17 = -1;
                }
                AbstractC3413h.m17159s(c28825a);
                AbstractC3413h.m17151k(c28825a, c2722i.m13270f());
                AbstractC3413h.m17149i(c28825a, c2722i.m13266b());
                AbstractC3413h.m17153m(c28825a, c2722i.m13269e());
                AbstractC3413h.m17148h(c28825a, c2722i.m13265a());
                AbstractC3413h.m17152l(c28825a, m17156p);
                AbstractC3413h.m17154n(c28825a, m17157q);
                if (i17 > -1) {
                    AbstractC3413h.m17150j(c28825a, i17);
                }
                iArr5[i19] = AbstractC3413h.m17158r(c28825a);
                i18 = i26;
                if (c28825a.m144107w() > i18) {
                    int size4 = arrayList.size() - 1;
                    int i27 = i19 + 1;
                    if (i27 <= size4) {
                        while (true) {
                            arrayList.remove(arrayList.get(size4));
                            if (size4 == i27) {
                                break;
                            }
                            size4--;
                        }
                    }
                    int[] iArr6 = new int[i27];
                    for (int i28 = 0; i28 < i27; i28++) {
                        iArr6[i28] = iArr5[i28];
                    }
                    iArr = iArr6;
                } else {
                    i19++;
                    iArr = iArr5;
                }
            }
            int[] iArr7 = new int[0];
            if (c28825a.m144107w() <= i18) {
                iArr7 = new int[arrayList2.size()];
                int size5 = arrayList2.size();
                int i29 = 0;
                while (true) {
                    if (i29 >= size5) {
                        break;
                    }
                    Object obj2 = arrayList2.get(i29);
                    AbstractC19074t.m100207e(obj2, "eventList[i]");
                    C2716c c2716c = (C2716c) obj2;
                    int mo101957o7 = c28825a.mo101957o(c2716c.m13218a());
                    int mo101957o8 = c28825a.mo101957o(c2716c.m13225h());
                    if (c2716c.m13223f().length() > 0) {
                        JSONArray jSONArray = new JSONArray(c2716c.m13223f());
                        int length = jSONArray.length();
                        int[] iArr8 = new int[length];
                        int i31 = 0;
                        while (i31 < length) {
                            if (jSONArray.get(i31) instanceof String) {
                                Object obj3 = jSONArray.get(i31);
                                i16 = size5;
                                AbstractC19074t.m100206d(obj3, "null cannot be cast to non-null type kotlin.String");
                                iArr8[i31] = c28825a.mo101957o((String) obj3);
                            } else {
                                i16 = size5;
                            }
                            i31++;
                            size5 = i16;
                        }
                        i11 = size5;
                        i12 = AbstractC3408c.m17124s(c28825a, iArr8);
                    } else {
                        i11 = size5;
                        i12 = -1;
                    }
                    if (c2716c.m13219b().length() > 0) {
                        JSONArray jSONArray2 = new JSONArray(c2716c.m13219b());
                        int length2 = jSONArray2.length();
                        int[] iArr9 = new int[length2];
                        byte[] bArr = new byte[length2];
                        m37165a0(c28825a, jSONArray2, iArr9, bArr);
                        if (length2 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            if (length2 == 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                i13 = AbstractC3408c.m17122q(c28825a, iArr9);
                                i14 = AbstractC3408c.m17121p(c28825a, bArr);
                                if (c2716c.m13221d().length() <= 0 && (m37172e0 = m37172e0(c28825a, new JSONObject(c2716c.m13221d()))) != null) {
                                    i15 = AbstractC3408c.m17123r(c28825a, m37172e0);
                                } else {
                                    i15 = -1;
                                }
                                AbstractC3408c.m17126u(c28825a);
                                AbstractC3408c.m17116k(c28825a, mo101957o7);
                                AbstractC3408c.m17120o(c28825a, c2716c.m13220c());
                                AbstractC3408c.m17118m(c28825a, c2716c.m13224g());
                                AbstractC3408c.m17119n(c28825a, mo101957o8);
                                if (i13 > -1 && i14 > -1) {
                                    AbstractC3408c.m17113h(c28825a, i13);
                                    AbstractC3408c.m17114i(c28825a, i14);
                                }
                                if (i15 > -1) {
                                    AbstractC3408c.m17115j(c28825a, i15);
                                }
                                if (i12 > -1) {
                                    AbstractC3408c.m17117l(c28825a, i12);
                                }
                                iArr7[i29] = AbstractC3408c.m17125t(c28825a);
                                if (c28825a.m144107w() <= i18) {
                                    int size6 = arrayList2.size() - 1;
                                    int i32 = i29 + 1;
                                    if (i32 <= size6) {
                                        while (true) {
                                            arrayList2.remove(arrayList2.get(size6));
                                            if (size6 == i32) {
                                                break;
                                            }
                                            size6--;
                                        }
                                    }
                                    int[] iArr10 = new int[i32];
                                    for (int i33 = 0; i33 < i32; i33++) {
                                        iArr10[i33] = iArr7[i33];
                                    }
                                    iArr7 = iArr10;
                                } else {
                                    i29++;
                                    size5 = i11;
                                }
                            }
                        }
                    }
                    i13 = -1;
                    i14 = -1;
                    if (c2716c.m13221d().length() <= 0) {
                    }
                    i15 = -1;
                    AbstractC3408c.m17126u(c28825a);
                    AbstractC3408c.m17116k(c28825a, mo101957o7);
                    AbstractC3408c.m17120o(c28825a, c2716c.m13220c());
                    AbstractC3408c.m17118m(c28825a, c2716c.m13224g());
                    AbstractC3408c.m17119n(c28825a, mo101957o8);
                    if (i13 > -1) {
                        AbstractC3408c.m17113h(c28825a, i13);
                        AbstractC3408c.m17114i(c28825a, i14);
                    }
                    if (i15 > -1) {
                    }
                    if (i12 > -1) {
                    }
                    iArr7[i29] = AbstractC3408c.m17125t(c28825a);
                    if (c28825a.m144107w() <= i18) {
                    }
                }
            }
            int m17163k = AbstractC3414i.m17163k(c28825a, iArr);
            int m17162j = AbstractC3414i.m17162j(c28825a, iArr7);
            AbstractC3414i.m17165m(c28825a);
            AbstractC3414i.m17161i(c28825a, m17163k);
            AbstractC3414i.m17160h(c28825a, m17162j);
            c28825a.m144103r(AbstractC3414i.m17164l(c28825a));
            return c28825a.m144082F();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: c0 */
    private final void m37169c0(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("extra_data");
        if (optJSONObject != null) {
            AbstractC19074t.m100207e(optJSONObject, "optJSONObject(\"extra_data\")");
            this.f39971F = optJSONObject.optInt("limit_field", 10);
            this.f39972G = optJSONObject.optInt("limit_value_length", 50);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("event_data");
        if (optJSONObject2 != null) {
            AbstractC19074t.m100207e(optJSONObject2, "optJSONObject(\"event_data\")");
            this.f39974I = optJSONObject2.optInt("limit_total_size", 1024);
            AbstractC20110a.m104542k(8, "[ZaloAnalytics] Parse config ... limit_total_size = " + this.f39974I, new Object[0]);
        }
        this.f39973H = jSONObject.optInt("limit_total_submit_size", 49);
        AbstractC20110a.m104542k(8, "[ZaloAnalytics] Parse config ... limit_total_submit_size = " + this.f39973H, new Object[0]);
    }

    /* renamed from: e0 */
    private final int[] m37172e0(C28825a c28825a, JSONObject jSONObject) {
        int i11;
        if (jSONObject.length() <= 0) {
            return null;
        }
        int[] iArr = new int[jSONObject.length()];
        Iterator<String> keys = jSONObject.keys();
        AbstractC19074t.m100207e(keys, "jsonObject.keys()");
        int i12 = 0;
        while (keys.hasNext()) {
            String next = keys.next();
            int mo101957o = c28825a.mo101957o(next);
            if (jSONObject.opt(next) instanceof Boolean) {
                AbstractC3406a.m17109j(c28825a);
                AbstractC3406a.m17107h(c28825a, jSONObject.optBoolean(next));
                i11 = i12 + 1;
                iArr[i12] = AbstractC3410e.m17133k(c28825a, mo101957o, (byte) 1, AbstractC3406a.m17108i(c28825a));
            } else if (jSONObject.opt(next) instanceof Integer) {
                AbstractC3409d.m17129j(c28825a);
                AbstractC3409d.m17127h(c28825a, jSONObject.optInt(next));
                i11 = i12 + 1;
                iArr[i12] = AbstractC3410e.m17133k(c28825a, mo101957o, (byte) 2, AbstractC3409d.m17128i(c28825a));
            } else if (jSONObject.opt(next) instanceof Double) {
                AbstractC3407b.m17112j(c28825a);
                AbstractC3407b.m17110h(c28825a, jSONObject.optDouble(next));
                i11 = i12 + 1;
                iArr[i12] = AbstractC3410e.m17133k(c28825a, mo101957o, (byte) 3, AbstractC3407b.m17111i(c28825a));
            } else if (jSONObject.opt(next) instanceof Long) {
                AbstractC3411f.m17137j(c28825a);
                AbstractC3411f.m17135h(c28825a, jSONObject.optLong(next));
                i11 = i12 + 1;
                iArr[i12] = AbstractC3410e.m17133k(c28825a, mo101957o, (byte) 4, AbstractC3411f.m17136i(c28825a));
            } else if (jSONObject.opt(next) instanceof String) {
                int mo101957o2 = c28825a.mo101957o(jSONObject.optString(next));
                AbstractC3416k.m17177j(c28825a);
                AbstractC3416k.m17175h(c28825a, mo101957o2);
                i11 = i12 + 1;
                iArr[i12] = AbstractC3410e.m17133k(c28825a, mo101957o, (byte) 5, AbstractC3416k.m17176i(c28825a));
            }
            i12 = i11;
        }
        return iArr;
    }

    /* renamed from: f0 */
    private final void m37173f0(JSONObject jSONObject) {
        String optString = jSONObject.optString("api_url");
        AbstractC19074t.m100207e(optString, "this.optString(\"api_url\")");
        this.f39987u = optString;
        this.f39989w = jSONObject.optLong("time_interval");
        this.f39990x = jSONObject.optInt("number_sessions", 3);
        this.f39991y = jSONObject.optInt("max_sessions", 100);
        this.f39992z = jSONObject.optLong("session_expired_time", 604800L);
        this.f39966A = jSONObject.optInt("number_events", 50);
        int optInt = jSONObject.optInt("max_events", ZMediaPlayerSettings.VideoConfig.MIN_PACKET_SIZE);
        this.f39967B = optInt;
        this.f39968C = optInt * 10;
        this.f39969D = jSONObject.optLong("event_expired_time", 604800L);
        this.f39970E = jSONObject.optLong("min_time");
    }

    /* renamed from: g0 */
    private final byte[] m37175g0(byte[] bArr) {
        try {
            byte[] m37215x = m37215x(bArr);
            byte[] m89297a = Utils.m89297a(2);
            AbstractC19074t.m100207e(m89297a, "getStaticValue(com.zing.…s.TYPE_ZALO_TRACKING_KEY)");
            return AbstractC17527f.m93442f(m37215x, m89297a, m37215x.length);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: j0 */
    public final void m37177j0() {
        this.f39986t.mo13474a(new Runnable() { // from class: ac.q0
            @Override // java.lang.Runnable
            public final void run() {
                ZaloAnalytics.m37179k0();
            }
        });
    }

    /* renamed from: k0 */
    public static final void m37179k0() {
        try {
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            AnalyticsRoomDatabase m37245a = c7304a.m37245a(appContext);
            m37245a.mo37242J().mo13231a();
            m37245a.mo37244L().mo13275a();
            m37245a.mo37243K().mo13253a();
            m37245a.mo37241I().mo13206a();
            C0711j0.Companion.m1104a().m1101v(0L);
            C0732w.Companion.m1189a().m1186p(0L);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: l0 */
    public final void m37181l0() {
        this.f39986t.mo13474a(new Runnable() { // from class: ac.p0
            public /* synthetic */ RunnableC0723p0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                ZaloAnalytics.m37183m0(ZaloAnalytics.this);
            }
        });
    }

    /* renamed from: m0 */
    public static final void m37183m0(ZaloAnalytics zaloAnalytics) {
        AbstractC19074t.m100208f(zaloAnalytics, "this$0");
        try {
            AnalyticsRoomDatabase.C7304a c7304a = AnalyticsRoomDatabase.Companion;
            Context appContext = CoreUtility.getAppContext();
            AbstractC19074t.m100207e(appContext, "getAppContext()");
            AnalyticsRoomDatabase m37245a = c7304a.m37245a(appContext);
            ArrayList arrayList = zaloAnalytics.f39980O;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m37245a.mo37242J().mo13235e(((C2722i) arrayList.get(i11)).m13270f());
                    m37245a.mo37244L().mo13277c(((C2722i) arrayList.get(i11)).m13270f());
                }
                int mo13255c = m37245a.mo37243K().mo13255c(arrayList);
                C0711j0 m1104a = C0711j0.Companion.m1104a();
                m1104a.m1101v(m1104a.m1097p() - mo13255c);
                zaloAnalytics.f39980O = null;
            }
            ArrayList arrayList2 = zaloAnalytics.f39981P;
            if (arrayList2 != null) {
                int mo13208c = m37245a.mo37241I().mo13208c(arrayList2);
                C0732w m1189a = C0732w.Companion.m1189a();
                m1189a.m1186p(m1189a.m1183l() - mo13208c);
                zaloAnalytics.f39981P = null;
            }
            zaloAnalytics.f39979N = false;
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: n0 */
    public final void m37185n0() {
        this.f39979N = false;
        this.f39981P = null;
        this.f39980O = null;
    }

    /* renamed from: y */
    public final void m37191y() {
        this.f39982p = false;
        C0711j0.Companion.m1104a().m1092h();
        C0717m0.Companion.m1125a().m1114f();
        C0697c0.Companion.m1048b().m1034g();
        C0732w.Companion.m1189a().m1181i();
    }

    /* renamed from: C */
    public final void m37192C(String str, C7296e c7296e) {
        AbstractC19074t.m100208f(str, "httpHeaderViewerKeyFromServer");
        C0697c0.Companion.m1048b().m1037k(new C7299h(str, c7296e));
    }

    /* renamed from: D */
    public final C0692a m37193D() {
        return this.f39983q;
    }

    /* renamed from: J */
    public final Map m37194J() {
        return (Map) this.f39978M.getValue();
    }

    /* renamed from: K */
    public final Map m37195K() {
        Object value = this.f39976K.getValue();
        AbstractC19074t.m100207e(value, "<get-mappingZaloViewManager>(...)");
        return (Map) value;
    }

    /* renamed from: M */
    public final int m37196M() {
        return this.f39968C;
    }

    /* renamed from: N */
    public final List m37197N() {
        return (List) this.f39977L.getValue();
    }

    /* renamed from: O */
    public final InterfaceC23792b m37198O() {
        InterfaceC23792b interfaceC23792b = this.f39984r;
        if (interfaceC23792b != null) {
            return interfaceC23792b;
        }
        AbstractC19074t.m100223u("timeProvider");
        return null;
    }

    /* renamed from: P */
    public final EnumC7295d m37199P() {
        return this.f39975J;
    }

    /* renamed from: Q */
    public final int m37200Q() {
        return this.f39971F;
    }

    /* renamed from: R */
    public final int m37201R() {
        return this.f39972G;
    }

    /* renamed from: S */
    public final int m37202S() {
        return this.f39974I;
    }

    /* renamed from: V */
    public final boolean m37203V(String str) {
        AbstractC19074t.m100208f(str, "screenName");
        Iterator it = m37197N().iterator();
        while (it.hasNext()) {
            if (((C0718n) it.next()).m1130d(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: W */
    public final boolean m37204W() {
        return this.f39982p && this.f39985s;
    }

    /* renamed from: X */
    public final boolean m37205X() {
        return this.f39982p;
    }

    /* renamed from: Y */
    public final void m37206Y() {
        if (!m37204W()) {
            return;
        }
        AbstractC20110a.m104535d("onEnterBackground", new Object[0]);
        if (this.f39975J == EnumC7295d.APP_MODE) {
            C0711j0.Companion.m1104a().m1094k(C0722p.a.NORMAL_END);
        }
    }

    /* renamed from: Z */
    public final void m37207Z() {
        if (!m37204W()) {
            return;
        }
        AbstractC20110a.m104535d("onEnterForeground", new Object[0]);
        this.f39975J = EnumC7295d.APP_MODE;
        C0711j0.Companion.m1104a().m1102w(C0722p.b.APP_RESUME);
    }

    /* renamed from: h0 */
    public final void m37208h0(C0718n c0718n) {
        AbstractC19074t.m100208f(c0718n, "pagerScreenTracker");
        m37197N().add(c0718n);
    }

    /* renamed from: i0 */
    public final void m37209i0(C17487o0 c17487o0) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        if (m37195K().containsKey(c17487o0)) {
            return;
        }
        C7303l c7303l = new C7303l();
        c17487o0.m92997E1(c7303l, true);
        m37195K().put(c17487o0, c7303l);
    }

    /* renamed from: o0 */
    public final void m37210o0(InterfaceC23792b interfaceC23792b) {
        AbstractC19074t.m100208f(interfaceC23792b, "<set-?>");
        this.f39984r = interfaceC23792b;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC19074t.m100208f(activity, "activity");
        if (activity instanceof InterfaceC0724q) {
            this.f39975J = EnumC7295d.APP_MODE;
            this.f39983q.m1008c(activity);
            if (activity instanceof ZaloActivity) {
                AbstractC20110a.m104535d("registerZaloViewLifecycleCallbacks %s", bundle);
                C17487o0 mo35579p = ((ZaloActivity) activity).mo35579p();
                AbstractC19074t.m100207e(mo35579p, "activity.zaloViewManager");
                m37209i0(mo35579p);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC20110a.m104535d("onActivityDestroyed", new Object[0]);
        if (activity instanceof InterfaceC0724q) {
            m37195K().clear();
            this.f39983q.m1009d(activity);
        }
        if (activity instanceof ZaloTrackingActivity) {
            ((ZaloTrackingActivity) activity).m37238G2(null);
        }
        if (this.f39983q.m1007b() == 0 && m37204W() && this.f39975J == EnumC7295d.APP_MODE) {
            AbstractC20110a.m104535d("onActivityDestroyed ... endSession", new Object[0]);
            C0711j0.Companion.m1104a().m1094k(C0722p.a.NORMAL_END);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC20110a.m104535d("onActivityPaused", new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC20110a.m104535d("onActivityResumed", new Object[0]);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC19074t.m100208f(bundle, "outState");
        AbstractC20110a.m104535d("onActivitySaveInstanceState", new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        if (activity instanceof InterfaceC0724q) {
            this.f39975J = EnumC7295d.APP_MODE;
            C0711j0.Companion.m1104a().m1102w(((InterfaceC0724q) activity).mo1166l0());
            this.f39983q.m1010e(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC19074t.m100208f(activity, "activity");
        AbstractC20110a.m104535d("onActivityStopped ... " + activity, new Object[0]);
        if (activity instanceof InterfaceC0724q) {
            this.f39983q.m1011f(activity);
        }
    }

    /* renamed from: p0 */
    public final void m37211p0(EnumC7295d enumC7295d) {
        AbstractC19074t.m100208f(enumC7295d, "value");
        this.f39975J = enumC7295d;
    }

    /* renamed from: q0 */
    public final void m37212q0(C0718n c0718n) {
        AbstractC19074t.m100208f(c0718n, "pagerScreenTracker");
        m37197N().remove(c0718n);
    }

    /* renamed from: r0 */
    public final void m37213r0(C17487o0 c17487o0) {
        C17487o0.j jVar;
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        if (m37195K().containsKey(c17487o0) && (jVar = (C17487o0.j) m37195K().get(c17487o0)) != null) {
            c17487o0.m93075n2(jVar);
            m37195K().remove(c17487o0);
        }
    }

    /* renamed from: w */
    public final boolean m37214w(String str) {
        AbstractC19074t.m100208f(str, "screenName");
        Iterator it = m37197N().iterator();
        while (it.hasNext()) {
            if (((C0718n) it.next()).m1127a(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public final byte[] m37215x(byte[] bArr) {
        AbstractC19074t.m100208f(bArr, "bytebuf");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        AbstractC19074t.m100207e(byteArray, "compressed");
        return byteArray;
    }

    /* renamed from: z */
    public final void m37216z(long j11, String str, C7296e c7296e) {
        AbstractC19074t.m100208f(str, "httpHeaderViewerKeyFromServer");
        C0711j0.b bVar = C0711j0.Companion;
        if ((bVar.m1104a().m1097p() <= 0 && C0732w.Companion.m1189a().m1183l() <= 0) || this.f39979N) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - j11;
        long j12 = 1000;
        if (currentTimeMillis >= this.f39970E * j12) {
            if (currentTimeMillis >= this.f39989w * j12 || bVar.m1104a().m1097p() > this.f39990x || C0732w.Companion.m1189a().m1183l() > this.f39966A) {
                this.f39979N = true;
                try {
                    if (bVar.m1104a().m1097p() > this.f39991y) {
                        bVar.m1104a().m1093i(System.currentTimeMillis() - this.f39992z);
                    }
                    C0732w.b bVar2 = C0732w.Companion;
                    if (bVar2.m1189a().m1183l() > this.f39967B) {
                        bVar2.m1189a().m1182j(System.currentTimeMillis() - this.f39969D);
                    }
                    long m1097p = bVar.m1104a().m1097p();
                    int i11 = this.f39991y;
                    if (m1097p > i11) {
                        m1097p = i11;
                    }
                    long j13 = m1097p;
                    C19057i0 c19057i0 = new C19057i0();
                    long m1183l = bVar2.m1189a().m1183l();
                    c19057i0.f94939p = m1183l;
                    int i12 = this.f39967B;
                    if (m1183l > i12) {
                        c19057i0.f94939p = i12;
                    }
                    m37161H(j13, c19057i0.f94939p, new C7297f(str, c7296e, c19057i0));
                } catch (Exception e11) {
                    AbstractC20110a.m104539h(e11);
                    m37185n0();
                    if (c7296e != null) {
                        c7296e.mo2312e();
                    }
                }
            }
        }
    }
}
