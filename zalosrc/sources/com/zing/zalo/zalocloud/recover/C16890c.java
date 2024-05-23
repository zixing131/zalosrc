package com.zing.zalo.zalocloud.recover;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zalocloud.graceperiod.ZCloudGPContainerView;
import com.zing.zalo.p077ui.zalocloud.home.ZCloudHomeView;
import com.zing.zalo.zalocloud.recover.AbstractC16889b;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gu.AbstractC19601a;
import hn0.AbstractC20104d;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import l30.AbstractC22047r0;
import me0.AbstractC23152n3;
import mj0.AbstractC23322a;
import p363nh.AbstractC23775p0;
import p363nh.C23750d;
import ui0.C27280g;

/* renamed from: com.zing.zalo.zalocloud.recover.c */
/* loaded from: classes7.dex */
public final class C16890c {

    /* renamed from: a */
    public static final C16890c f85935a = new C16890c();

    /* renamed from: b */
    private static a f85936b;

    /* renamed from: com.zing.zalo.zalocloud.recover.c$a */
    /* loaded from: classes7.dex */
    public static abstract class a {

        /* renamed from: com.zing.zalo.zalocloud.recover.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32793a extends a {

            /* renamed from: a */
            private final float f85937a;

            public C32793a(float f11) {
                super(null);
                this.f85937a = f11;
            }

            /* renamed from: a */
            public final float m90262a() {
                return this.f85937a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C32793a) && Float.compare(this.f85937a, ((C32793a) obj).f85937a) == 0;
            }

            public int hashCode() {
                return Float.floatToIntBits(this.f85937a);
            }

            public String toString() {
                return "Downloading(progress=" + this.f85937a + ")";
            }
        }

        /* renamed from: com.zing.zalo.zalocloud.recover.c$a$b */
        /* loaded from: classes7.dex */
        public static final class b extends a {

            /* renamed from: a */
            private final AbstractC16889b f85938a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC16889b abstractC16889b) {
                super(null);
                AbstractC19074t.m100208f(abstractC16889b, "errorType");
                this.f85938a = abstractC16889b;
            }

            /* renamed from: a */
            public final AbstractC16889b m90263a() {
                return this.f85938a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC19074t.m100204b(this.f85938a, ((b) obj).f85938a);
            }

            public int hashCode() {
                return this.f85938a.hashCode();
            }

            public String toString() {
                return "Error(errorType=" + this.f85938a + ")";
            }
        }

        /* renamed from: com.zing.zalo.zalocloud.recover.c$a$c */
        /* loaded from: classes7.dex */
        public static final class c extends a {

            /* renamed from: a */
            public static final c f85939a = new c();

            private c() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    private C16890c() {
    }

    /* renamed from: a */
    public final C23750d m90261a(Context context, a aVar) {
        Intent m119014P;
        int m104529e;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(aVar, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        String str = "zalo_cloud_restore_msg_media";
        if (!AbstractC19074t.m100204b(f85936b, aVar)) {
            f85936b = aVar;
            AbstractC23775p0.m124197b("zalo_cloud_restore_msg_media");
        }
        AbstractC23775p0.m124197b("zalo_cloud_restore_msg_media");
        Bitmap bitmap = null;
        if (AbstractC19074t.m100204b(aVar, a.c.f85939a)) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("ARG_IS_SUCCESS", true);
            m119014P = AbstractC23152n3.m119014P(ZCloudGPContainerView.class, bundle, true);
        } else {
            m119014P = AbstractC23152n3.m119014P(ZCloudHomeView.class, null, true);
        }
        AbstractC19074t.m100205c(m119014P);
        PendingIntent activity = PendingIntent.getActivity(context, 0, m119014P, AbstractC19601a.Companion.m102573a(134217728));
        boolean z11 = aVar instanceof a.C32793a;
        C23750d c23750d = new C23750d(context);
        if (z11) {
            str = "db";
        }
        c23750d.m124165v0(str);
        c23750d.m6893u(activity);
        c23750d.mo6860M(z11);
        c23750d.m6870W(context.getString(AbstractC8020f0.app_name));
        c23750d.m6888p("progress");
        c23750d.m6866S(AbstractC16803z.ic_stat_notify_zalo);
        c23750d.m6875a0(System.currentTimeMillis());
        if (z11) {
            c23750d.mo6895w(context.getString(AbstractC8020f0.str_downloading_media));
            a.C32793a c32793a = (a.C32793a) aVar;
            m104529e = AbstractC20104d.m104529e(c32793a.m90262a());
            c23750d.m6863P(100, m104529e, false);
            DecimalFormat decimalFormat = new DecimalFormat("#.#");
            decimalFormat.setRoundingMode(RoundingMode.FLOOR);
            c23750d.mo6894v(decimalFormat.format(Float.valueOf(c32793a.m90262a())) + "%");
        } else if (aVar instanceof a.b) {
            Drawable m139660c = C27280g.m139660c(context, AbstractC23322a.zds_ic_warning_solid_24, AbstractC2807a.success_icon);
            if (m139660c != null) {
                bitmap = AbstractC22047r0.m115053k(m139660c);
            }
            c23750d.mo6855H(bitmap);
            c23750d.mo6895w(context.getString(AbstractC8020f0.str_media_download_paused));
            AbstractC16889b m90263a = ((a.b) aVar).m90263a();
            if (m90263a instanceof AbstractC16889b.a) {
                c23750d.mo6894v(context.getString(AbstractC8020f0.str_err_battery));
            } else if (m90263a instanceof AbstractC16889b.b) {
                c23750d.mo6894v(context.getString(AbstractC8020f0.str_zcloud_migration_network_error));
            } else {
                c23750d.mo6894v(context.getString(AbstractC8020f0.str_tap_for_more_details));
            }
        } else if (aVar instanceof a.c) {
            Drawable m139660c2 = C27280g.m139660c(context, AbstractC23322a.zds_ic_check_circle_solid_24, AbstractC2807a.success_icon);
            if (m139660c2 != null) {
                bitmap = AbstractC22047r0.m115053k(m139660c2);
            }
            c23750d.mo6855H(bitmap);
            c23750d.mo6895w(context.getString(AbstractC8020f0.str_media_messages_downloaded_successfully));
            c23750d.mo6894v(context.getString(AbstractC8020f0.str_tap_for_more_details));
        }
        return c23750d;
    }
}
