package com.google.android.gms.common;

import am.C0925n;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.AbstractC1364q;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.zabx;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.AbstractC4235y;
import com.google.android.gms.common.internal.AbstractDialogInterfaceOnClickListenerC4167b0;
import p229i5.AbstractC20289j;
import p229i5.AbstractC20295p;
import p289k5.AbstractC21469b;
import p504s5.AbstractC26139g;
import p504s5.AbstractC26140h;
import p567v4.AbstractC27522b;
import p567v4.AbstractC27523c;
import p632x4.AbstractC29320f;
import p632x4.C29322h;
import p704z4.AbstractC31252u;
import p704z4.InterfaceC31224e;

/* renamed from: com.google.android.gms.common.a */
/* loaded from: classes.dex */
public class C4070a extends C4148b {

    /* renamed from: c */
    private String f16158c;

    /* renamed from: e */
    private static final Object f16156e = new Object();

    /* renamed from: f */
    private static final C4070a f16157f = new C4070a();

    /* renamed from: d */
    public static final int f16155d = C4148b.f16477a;

    /* renamed from: p */
    public static C4070a m19196p() {
        return f16157f;
    }

    @Override // com.google.android.gms.common.C4148b
    /* renamed from: d */
    public Intent mo19197d(Context context, int i11, String str) {
        return super.mo19197d(context, i11, str);
    }

    @Override // com.google.android.gms.common.C4148b
    /* renamed from: e */
    public PendingIntent mo19198e(Context context, int i11, int i12) {
        return super.mo19198e(context, i11, i12);
    }

    @Override // com.google.android.gms.common.C4148b
    /* renamed from: g */
    public final String mo19199g(int i11) {
        return super.mo19199g(i11);
    }

    @Override // com.google.android.gms.common.C4148b
    /* renamed from: i */
    public int mo19200i(Context context) {
        return super.mo19200i(context);
    }

    @Override // com.google.android.gms.common.C4148b
    /* renamed from: j */
    public int mo19201j(Context context, int i11) {
        return super.mo19201j(context, i11);
    }

    @Override // com.google.android.gms.common.C4148b
    /* renamed from: m */
    public final boolean mo19202m(int i11) {
        return super.mo19202m(i11);
    }

    /* renamed from: n */
    public Dialog m19203n(Activity activity, int i11, int i12, DialogInterface.OnCancelListener onCancelListener) {
        return m19207s(activity, i11, AbstractDialogInterfaceOnClickListenerC4167b0.m19629b(activity, mo19197d(activity, i11, "d"), i12), onCancelListener);
    }

    /* renamed from: o */
    public PendingIntent m19204o(Context context, ConnectionResult connectionResult) {
        if (connectionResult.m19186K()) {
            return connectionResult.m19185J();
        }
        return mo19198e(context, connectionResult.m19188t(), 0);
    }

