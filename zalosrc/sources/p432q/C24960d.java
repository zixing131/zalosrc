package p432q;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;

/* renamed from: q.d */
/* loaded from: classes2.dex */
public final class C24960d extends ContentObserver {

    /* renamed from: a */
    private final Context f119627a;

    /* renamed from: b */
    private final AudioManager f119628b;

    /* renamed from: c */
    private final C24957a f119629c;

    /* renamed from: d */
    private final InterfaceC24959c f119630d;

    /* renamed from: e */
    private float f119631e;

    public C24960d(Handler handler, Context context, C24957a c24957a, InterfaceC24959c interfaceC24959c) {
        super(handler);
        this.f119627a = context;
        this.f119628b = (AudioManager) context.getSystemService("audio");
        this.f119629c = c24957a;
        this.f119630d = interfaceC24959c;
    }

    /* renamed from: b */
    private boolean m129677b(float f11) {
        return f11 != this.f119631e;
    }

    /* renamed from: d */
    private float m129678d() {
        return this.f119629c.m129674a(this.f119628b.getStreamVolume(3), this.f119628b.getStreamMaxVolume(3));
    }

    /* renamed from: e */
    private void m129679e() {
        this.f119630d.mo129676a(this.f119631e);
    }

    /* renamed from: a */
    public void m129680a() {
        this.f119631e = m129678d();
        m129679e();
        this.f119627a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    /* renamed from: c */
    public void m129681c() {
        this.f119627a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z11) {
        super.onChange(z11);
        float m129678d = m129678d();
        if (m129677b(m129678d)) {
            this.f119631e = m129678d;
            m129679e();
        }
    }
}
