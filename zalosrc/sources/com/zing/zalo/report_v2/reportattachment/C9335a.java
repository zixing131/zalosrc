package com.zing.zalo.report_v2.reportattachment;

import android.os.Bundle;
import com.zing.zalo.report_v2.model.ReportInfoCollected;
import fn0.AbstractC19060k;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.report_v2.reportattachment.a */
/* loaded from: classes4.dex */
public final class C9335a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final ReportInfoCollected f49459a;

    /* renamed from: b */
    private final int f49460b;

    /* renamed from: c */
    private final ReportInfoCollected f49461c;

    /* renamed from: com.zing.zalo.report_v2.reportattachment.a$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C9335a m50258a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            return new C9335a((ReportInfoCollected) bundle.getParcelable("report_info"), bundle.getInt("source_action", 0), (ReportInfoCollected) bundle.getParcelable("report_info_edited"));
        }
    }

    public C9335a(ReportInfoCollected reportInfoCollected, int i11, ReportInfoCollected reportInfoCollected2) {
        this.f49459a = reportInfoCollected;
        this.f49460b = i11;
        this.f49461c = reportInfoCollected2;
    }

    /* renamed from: a */
    public final ReportInfoCollected m50255a() {
        return this.f49459a;
    }

    /* renamed from: b */
    public final ReportInfoCollected m50256b() {
        return this.f49461c;
    }

    /* renamed from: c */
    public final int m50257c() {
        return this.f49460b;
    }
}