    /* renamed from: q */
    public boolean m19205q(Activity activity, int i11, int i12, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m19203n = m19203n(activity, i11, i12, onCancelListener);
        if (m19203n == null) {
            return false;
        }
        m19210v(activity, m19203n, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: r */
    public void m19206r(Context context, int i11) {
        m19211w(context, i11, null, m19571f(context, i11, 0, C0925n.f3421p));
    }

    /* renamed from: s */
    final Dialog m19207s(Context context, int i11, AbstractDialogInterfaceOnClickListenerC4167b0 abstractDialogInterfaceOnClickListenerC4167b0, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i11 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AbstractC4235y.m19815d(context, i11));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String m19814c = AbstractC4235y.m19814c(context, i11);
        if (m19814c != null) {
            builder.setPositiveButton(m19814c, abstractDialogInterfaceOnClickListenerC4167b0);
        }
        String m19818g = AbstractC4235y.m19818g(context, i11);
        if (m19818g != null) {
            builder.setTitle(m19818g);
        }
        String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i11));
        new IllegalArgumentException();
        return builder.create();
    }

    /* renamed from: t */
    public final Dialog m19208t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(AbstractC4235y.m19815d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m19210v(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: u */
    public final zabx m19209u(Context context, AbstractC31252u abstractC31252u) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        zabx zabxVar = new zabx(abstractC31252u);
        AbstractC26139g.m134507r(context, zabxVar, intentFilter);
        zabxVar.m19559a(context);
        if (!m19573l(context, "com.google.android.gms")) {
            abstractC31252u.mo19408a();
            zabxVar.m19560b();
            return null;
        }
        return zabxVar;
    }

    /* renamed from: v */
    final void m19210v(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof FragmentActivity) {
                C29322h.m146469q1(dialog, onCancelListener).mo8956p1(((FragmentActivity) activity).m8906Z1(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        ErrorDialogFragment.m19189a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* renamed from: w */
    final void m19211w(Context context, int i11, String str, PendingIntent pendingIntent) {
        int i12;
        String str2;
        NotificationChannel notificationChannel;
        CharSequence name;
        String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i11), null);
        new IllegalArgumentException();
        if (i11 == 18) {
            m19212x(context);
            return;
        }
        if (pendingIntent == null) {
            return;
        }
        String m19817f = AbstractC4235y.m19817f(context, i11);
        String m19816e = AbstractC4235y.m19816e(context, i11);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) AbstractC4205o.m19722k(context.getSystemService("notification"));
        AbstractC1364q.f m6869V = new AbstractC1364q.f(context).m6857J(true).m6886n(true).mo6895w(m19817f).m6869V(new AbstractC1364q.d().m6828h(m19816e));
        if (AbstractC20289j.m105932f(context)) {
            AbstractC4205o.m19726o(AbstractC20295p.m105951e());
            m6869V.m6866S(context.getApplicationInfo().icon).m6862O(2);
            if (AbstractC20289j.m105933g(context)) {
                m6869V.m6874a(AbstractC27522b.common_full_open_on_phone, resources.getString(AbstractC27523c.common_open_on_phone), pendingIntent);
            } else {
                m6869V.m6893u(pendingIntent);
            }
        } else {
            m6869V.m6866S(R.drawable.stat_sys_warning).m6870W(resources.getString(AbstractC27523c.common_google_play_services_notification_ticker)).m6875a0(System.currentTimeMillis()).m6893u(pendingIntent).mo6894v(m19816e);
        }
        if (AbstractC20295p.m105955i()) {
            AbstractC4205o.m19726o(AbstractC20295p.m105955i());
            synchronized (f16156e) {
                str2 = this.f16158c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String m19813b = AbstractC4235y.m19813b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC29320f.m146468a("com.google.android.gms.availability", m19813b, 4));
                } else {
                    name = notificationChannel.getName();
                    if (!m19813b.contentEquals(name)) {
                        notificationChannel.setName(m19813b);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
            }
            m6869V.mo6889q(str2);
        }
        Notification mo6879e = m6869V.mo6879e();
        if (i11 != 1 && i11 != 2 && i11 != 3) {
            i12 = 39789;
        } else {
            AbstractC4150d.f16481b.set(false);
            i12 = 10436;
        }
        notificationManager.notify(i12, mo6879e);
    }

    /* renamed from: x */
    final void m19212x(Context context) {
        new HandlerC4156f(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    /* renamed from: y */
    public final boolean m19213y(Activity activity, InterfaceC31224e interfaceC31224e, int i11, int i12, DialogInterface.OnCancelListener onCancelListener) {
        Dialog m19207s = m19207s(activity, i11, AbstractDialogInterfaceOnClickListenerC4167b0.m19630c(interfaceC31224e, mo19197d(activity, i11, "d"), 2), onCancelListener);
        if (m19207s == null) {
            return false;
        }
        m19210v(activity, m19207s, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    /* renamed from: z */
    public final boolean m19214z(Context context, ConnectionResult connectionResult, int i11) {
        PendingIntent m19204o;
        if (AbstractC21469b.m111057a(context) || (m19204o = m19204o(context, connectionResult)) == null) {
            return false;
        }
        m19211w(context, connectionResult.m19188t(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.m19217a(context, m19204o, i11, true), AbstractC26140h.f124370a | 134217728));
        return true;
    }
}
