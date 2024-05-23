package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.C4008R;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hc0 extends qc0 {

    /* renamed from: c */
    private final Map f21617c;

    /* renamed from: d */
    private final Context f21618d;

    /* renamed from: e */
    private final String f21619e;

    /* renamed from: f */
    private final long f21620f;

    /* renamed from: g */
    private final long f21621g;

    /* renamed from: h */
    private final String f21622h;

    /* renamed from: i */
    private final String f21623i;

    public hc0(zq0 zq0Var, Map map) {
        super(zq0Var, "createCalendarEvent");
        this.f21617c = map;
        this.f21618d = zq0Var.zzk();
        this.f21619e = m22781l("description");
        this.f21622h = m22781l("summary");
        this.f21620f = m22780k("start_ticks");
        this.f21621g = m22780k("end_ticks");
        this.f21623i = m22781l(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION);
    }

    /* renamed from: k */
    private final long m22780k(String str) {
        String str2 = (String) this.f21617c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* renamed from: l */
    private final String m22781l(String str) {
        if (TextUtils.isEmpty((CharSequence) this.f21617c.get(str))) {
            return "";
        }
        return (String) this.f21617c.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final Intent m22782i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f21619e);
        data.putExtra("eventLocation", this.f21623i);
        data.putExtra("description", this.f21622h);
        long j11 = this.f21620f;
        if (j11 > -1) {
            data.putExtra("beginTime", j11);
        }
        long j12 = this.f21621g;
        if (j12 > -1) {
            data.putExtra("endTime", j12);
        }
        data.setFlags(268435456);
        return data;
    }

    /* renamed from: j */
    public final void m22783j() {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f21618d == null) {
            m25683c("Activity context is not available.");
            return;
        }
        zzt.zzp();
        if (!new C4887pw(this.f21618d).m25561b()) {
            m25683c("This feature is not available on the device.");
            return;
        }
        zzt.zzp();
        AlertDialog.Builder zzG = zzs.zzG(this.f21618d);
        Resources m22933d = zzt.zzo().m22933d();
        if (m22933d != null) {
            str = m22933d.getString(C4008R.string.f15888s5);
        } else {
            str = "Create calendar event";
        }
        zzG.setTitle(str);
        if (m22933d != null) {
            str2 = m22933d.getString(C4008R.string.f15889s6);
        } else {
            str2 = "Allow Ad to create a calendar event?";
        }
        zzG.setMessage(str2);
        if (m22933d != null) {
            str3 = m22933d.getString(C4008R.string.f15886s3);
        } else {
            str3 = "Accept";
        }
        zzG.setPositiveButton(str3, new fc0(this));
        if (m22933d != null) {
            str4 = m22933d.getString(C4008R.string.f15887s4);
        } else {
            str4 = "Decline";
        }
        zzG.setNegativeButton(str4, new gc0(this));
        zzG.create().show();
    }
}
