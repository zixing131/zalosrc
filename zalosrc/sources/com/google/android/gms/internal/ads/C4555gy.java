package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;
import p468r0.AbstractC25592c;
import p468r0.AbstractServiceConnectionC25594e;
import p468r0.C25595f;

/* renamed from: com.google.android.gms.internal.ads.gy */
/* loaded from: classes2.dex */
public final class C4555gy {

    /* renamed from: a */
    private C25595f f21449a;

    /* renamed from: b */
    private AbstractC25592c f21450b;

    /* renamed from: c */
    private AbstractServiceConnectionC25594e f21451c;

    /* renamed from: d */
    private InterfaceC4444dy f21452d;

    /* renamed from: g */
    public static boolean m22629g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i11 = 0; i11 < queryIntentActivities.size(); i11++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i11).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(x04.m27799a(context));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C25595f m22630a() {
        AbstractC25592c abstractC25592c = this.f21450b;
        if (abstractC25592c == null) {
            this.f21449a = null;
        } else if (this.f21449a == null) {
            this.f21449a = abstractC25592c.m132185c(null);
        }
        return this.f21449a;
    }

    /* renamed from: b */
    public final void m22631b(Activity activity) {
        String m27799a;
        if (this.f21450b != null || (m27799a = x04.m27799a(activity)) == null) {
            return;
        }
        y04 y04Var = new y04(this, null);
        this.f21451c = y04Var;
        AbstractC25592c.m132182a(activity, m27799a, y04Var);
    }

    /* renamed from: c */
    public final void m22632c(AbstractC25592c abstractC25592c) {
        this.f21450b = abstractC25592c;
        abstractC25592c.m132186e(0L);
        InterfaceC4444dy interfaceC4444dy = this.f21452d;
        if (interfaceC4444dy != null) {
            interfaceC4444dy.zza();
        }
    }

    /* renamed from: d */
    public final void m22633d() {
        this.f21450b = null;
        this.f21449a = null;
    }

    /* renamed from: e */
    public final void m22634e(InterfaceC4444dy interfaceC4444dy) {
        this.f21452d = interfaceC4444dy;
    }

    /* renamed from: f */
    public final void m22635f(Activity activity) {
        AbstractServiceConnectionC25594e abstractServiceConnectionC25594e = this.f21451c;
        if (abstractServiceConnectionC25594e == null) {
            return;
        }
        activity.unbindService(abstractServiceConnectionC25594e);
        this.f21450b = null;
        this.f21449a = null;
        this.f21451c = null;
    }
}
