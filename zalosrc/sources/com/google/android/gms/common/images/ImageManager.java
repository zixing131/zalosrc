package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import com.google.android.gms.common.annotation.KeepName;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import p504s5.AbstractC26137e;

/* loaded from: classes2.dex */
public abstract class ImageManager {

    /* renamed from: a */
    private static final Object f16513a = new Object();

    /* renamed from: b */
    private static HashSet f16514b = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    @KeepName
    /* loaded from: classes2.dex */
    public final class ImageReceiver extends ResultReceiver {

        /* renamed from: p */
        private final Uri f16515p;

        /* renamed from: q */
        private final ArrayList f16516q;

        @Override // android.os.ResultReceiver
        public final void onReceiveResult(int i11, Bundle bundle) {
            ImageManager.m19608h(null).execute(new RunnableC4160a(null, this.f16515p, (ParcelFileDescriptor) bundle.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Context m19601a(ImageManager imageManager) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ Handler m19602b(ImageManager imageManager) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* bridge */ /* synthetic */ AbstractC26137e m19603c(ImageManager imageManager) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* bridge */ /* synthetic */ Map m19606f(ImageManager imageManager) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* bridge */ /* synthetic */ Map m19607g(ImageManager imageManager) {
        throw null;
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ ExecutorService m19608h(ImageManager imageManager) {
        throw null;
    }
}
