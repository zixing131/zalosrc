package com.google.android.gms.common.api;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.AbstractC4073c;
import com.google.android.gms.common.internal.AbstractC4172d;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.internal.C4175e;
import com.google.android.gms.common.internal.InterfaceC4187i;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p669y4.AbstractC30290g;
import p704z4.InterfaceC31220c;
import p704z4.InterfaceC31228g;

/* renamed from: com.google.android.gms.common.api.a */
/* loaded from: classes2.dex */
public final class C4071a {

    /* renamed from: a */
    private final a f16178a;

    /* renamed from: b */
    private final g f16179b;

    /* renamed from: c */
    private final String f16180c;

    /* renamed from: com.google.android.gms.common.api.a$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends e {
        /* renamed from: c */
        public f mo19230c(Context context, Looper looper, C4175e c4175e, Object obj, AbstractC4073c.b bVar, AbstractC4073c.c cVar) {
            return mo16706d(context, looper, c4175e, obj, bVar, cVar);
        }

        /* renamed from: d */
        public f mo16706d(Context context, Looper looper, C4175e c4175e, Object obj, InterfaceC31220c interfaceC31220c, InterfaceC31228g interfaceC31228g) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$b */
    /* loaded from: classes2.dex */
    public interface b {
    }

    /* renamed from: com.google.android.gms.common.api.a$c */
    /* loaded from: classes2.dex */
    public static class c {
    }

    /* renamed from: com.google.android.gms.common.api.a$d */
    /* loaded from: classes2.dex */
    public interface d {

        /* renamed from: b */
        public static final a f16181b = new a(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a */
        /* loaded from: classes2.dex */
        public static final class a implements d {
            /* synthetic */ a(AbstractC30290g abstractC30290g) {
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$e */
    /* loaded from: classes2.dex */
    public static abstract class e {
        /* renamed from: a */
        public List mo19231a(Object obj) {
            return Collections.emptyList();
        }

        /* renamed from: b */
        public int m19232b() {
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: com.google.android.gms.common.api.a$f */
    /* loaded from: classes2.dex */
    public interface f extends b {
        /* renamed from: c */
        Set mo19233c();

        void connect(AbstractC4172d.c cVar);

        void disconnect();

        void disconnect(String str);

        void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

        Feature[] getAvailableFeatures();

        String getEndpointPackageName();

        String getLastDisconnectMessage();

        int getMinApkVersion();

        void getRemoteService(InterfaceC4187i interfaceC4187i, Set set);

        Intent getSignInIntent();

        boolean isConnected();

        boolean isConnecting();

        void onUserSignOut(AbstractC4172d.e eVar);

        boolean providesSignIn();

        boolean requiresGooglePlayServices();

        boolean requiresSignIn();
    }

    /* renamed from: com.google.android.gms.common.api.a$g */
    /* loaded from: classes2.dex */
    public static final class g extends c {
    }

    public C4071a(String str, a aVar, g gVar) {
        AbstractC4205o.m19723l(aVar, "Cannot construct an Api with a null ClientBuilder");
        AbstractC4205o.m19723l(gVar, "Cannot construct an Api with a null ClientKey");
        this.f16180c = str;
        this.f16178a = aVar;
        this.f16179b = gVar;
    }

    /* renamed from: a */
    public final a m19226a() {
        return this.f16178a;
    }

    /* renamed from: b */
    public final c m19227b() {
        return this.f16179b;
    }

    /* renamed from: c */
    public final e m19228c() {
        return this.f16178a;
    }

    /* renamed from: d */
    public final String m19229d() {
        return this.f16180c;
    }
}
