package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p342m6.AbstractC22888j;
import p342m6.C22890k;

/* renamed from: com.google.firebase.messaging.c0 */
/* loaded from: classes3.dex */
public class C6606c0 implements Closeable {

    /* renamed from: p */
    private final URL f36629p;

    /* renamed from: q */
    private volatile Future f36630q;

    /* renamed from: r */
    private AbstractC22888j f36631r;

    private C6606c0(URL url) {
        this.f36629p = url;
    }

    /* renamed from: c */
    private byte[] m33788c() {
        URLConnection openConnection = this.f36629p.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] m33776d = AbstractC6602b.m33776d(AbstractC6602b.m33774b(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Downloaded ");
                    sb2.append(m33776d.length);
                    sb2.append(" bytes from ");
                    sb2.append(this.f36629p);
                }
                if (m33776d.length <= 1048576) {
                    return m33776d;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    /* renamed from: d */
    public static C6606c0 m33789d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C6606c0(new URL(str));
        } catch (MalformedURLException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Not downloading image, bad URL: ");
            sb2.append(str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m33790h(C22890k c22890k) {
        try {
            c22890k.m117596c(m33791b());
        } catch (Exception e11) {
            c22890k.m117595b(e11);
        }
    }

    /* renamed from: b */
    public Bitmap m33791b() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Starting download of: ");
            sb2.append(this.f36629p);
        }
        byte[] m33788c = m33788c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(m33788c, 0, m33788c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Successfully downloaded image: ");
                sb3.append(this.f36629p);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f36629p);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f36630q.cancel(true);
    }

    /* renamed from: f */
    public AbstractC22888j m33792f() {
        return (AbstractC22888j) AbstractC4205o.m19722k(this.f36631r);
    }

    /* renamed from: i */
    public void m33793i(ExecutorService executorService) {
        final C22890k c22890k = new C22890k();
        this.f36630q = executorService.submit(new Runnable() { // from class: com.google.firebase.messaging.b0
            @Override // java.lang.Runnable
            public final void run() {
                C6606c0.this.m33790h(c22890k);
            }
        });
        this.f36631r = c22890k.m117594a();
    }
}
