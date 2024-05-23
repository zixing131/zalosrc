package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class mg2 extends kd2 {

    /* renamed from: e */
    private final ContentResolver f24508e;

    /* renamed from: f */
    private Uri f24509f;

    /* renamed from: g */
    private AssetFileDescriptor f24510g;

    /* renamed from: h */
    private FileInputStream f24511h;

    /* renamed from: i */
    private long f24512i;

    /* renamed from: j */
    private boolean f24513j;

    public mg2(Context context) {
        super(false);
        this.f24508e = context.getContentResolver();
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f24512i;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new zzet(e11, ZAbstractBase.ZVU_PROCESS_FLUSH);
            }
        }
        FileInputStream fileInputStream = this.f24511h;
        int i13 = g92.f20474a;
        int read = fileInputStream.read(bArr, i11, i12);
        if (read == -1) {
            return -1;
        }
        long j12 = this.f24512i;
        if (j12 != -1) {
            this.f24512i = j12 - read;
        }
        m23893b(read);
        return read;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    public final long mo19943d(wo2 wo2Var) {
        int i11;
        AssetFileDescriptor openAssetFileDescriptor;
        long j11;
        try {
            try {
                Uri uri = wo2Var.f30043a;
                this.f24509f = uri;
                m23895l(wo2Var);
                if ("content".equals(wo2Var.f30043a.getScheme())) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    openAssetFileDescriptor = this.f24508e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
                } else {
                    openAssetFileDescriptor = this.f24508e.openAssetFileDescriptor(uri, "r");
                }
                this.f24510g = openAssetFileDescriptor;
                if (openAssetFileDescriptor != null) {
                    long length = openAssetFileDescriptor.getLength();
                    FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                    this.f24511h = fileInputStream;
                    if (length != -1 && wo2Var.f30048f > length) {
                        throw new zzet(null, 2008);
                    }
                    long startOffset = openAssetFileDescriptor.getStartOffset();
                    long skip = fileInputStream.skip(wo2Var.f30048f + startOffset) - startOffset;
                    if (skip == wo2Var.f30048f) {
                        if (length == -1) {
                            FileChannel channel = fileInputStream.getChannel();
                            long size = channel.size();
                            if (size == 0) {
                                this.f24512i = -1L;
                                j11 = -1;
                            } else {
                                j11 = size - channel.position();
                                this.f24512i = j11;
                                if (j11 < 0) {
                                    throw new zzet(null, 2008);
                                }
                            }
                        } else {
                            j11 = length - skip;
                            this.f24512i = j11;
                            if (j11 < 0) {
                                throw new zzet(null, 2008);
                            }
                        }
                        long j12 = wo2Var.f30049g;
                        if (j12 != -1) {
                            if (j11 != -1) {
                                j12 = Math.min(j11, j12);
                            }
                            this.f24512i = j12;
                        }
                        this.f24513j = true;
                        m23896m(wo2Var);
                        long j13 = wo2Var.f30049g;
                        if (j13 != -1) {
                            return j13;
                        }
                        return this.f24512i;
                    }
                    throw new zzet(null, 2008);
                }
                IOException iOException = new IOException("Could not open file descriptor for: " + String.valueOf(uri));
                i11 = ZAbstractBase.ZVU_PROCESS_FLUSH;
                try {
                    throw new zzet(iOException, ZAbstractBase.ZVU_PROCESS_FLUSH);
                } catch (IOException e11) {
                    e = e11;
                    if (true == (e instanceof FileNotFoundException)) {
                        i11 = 2005;
                    }
                    throw new zzet(e, i11);
                }
            } catch (IOException e12) {
                e = e12;
                i11 = ZAbstractBase.ZVU_PROCESS_FLUSH;
            }
        } catch (zzet e13) {
            throw e13;
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f24509f;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        this.f24509f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f24511h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f24511h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f24510g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e11) {
                        throw new zzet(e11, ZAbstractBase.ZVU_PROCESS_FLUSH);
                    }
                } finally {
                    this.f24510g = null;
                    if (this.f24513j) {
                        this.f24513j = false;
                        m23894k();
                    }
                }
            } catch (Throwable th2) {
                this.f24511h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f24510g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f24510g = null;
                        if (this.f24513j) {
                            this.f24513j = false;
                            m23894k();
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        this.f24510g = null;
                        if (this.f24513j) {
                            this.f24513j = false;
                            m23894k();
                        }
                        throw th3;
                    }
                } catch (IOException e12) {
                    throw new zzet(e12, ZAbstractBase.ZVU_PROCESS_FLUSH);
                }
            }
        } catch (IOException e13) {
            throw new zzet(e13, ZAbstractBase.ZVU_PROCESS_FLUSH);
        }
    }
}
