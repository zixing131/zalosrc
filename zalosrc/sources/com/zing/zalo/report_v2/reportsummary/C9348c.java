package com.zing.zalo.report_v2.reportsummary;

import android.os.Bundle;
import com.zing.zalo.report_v2.model.ReportInfoCollected;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.report_v2.reportsummary.c */
/* loaded from: classes4.dex */
public final class C9348c implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f49491a;

    /* renamed from: b */
    private final String f49492b;

    /* renamed from: c */
    private final int f49493c;

    /* renamed from: d */
    private final ReportInfoCollected f49494d;

    /* renamed from: com.zing.zalo.report_v2.reportsummary.c$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C9348c m50331a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("report_uid");
            String str = "";
            if (string == null) {
                string = "";
            }
            String string2 = bundle.getString("object_name");
            if (string2 != null) {
                str = string2;
            }
            return new C9348c(string, str, bundle.getInt("source_action", 0), (ReportInfoCollected) bundle.getParcelable("report_info"));
        }
    }

    public C9348c(String str, String str2, int i11, ReportInfoCollected reportInfoCollected) {
        AbstractC19074t.m100208f(str, "reportUid");
        AbstractC19074t.m100208f(str2, "objectName");
        this.f49491a = str;
        this.f49492b = str2;
        this.f49493c = i11;
        this.f49494d = reportInfoCollected;
    }

    /* renamed from: a */
    public final String m50327a() {
        return this.f49492b;
    }

    /* renamed from: b */
    public final ReportInfoCollected m50328b() {
        return this.f49494d;
    }

    /* renamed from: c */
    public final String m50329c() {
        return this.f49491a;
    }

    /* renamed from: d */
    public final int m50330d() {
        return this.f49493c;
    }
}
