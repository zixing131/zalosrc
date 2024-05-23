package com.zing.zalo.common;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.widget.ImageView;
import au.AbstractC2361n;
import com.google.android.gms.ads.RequestConfiguration;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.C7852a;
import com.zing.zalo.common.C7853b;
import com.zing.zalo.uicontrol.C16673w;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import i40.AbstractC20273c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import ln0.AbstractC22543l;
import me0.AbstractC23041d2;
import mm0.AbstractC23350e;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.C24329j;
import p098dc.AbstractC17867a;
import p516t3.C26469c;
import p516t3.C26473g;
import p530tx.AbstractC26903a;
import p536u3.AbstractC27005l;
import p566v3.C27501i;
import p566v3.C27508p;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import vg.AbstractC28054e7;
import vg.C28111k4;
import vg.C28201u4;
import xm0.AbstractC30166b;
import xm0.InterfaceC30165a;

/* renamed from: com.zing.zalo.common.a */
/* loaded from: classes3.dex */
public class C7852a {
    public static final c Companion = new c(null);

    /* renamed from: q */
    private static final ArrayList f42137q;

    /* renamed from: a */
    private final f f42138a;

    /* renamed from: b */
    private String f42139b;

    /* renamed from: c */
    private a f42140c;

    /* renamed from: d */
    private C26469c f42141d;

    /* renamed from: e */
    private C27508p f42142e;

    /* renamed from: f */
    private boolean f42143f;

    /* renamed from: g */
    private boolean f42144g;

    /* renamed from: h */
    private int f42145h;

    /* renamed from: i */
    private int f42146i;

    /* renamed from: j */
    private int f42147j;

    /* renamed from: k */
    private g f42148k;

    /* renamed from: l */
    private ArrayList f42149l;

    /* renamed from: m */
    private String f42150m;

    /* renamed from: n */
    private Handler f42151n;

    /* renamed from: o */
    private Handler f42152o;

    /* renamed from: p */
    private boolean f42153p;

    /* renamed from: com.zing.zalo.common.a$a */
    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: a */
        private C26469c f42154a;

        /* renamed from: com.zing.zalo.common.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32705a implements C27501i.a {

            /* renamed from: a */
            private final String f42156a = "event_anim_containerview";

            /* renamed from: b */
            private final String f42157b = "event_action_vibration_screen";

            /* renamed from: c */
            private final String f42158c = "event_action_vibration_device";

            /* renamed from: d */
            private final String f42159d = "event_anim_fullscreen";

            /* renamed from: e */
            private final String f42160e = "event_anim_inline";

            /* renamed from: f */
            private final String f42161f = "event_cocos2dx_inside";

            /* renamed from: g */
            private final String f42162g = "event_cocos2dx_outside";

            /* renamed from: h */
            private final String f42163h = "event_sound_effect";

            /* renamed from: i */
            private final String f42164i = "C";

            /* renamed from: j */
            private final String f42165j = "L";

            /* renamed from: k */
            private final String f42166k = "R";

            /* renamed from: l */
            private final String f42167l = RequestConfiguration.MAX_AD_CONTENT_RATING_T;

            /* renamed from: m */
            private final String f42168m = "B";

            /* renamed from: n */
            final /* synthetic */ C7852a f42169n;

            C32705a(C7852a c7852a) {
                this.f42169n = c7852a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public static final void m40009f(String str, C32705a c32705a, C7852a c7852a) {
                AbstractC19074t.m100208f(str, "$eventName");
                AbstractC19074t.m100208f(c32705a, "this$0");
                AbstractC19074t.m100208f(c7852a, "this$1");
                String substring = str.substring(c32705a.f42156a.length() + 1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                c7852a.m39990O(c7852a.m39985B() + "/android", substring);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g */
            public static final void m40010g(String str, C32705a c32705a, C7852a c7852a) {
                List m131502j;
                AbstractC19074t.m100208f(str, "$eventName");
                AbstractC19074t.m100208f(c32705a, "this$0");
                AbstractC19074t.m100208f(c7852a, "this$1");
                String substring = str.substring(c32705a.f42159d.length() + 1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                List m127021i = new C24329j("_").m127021i(substring, 0);
                if (!m127021i.isEmpty()) {
                    ListIterator listIterator = m127021i.listIterator(m127021i.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            m131502j = AbstractC25332a0.m131179G0(m127021i, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m131502j = AbstractC25368s.m131502j();
                String[] strArr = (String[]) m131502j.toArray(new String[0]);
                if (strArr.length == 4) {
                    int parseInt = Integer.parseInt(strArr[0]);
                    int parseInt2 = Integer.parseInt(strArr[1]);
                    String str2 = strArr[2];
                    String substring2 = str2.substring(0, 1);
                    AbstractC19074t.m100207e(substring2, "substring(...)");
                    float m40014j = c32705a.m40014j(substring2);
                    String substring3 = str2.substring(1);
                    AbstractC19074t.m100207e(substring3, "substring(...)");
                    float m40014j2 = c32705a.m40014j(substring3);
                    String str3 = strArr[3];
                    c7852a.m39991Q(c7852a.m39985B() + "/" + str3, parseInt, parseInt2, m40014j, m40014j2);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: h */
            public static final void m40011h(String str, C32705a c32705a, C7852a c7852a) {
                List m131502j;
                AbstractC19074t.m100208f(str, "$eventName");
                AbstractC19074t.m100208f(c32705a, "this$0");
                AbstractC19074t.m100208f(c7852a, "this$1");
                String substring = str.substring(c32705a.f42160e.length() + 1);
                AbstractC19074t.m100207e(substring, "substring(...)");
                List m127021i = new C24329j("_").m127021i(substring, 0);
                if (!m127021i.isEmpty()) {
                    ListIterator listIterator = m127021i.listIterator(m127021i.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            m131502j = AbstractC25332a0.m131179G0(m127021i, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m131502j = AbstractC25368s.m131502j();
                String[] strArr = (String[]) m131502j.toArray(new String[0]);
                if (strArr.length == 3) {
                    b bVar = new b();
                    bVar.m40023m(Integer.parseInt(strArr[0]));
                    bVar.m40020j(c32705a.m40014j(strArr[1]));
                    bVar.m40022l(c7852a.m39941C(c7852a.m39985B() + "/" + strArr[2]));
                    c7852a.m39992S(bVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: i */
            public static final void m40012i(C7852a c7852a, String str) {
                AbstractC19074t.m100208f(c7852a, "this$0");
                AbstractC19074t.m100208f(str, "$filePath");
                c7852a.m39948N(str);
            }

            @Override // p566v3.C27501i.a
            /* renamed from: a */
            public void mo40013a(final String str) {
                boolean m127126v;
                int m127173b0;
                int m127173b02;
                int m127173b03;
                int m127173b04;
                boolean m127125u;
                int m127173b05;
                StringBuilder sb2;
                int m127173b06;
                int m127173b07;
                long j11;
                List m131502j;
                List m131502j2;
                AbstractC19074t.m100208f(str, "eventName");
                m127126v = AbstractC24341v.m127126v(str, this.f42157b, true);
                if (m127126v) {
                    this.f42169n.m39952U();
                    return;
                }
                m127173b0 = AbstractC24342w.m127173b0(str, this.f42161f, 0, false, 6, null);
                if (m127173b0 != 0) {
                    m127173b02 = AbstractC24342w.m127173b0(str, this.f42162g, 0, false, 6, null);
                    if (m127173b02 != 0) {
                        m127173b03 = AbstractC24342w.m127173b0(str, this.f42158c, 0, false, 6, null);
                        if (m127173b03 != 0) {
                            m127173b04 = AbstractC24342w.m127173b0(str, this.f42156a, 0, false, 6, null);
                            if (m127173b04 == 0) {
                                Handler handler = this.f42169n.f42151n;
                                AbstractC19074t.m100205c(handler);
                                final C7852a c7852a = this.f42169n;
                                handler.post(new Runnable() { // from class: vg.d5
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        C7852a.a.C32705a.m40009f(str, this, c7852a);
                                    }
                                });
                                return;
                            }
                            m127125u = AbstractC24341v.m127125u(str, ".json", false, 2, null);
                            if (m127125u) {
                                m127173b06 = AbstractC24342w.m127173b0(str, this.f42159d, 0, false, 6, null);
                                if (m127173b06 == 0) {
                                    Handler handler2 = this.f42169n.f42151n;
                                    AbstractC19074t.m100205c(handler2);
                                    final C7852a c7852a2 = this.f42169n;
                                    handler2.post(new Runnable() { // from class: vg.e5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C7852a.a.C32705a.m40010g(str, this, c7852a2);
                                        }
                                    });
                                    return;
                                }
                                m127173b07 = AbstractC24342w.m127173b0(str, this.f42160e, 0, false, 6, null);
                                if (m127173b07 == 0) {
                                    Handler handler3 = this.f42169n.f42152o;
                                    AbstractC19074t.m100205c(handler3);
                                    final C7852a c7852a3 = this.f42169n;
                                    handler3.post(new Runnable() { // from class: vg.f5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C7852a.a.C32705a.m40011h(str, this, c7852a3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            m127173b05 = AbstractC24342w.m127173b0(str, this.f42163h, 0, false, 6, null);
                            if (m127173b05 == 0) {
                                int m12355b = AbstractC2361n.m12355b(MainApplication.Companion.m35500c());
                                if ((m12355b == 0 || m12355b == 1) && this.f42169n.m39986F() == g.f42181q) {
                                    return;
                                }
                                String substring = str.substring(this.f42163h.length() + 1);
                                AbstractC19074t.m100207e(substring, "substring(...)");
                                if (AbstractC23041d2.m118194A(this.f42169n.m39985B() + "/" + substring)) {
                                    String m39985B = this.f42169n.m39985B();
                                    sb2 = new StringBuilder();
                                    sb2.append(m39985B);
                                    sb2.append("/");
                                } else {
                                    String m39985B2 = this.f42169n.m39985B();
                                    sb2 = new StringBuilder();
                                    sb2.append(m39985B2);
                                    sb2.append("/assets/");
                                }
                                sb2.append(substring);
                                final String sb3 = sb2.toString();
                                Handler handler4 = this.f42169n.f42152o;
                                if (handler4 != null) {
                                    final C7852a c7852a4 = this.f42169n;
                                    handler4.post(new Runnable() { // from class: vg.g5
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            C7852a.a.C32705a.m40012i(C7852a.this, sb3);
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        String substring2 = str.substring(this.f42158c.length() + 1);
                        AbstractC19074t.m100207e(substring2, "substring(...)");
                        try {
                            if (!TextUtils.isEmpty(substring2)) {
                                j11 = Long.parseLong(substring2);
                            } else {
                                j11 = 200;
                            }
                            this.f42169n.m39989M(j11);
                            return;
                        } catch (Exception e11) {
                            e11.printStackTrace();
                            return;
                        }
                    }
                    String substring3 = str.substring(this.f42162g.length() + 1);
                    AbstractC19074t.m100207e(substring3, "substring(...)");
                    List m127021i = new C24329j("_").m127021i(substring3, 0);
                    if (!m127021i.isEmpty()) {
                        ListIterator listIterator = m127021i.listIterator(m127021i.size());
                        while (listIterator.hasPrevious()) {
                            if (((String) listIterator.previous()).length() != 0) {
                                m131502j = AbstractC25332a0.m131179G0(m127021i, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                    m131502j = AbstractC25368s.m131502j();
                    this.f42169n.f42138a.mo1313l((String[]) m131502j.toArray(new String[0]));
                    return;
                }
                String substring4 = str.substring(this.f42161f.length() + 1);
                AbstractC19074t.m100207e(substring4, "substring(...)");
                List m127021i2 = new C24329j("_").m127021i(substring4, 0);
                if (!m127021i2.isEmpty()) {
                    ListIterator listIterator2 = m127021i2.listIterator(m127021i2.size());
                    while (listIterator2.hasPrevious()) {
                        if (((String) listIterator2.previous()).length() != 0) {
                            m131502j2 = AbstractC25332a0.m131179G0(m127021i2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m131502j2 = AbstractC25368s.m131502j();
                String[] strArr = (String[]) m131502j2.toArray(new String[0]);
                if (strArr.length == 2) {
                    try {
                        this.f42169n.f42138a.mo1311g(Integer.parseInt(strArr[0]), this.f42169n.m39985B() + "/" + strArr[1]);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }

            /* renamed from: j */
            public final float m40014j(String str) {
                if (AbstractC19074t.m100204b(str, this.f42164i)) {
                    return 0.5f;
                }
                if (AbstractC19074t.m100204b(str, this.f42165j) || AbstractC19074t.m100204b(str, this.f42167l)) {
                    return 0.0f;
                }
                if (!AbstractC19074t.m100204b(str, this.f42166k) && !AbstractC19074t.m100204b(str, this.f42168m)) {
                    return 0.0f;
                }
                return 1.0f;
            }
        }

        public a() {
        }

        /* renamed from: a */
        public final void m40001a() {
            C26469c c26469c = this.f42154a;
            if (c26469c != null) {
                c26469c.m136416r(null);
            }
        }

        /* renamed from: b */
        public final C26469c m40002b() {
            return this.f42154a;
        }

        /* renamed from: c */
        public final void m40003c() {
            C26469c c26469c = this.f42154a;
            if (c26469c != null) {
                c26469c.m136416r(new C32705a(C7852a.this));
            }
        }

        /* renamed from: d */
        public final void m40004d(C26469c c26469c) {
            this.f42154a = c26469c;
        }
    }

    /* renamed from: com.zing.zalo.common.a$b */
    /* loaded from: classes3.dex */
    public final class b extends a {

        /* renamed from: c */
        private C27508p f42170c;

        /* renamed from: d */
        private int f42171d;

        /* renamed from: e */
        private int f42172e;

        /* renamed from: f */
        private float f42173f;

        /* renamed from: g */
        private float f42174g;

        public b() {
            super();
        }

        /* renamed from: e */
        public final float m40015e() {
            return this.f42173f;
        }

        /* renamed from: f */
        public final int m40016f() {
            return this.f42172e;
        }

        /* renamed from: g */
        public final C27508p m40017g() {
            return this.f42170c;
        }

        /* renamed from: h */
        public final float m40018h() {
            return this.f42174g;
        }

        /* renamed from: i */
        public final int m40019i() {
            return this.f42171d;
        }

        /* renamed from: j */
        public final void m40020j(float f11) {
            this.f42173f = f11;
        }

        /* renamed from: k */
        public final void m40021k(int i11) {
            this.f42172e = i11;
        }

        /* renamed from: l */
        public final void m40022l(C27508p c27508p) {
            this.f42170c = c27508p;
        }

        /* renamed from: m */
        public final void m40023m(float f11) {
            this.f42174g = f11;
        }

        /* renamed from: n */
        public final void m40024n(int i11) {
            this.f42171d = i11;
        }
    }

    /* renamed from: com.zing.zalo.common.a$c */
    /* loaded from: classes3.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.common.a$d */
    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        public int f42176a;

        /* renamed from: b */
        public int f42177b;

        public d(int i11, int i12) {
            this.f42176a = i11;
            this.f42177b = i12;
        }
    }

    /* renamed from: com.zing.zalo.common.a$e */
    /* loaded from: classes3.dex */
    public final class e extends a {

        /* renamed from: c */
        private C27508p f42178c;

        public e() {
            super();
        }

        /* renamed from: e */
        public final C27508p m40025e() {
            return this.f42178c;
        }

        /* renamed from: f */
        public final void m40026f(C27508p c27508p) {
            this.f42178c = c27508p;
        }
    }

    /* renamed from: com.zing.zalo.common.a$f */
    /* loaded from: classes3.dex */
    public interface f {
        /* renamed from: b */
        boolean mo1309b();

        /* renamed from: e */
        boolean mo1310e();

        /* renamed from: g */
        void mo1311g(int i11, String str);

        int getAnimHeight();

        int getAnimWidth();

        d getDimensionFullScreenEvent();

        ImageView getFullscreenView();

        ViewGroup getMainLayout();

        Point getPosition();

        void invalidate();

        /* renamed from: k */
        void mo1312k();

        /* renamed from: l */
        void mo1313l(String[] strArr);

        /* renamed from: n */
        float mo1314n(float f11, float f12);

        /* renamed from: r */
        boolean mo1315r();

        /* renamed from: s */
        void mo1316s();

        /* renamed from: u */
        boolean mo1317u();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.zing.zalo.common.a$g */
    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: p */
        public static final g f42180p = new g("UNKNOWN", 0);

        /* renamed from: q */
        public static final g f42181q = new g("SOCIAL", 1);

        /* renamed from: r */
        private static final /* synthetic */ g[] f42182r;

        /* renamed from: s */
        private static final /* synthetic */ InterfaceC30165a f42183s;

        static {
            g[] m40027b = m40027b();
            f42182r = m40027b;
            f42183s = AbstractC30166b.m148796a(m40027b);
        }

        private g(String str, int i11) {
        }

        /* renamed from: b */
        private static final /* synthetic */ g[] m40027b() {
            return new g[]{f42180p, f42181q};
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) f42182r.clone();
        }
    }

    /* renamed from: com.zing.zalo.common.a$h */
    /* loaded from: classes3.dex */
    public static final class h extends AbstractC28054e7 {
        h() {
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: a */
        public void mo16496a(int i11) {
            super.mo16496a(i11);
            C7852a.this.f42150m = "";
        }

        @Override // vg.AbstractC28054e7
        /* renamed from: e */
        public void mo16498e() {
            super.mo16498e();
            C7852a.this.f42150m = "";
        }
    }

    /* renamed from: com.zing.zalo.common.a$i */
    /* loaded from: classes3.dex */
    public static final class i implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ e f42185p;

        /* renamed from: q */
        final /* synthetic */ C7852a f42186q;

        i(e eVar, C7852a c7852a) {
            this.f42185p = eVar;
            this.f42186q = c7852a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            C26469c m40002b = this.f42185p.m40002b();
            if (m40002b != null) {
                m40002b.m136411m(null);
            }
            this.f42185p.m40001a();
            C27508p m40025e = this.f42185p.m40025e();
            if (m40025e != null) {
                m40025e.m140646a();
            }
            this.f42185p.m40004d(null);
            ImageView fullscreenView = this.f42186q.f42138a.getFullscreenView();
            if (fullscreenView != null) {
                fullscreenView.setVisibility(8);
                fullscreenView.setImageDrawable(null);
            }
            ArrayList arrayList = this.f42186q.f42149l;
            if (arrayList != null) {
                arrayList.remove(this.f42185p);
            }
            C7852a c7852a = this.f42186q;
            c7852a.f42147j--;
            if (this.f42186q.f42147j <= 0) {
                this.f42186q.m39983z();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
        }
    }

    static {
        List m131496e;
        m131496e = AbstractC25366r.m131496e(g.f42181q);
        f42137q = new ArrayList(m131496e);
    }

    public C7852a(f fVar) {
        AbstractC19074t.m100208f(fVar, "keyframeAnimListener");
        this.f42138a = fVar;
        this.f42143f = true;
        this.f42148k = g.f42180p;
        this.f42150m = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public final C27508p m39941C(String str) {
        if (m39947K() && C28111k4.m141588d().m141595i()) {
            return C28111k4.m141588d().m141593e(str, this.f42139b);
        }
        return m39943E(str);
    }

    /* renamed from: D */
    private final Point m39942D() {
        return this.f42138a.getPosition();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0031 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.InputStream] */
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final C27508p m39943E(String str) {
        Throwable th2;
        FileInputStream fileInputStream;
        try {
            try {
                File file = new File((String) str);
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        C27508p m139132a = AbstractC27005l.m139132a(fileInputStream, this.f42139b);
                        try {
                            fileInputStream.close();
                        } catch (IOException unused) {
                        }
                        return m139132a;
                    } catch (IOException e11) {
                        e = e11;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        return null;
                    }
                }
            } catch (IOException e12) {
                e = e12;
                fileInputStream = null;
            } catch (Throwable th3) {
                th2 = th3;
                str = 0;
                if (str != 0) {
                }
                throw th2;
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (str != 0) {
                try {
                    str.close();
                } catch (IOException unused3) {
                }
            }
            throw th2;
        }
    }

    /* renamed from: H */
    private final void m39944H() {
        if (this.f42153p) {
            return;
        }
        this.f42153p = true;
        HandlerThread handlerThread = new HandlerThread("Z:KFAnim");
        handlerThread.start();
        this.f42151n = new Handler(handlerThread.getLooper());
        this.f42152o = new Handler(Looper.getMainLooper());
    }

    /* renamed from: I */
    private final void m39945I(final e eVar, final float f11, final float f12) {
        Handler handler = this.f42152o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: vg.a5
                @Override // java.lang.Runnable
                public final void run() {
                    C7852a.m39946J(C7852a.this, f11, f12, eVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: J */
    public static final void m39946J(C7852a c7852a, float f11, float f12, e eVar) {
        AbstractC19074t.m100208f(c7852a, "this$0");
        AbstractC19074t.m100208f(eVar, "$fullscreenAnim");
        ImageView fullscreenView = c7852a.f42138a.getFullscreenView();
        if (fullscreenView != null) {
            fullscreenView.setVisibility(0);
            fullscreenView.setAlpha(1.0f);
            fullscreenView.setTranslationX(f11);
            fullscreenView.setTranslationY(f12);
            fullscreenView.setImageAlpha(0);
            fullscreenView.setImageDrawable(eVar.m40002b());
        }
    }

    /* renamed from: K */
    private final boolean m39947K() {
        return f42137q.contains(this.f42148k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public final void m39948N(String str) {
        try {
            if (!TextUtils.isEmpty(str) && AbstractC23041d2.m118194A(str)) {
                C7853b.a aVar = C7853b.Companion;
                aVar.m40150a().m40136j1();
                this.f42150m = str;
                aVar.m40150a().m40094E0(str, 0, new h(), true, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m39949P(ViewGroup viewGroup, Animation animation) {
        AbstractC19074t.m100208f(viewGroup, "$shakingView");
        viewGroup.startAnimation(animation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m39950R(C7852a c7852a, e eVar) {
        AbstractC19074t.m100208f(c7852a, "this$0");
        AbstractC19074t.m100208f(eVar, "$fullscreenAnim");
        c7852a.m39961d0(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m39951T(b bVar, C7852a c7852a) {
        AbstractC19074t.m100208f(c7852a, "this$0");
        if (bVar.m40002b() == null) {
            return;
        }
        bVar.m40001a();
        ArrayList arrayList = c7852a.f42149l;
        if (arrayList != null) {
            arrayList.remove(bVar);
        }
        C26469c m40002b = bVar.m40002b();
        if (m40002b != null) {
            m40002b.m136411m(null);
        }
        C27508p m40017g = bVar.m40017g();
        if (m40017g != null) {
            m40017g.m140646a();
        }
        bVar.m40004d(null);
        int i11 = c7852a.f42147j - 1;
        c7852a.f42147j = i11;
        if (i11 <= 0) {
            c7852a.m39983z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public final void m39952U() {
        ViewGroup mainLayout = this.f42138a.getMainLayout();
        if (mainLayout != null) {
            AbstractC20273c.m105847a(mainLayout);
        }
    }

    /* renamed from: X */
    private final C26469c m39953X(C27508p c27508p) {
        if (c27508p == null) {
            return null;
        }
        return new C26473g().m136448b(c27508p).m136449c(60).m136447a();
    }

    /* renamed from: Y */
    private final void m39954Y(C27508p c27508p) {
        m39981v();
        this.f42142e = c27508p;
        C26469c m39953X = m39953X(c27508p);
        this.f42141d = m39953X;
        if (m39953X != null) {
            a aVar = new a();
            aVar.m40004d(m39953X);
            aVar.m40003c();
            this.f42140c = aVar;
            m39953X.m136411m(new C26469c.b() { // from class: vg.w4
                @Override // p516t3.C26469c.b
                /* renamed from: a */
                public final void mo136437a() {
                    C7852a.m39955Z(C7852a.this);
                }
            });
            m39959c0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m39955Z(C7852a c7852a) {
        AbstractC19074t.m100208f(c7852a, "this$0");
        int i11 = c7852a.f42147j - 1;
        c7852a.f42147j = i11;
        if (i11 <= 0) {
            c7852a.m39983z();
        }
    }

    /* renamed from: c0 */
    private final void m39959c0() {
        this.f42147j++;
        C26469c c26469c = this.f42141d;
        if (c26469c != null) {
            if (this.f42138a.mo1315r()) {
                c26469c.m136418t();
            } else {
                c26469c.m136409k();
                c26469c.m136410l();
            }
        }
    }

    /* renamed from: d0 */
    private final void m39961d0(final e eVar) {
        Handler handler = this.f42152o;
        if (handler != null) {
            handler.post(new Runnable() { // from class: vg.b5
                @Override // java.lang.Runnable
                public final void run() {
                    C7852a.m39963e0(C7852a.e.this, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public static final void m39963e0(e eVar, final C7852a c7852a) {
        AbstractC19074t.m100208f(c7852a, "this$0");
        if (eVar != null && c7852a.f42138a.getFullscreenView() != null) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new AccelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vg.c5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    C7852a.m39965f0(C7852a.this, valueAnimator);
                }
            });
            ofFloat.addListener(new i(eVar, c7852a));
            ofFloat.start();
            return;
        }
        int i11 = c7852a.f42147j - 1;
        c7852a.f42147j = i11;
        if (i11 <= 0) {
            c7852a.m39983z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m39965f0(C7852a c7852a, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c7852a, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        ImageView fullscreenView = c7852a.f42138a.getFullscreenView();
        if (fullscreenView != null && fullscreenView.getVisibility() == 0) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            fullscreenView.setAlpha(((Float) animatedValue).floatValue());
            fullscreenView.invalidate();
        }
    }

    /* renamed from: t */
    private final void m39979t() {
        C27508p c27508p = this.f42142e;
        if (c27508p != null) {
            float mo1314n = this.f42138a.mo1314n(c27508p.m140649d()[0], c27508p.m140649d()[1]);
            this.f42145h = (int) (c27508p.m140649d()[0] * mo1314n);
            this.f42146i = (int) (c27508p.m140649d()[1] * mo1314n);
        }
    }

    /* renamed from: u */
    private final void m39980u() {
        ArrayList arrayList = this.f42149l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C26469c m40002b = ((a) arrayList.get(i11)).m40002b();
                if (m40002b != null) {
                    m40002b.m136411m(null);
                }
                if (arrayList.get(i11) instanceof b) {
                    Object obj = arrayList.get(i11);
                    AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.common.KeyframeAnimPlayer.AttachedAnim");
                    C27508p m40017g = ((b) obj).m40017g();
                    if (m40017g != null) {
                        m40017g.m140646a();
                    }
                } else if (arrayList.get(i11) instanceof e) {
                    Object obj2 = arrayList.get(i11);
                    AbstractC19074t.m100206d(obj2, "null cannot be cast to non-null type com.zing.zalo.common.KeyframeAnimPlayer.FullScreenAnim");
                    C27508p m40025e = ((e) obj2).m40025e();
                    if (m40025e != null) {
                        m40025e.m140646a();
                    }
                    ImageView fullscreenView = this.f42138a.getFullscreenView();
                    if (fullscreenView != null) {
                        fullscreenView.clearAnimation();
                        fullscreenView.setVisibility(8);
                        fullscreenView.setImageDrawable(null);
                    }
                }
                ((a) arrayList.get(i11)).m40001a();
                ((a) arrayList.get(i11)).m40004d(null);
            }
            arrayList.clear();
        }
    }

    /* renamed from: v */
    private final void m39981v() {
        C26469c c26469c = this.f42141d;
        if (c26469c != null) {
            if (!c26469c.m136407i()) {
                c26469c.m136419u();
            }
            c26469c.m136411m(null);
        }
        C27508p c27508p = this.f42142e;
        if (c27508p != null) {
            c27508p.m140646a();
        }
        a aVar = this.f42140c;
        if (aVar != null) {
            aVar.m40001a();
            aVar.m40004d(null);
        }
        this.f42141d = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public static final void m39982x(C7852a c7852a) {
        Looper looper;
        AbstractC19074t.m100208f(c7852a, "this$0");
        try {
            Handler handler = c7852a.f42151n;
            if (handler != null && (looper = handler.getLooper()) != null) {
                looper.quitSafely();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public final void m39983z() {
        this.f42144g = true;
        this.f42147j = 0;
        this.f42143f = true;
        this.f42138a.mo1316s();
    }

    /* renamed from: A */
    public final void m39984A() {
        C26469c m40002b;
        C26469c c26469c = this.f42141d;
        if (c26469c != null && !c26469c.m136407i()) {
            c26469c.m136419u();
        }
        ArrayList arrayList = this.f42149l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                C26469c m40002b2 = ((a) arrayList.get(i11)).m40002b();
                if (m40002b2 != null && !m40002b2.m136407i() && (m40002b = ((a) arrayList.get(i11)).m40002b()) != null) {
                    m40002b.m136419u();
                }
            }
        }
    }

    /* renamed from: B */
    public final String m39985B() {
        return this.f42139b;
    }

    /* renamed from: F */
    public final g m39986F() {
        return this.f42148k;
    }

    /* renamed from: G */
    public final boolean m39987G() {
        return this.f42143f;
    }

    /* renamed from: L */
    public final void m39988L() {
        if (!this.f42143f) {
            return;
        }
        this.f42144g = false;
        if (!this.f42138a.mo1315r() && this.f42141d != null) {
            this.f42143f = false;
            m39959c0();
            this.f42138a.mo1312k();
        }
    }

    /* renamed from: M */
    protected final void m39989M(long j11) {
        Object systemService = MainApplication.Companion.m35500c().getSystemService("vibrator");
        AbstractC19074t.m100206d(systemService, "null cannot be cast to non-null type android.os.Vibrator");
        ((Vibrator) systemService).vibrate(j11);
    }

    /* renamed from: O */
    protected final void m39990O(String str, String str2) {
        final ViewGroup mainLayout;
        if (str2 == null) {
            return;
        }
        try {
            File file = new File(str, str2);
            if (file.exists() && this.f42138a.getMainLayout() != null && (mainLayout = this.f42138a.getMainLayout()) != null) {
                final Animation m94395c = AbstractC17867a.m94395c(mainLayout.getContext(), file);
                Handler handler = this.f42152o;
                if (handler != null) {
                    handler.post(new Runnable() { // from class: vg.x4
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7852a.m39949P(mainLayout, m94395c);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* renamed from: Q */
    protected final void m39991Q(String str, float f11, float f12, float f13, float f14) {
        float m116579b;
        AbstractC19074t.m100208f(str, "filePath");
        C27508p m39941C = m39941C(str);
        if (m39941C == null) {
            return;
        }
        d dimensionFullScreenEvent = this.f42138a.getDimensionFullScreenEvent();
        int i11 = dimensionFullScreenEvent.f42176a;
        float f15 = f13 * (-i11);
        float f16 = i11;
        float f17 = 100;
        int i12 = (int) (f15 + (((f11 * f16) * 1.0f) / f17));
        float f18 = dimensionFullScreenEvent.f42177b;
        int i13 = (int) ((f14 * (-r0)) + (((f12 * f18) * 1.0f) / f17));
        final e eVar = new e();
        eVar.m40026f(m39941C);
        eVar.m40004d(m39953X(m39941C));
        m116579b = AbstractC22543l.m116579b((f16 * 1.0f) / m39941C.m140649d()[0], (f18 * 1.0f) / m39941C.m140649d()[1]);
        int i14 = (int) (m39941C.m140649d()[0] * m116579b);
        int i15 = (int) (m39941C.m140649d()[1] * m116579b);
        C26469c m40002b = eVar.m40002b();
        if (m40002b != null) {
            m40002b.setBounds(0, 0, i14, i15);
        }
        eVar.m40003c();
        C26469c m40002b2 = eVar.m40002b();
        if (m40002b2 != null) {
            m40002b2.m136409k();
        }
        this.f42147j++;
        m39945I(eVar, i12, i13);
        C26469c m40002b3 = eVar.m40002b();
        if (m40002b3 != null) {
            m40002b3.m136411m(new C26469c.b() { // from class: vg.z4
                @Override // p516t3.C26469c.b
                /* renamed from: a */
                public final void mo136437a() {
                    C7852a.m39950R(C7852a.this, eVar);
                }
            });
        }
        ArrayList arrayList = this.f42149l;
        if (arrayList != null) {
            arrayList.add(eVar);
        }
    }

    /* renamed from: S */
    protected final void m39992S(final b bVar) {
        C27508p c27508p;
        if (!this.f42138a.mo1310e()) {
            return;
        }
        if (bVar != null) {
            c27508p = bVar.m40017g();
        } else {
            c27508p = null;
        }
        if (c27508p == null) {
            AbstractC23350e.m122774d("KeyframeAnimPlayer", "event play inline ..... attached script cannot find ....");
            return;
        }
        bVar.m40004d(m39953X(bVar.m40017g()));
        bVar.m40003c();
        C27508p m40017g = bVar.m40017g();
        if (m40017g != null) {
            float animHeight = (this.f42138a.getAnimHeight() * 1.0f) / m40017g.m140649d()[1];
            bVar.m40024n((int) (m40017g.m140649d()[0] * animHeight));
            bVar.m40021k((int) (m40017g.m140649d()[1] * animHeight));
        }
        C26469c m40002b = bVar.m40002b();
        if (m40002b != null) {
            m40002b.setBounds(0, 0, bVar.m40019i(), bVar.m40016f());
        }
        this.f42147j++;
        C26469c m40002b2 = bVar.m40002b();
        if (m40002b2 != null) {
            m40002b2.m136411m(new C26469c.b() { // from class: vg.y4
                @Override // p516t3.C26469c.b
                /* renamed from: a */
                public final void mo136437a() {
                    C7852a.m39951T(C7852a.b.this, this);
                }
            });
        }
        C26469c m40002b3 = bVar.m40002b();
        if (m40002b3 != null) {
            m40002b3.m136409k();
        }
        ArrayList arrayList = this.f42149l;
        if (arrayList != null) {
            arrayList.add(bVar);
        }
    }

    /* renamed from: V */
    public final void m39993V() {
        if (this.f42141d != null) {
            m39979t();
            C26469c c26469c = this.f42141d;
            AbstractC19074t.m100205c(c26469c);
            c26469c.m136412n(0, 0, this.f42145h, this.f42146i);
        }
    }

    /* renamed from: W */
    public final void m39994W(String str) {
        this.f42139b = str;
    }

    /* renamed from: a0 */
    public final void m39995a0(g gVar) {
        AbstractC19074t.m100208f(gVar, "<set-?>");
        this.f42148k = gVar;
    }

    /* renamed from: b0 */
    public final void m39996b0(boolean z11) {
        this.f42144g = z11;
    }

    /* renamed from: g0 */
    public final void m39997g0() {
        if (!TextUtils.isEmpty(this.f42150m)) {
            C7853b.a aVar = C7853b.Companion;
            if (aVar.m40150a().m40139l0(this.f42150m)) {
                aVar.m40150a().m40136j1();
                this.f42150m = "";
            }
        }
    }

    /* renamed from: h0 */
    public final void m39998h0(C16673w c16673w) {
        C27508p m39941C;
        AbstractC19074t.m100208f(c16673w, "decoder");
        if (this.f42144g) {
            return;
        }
        this.f42143f = false;
        if (this.f42141d == null) {
            m39944H();
            String str = this.f42139b + "/" + c16673w.m88866f();
            if (this.f42138a.mo1317u() && c16673w.getType() == 2) {
                str = this.f42139b + "/" + c16673w.m88867g();
            }
            if (!TextUtils.isEmpty(str) && (m39941C = m39941C(str)) != null) {
                m39954Y(m39941C);
                m39979t();
                C26469c c26469c = this.f42141d;
                if (c26469c != null) {
                    c26469c.setBounds(0, 0, this.f42145h, this.f42146i);
                }
            }
            this.f42149l = new ArrayList();
            C28201u4.m141792b().m141795d();
            C28201u4.m141792b().m141793a(this);
            this.f42138a.mo1312k();
            return;
        }
        this.f42138a.invalidate();
    }

    /* renamed from: w */
    public final void m39999w() {
        Handler handler;
        m39980u();
        m39981v();
        this.f42147j = 0;
        this.f42143f = true;
        this.f42144g = true;
        C28201u4.m141792b().m141794c(this);
        if (this.f42153p && (handler = this.f42151n) != null) {
            handler.post(new Runnable() { // from class: vg.v4
                @Override // java.lang.Runnable
                public final void run() {
                    C7852a.m39982x(C7852a.this);
                }
            });
        }
        this.f42153p = false;
    }

    /* renamed from: y */
    public final void m40000y(Canvas canvas) {
        int i11;
        int i12;
        int m40019i;
        C24848g0 c24848g0;
        float f11;
        float f12;
        int i13;
        AbstractC19074t.m100208f(canvas, "canvas");
        if (!this.f42143f) {
            if (this.f42141d != null) {
                canvas.save();
                Point m39942D = m39942D();
                if (m39942D != null) {
                    if (this.f42138a.mo1309b()) {
                        i13 = this.f42138a.getAnimWidth() - this.f42145h;
                    } else {
                        i13 = 0;
                    }
                    f11 = i13;
                    if (this.f42138a.mo1309b()) {
                        i11 = (-m39942D.x) - this.f42138a.getAnimWidth();
                        i12 = 0;
                    } else {
                        i11 = -m39942D.x;
                        i12 = i11;
                    }
                    c24848g0 = C24848g0.f119245a;
                } else {
                    c24848g0 = null;
                    i11 = 0;
                    f11 = 0.0f;
                    i12 = 0;
                }
                if (c24848g0 == null) {
                    f11 = (this.f42138a.getAnimWidth() - this.f42145h) / 2.0f;
                    f12 = (this.f42138a.getAnimHeight() - this.f42146i) / 2.0f;
                } else {
                    f12 = 0.0f;
                }
                canvas.translate(f11, f12);
                C26469c c26469c = this.f42141d;
                if (c26469c != null) {
                    c26469c.draw(canvas);
                }
                canvas.restore();
            } else {
                i11 = 0;
                i12 = 0;
            }
            ArrayList arrayList = this.f42149l;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    if (arrayList.get(i14) instanceof b) {
                        Object obj = arrayList.get(i14);
                        AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type com.zing.zalo.common.KeyframeAnimPlayer.AttachedAnim");
                        b bVar = (b) obj;
                        C26469c m40002b = bVar.m40002b();
                        if (m40002b != null && !m40002b.m136407i()) {
                            canvas.save();
                            if (i11 == i12) {
                                m40019i = i12;
                            } else {
                                m40019i = bVar.m40019i() + i11;
                            }
                            canvas.translate((int) (m40019i + (bVar.m40015e() * (-bVar.m40019i())) + (((bVar.m40018h() * AbstractC26903a.m138661b()) * 1.0f) / 100)), 0.0f);
                            m40002b.draw(canvas);
                            canvas.restore();
                        }
                    }
                }
            }
        }
    }
}
