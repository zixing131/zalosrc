package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public final class o93 extends kd2 {

    /* renamed from: e */
    private final Resources f25508e;

    /* renamed from: f */
    private final String f25509f;

    /* renamed from: g */
    private Uri f25510g;

    /* renamed from: h */
    private AssetFileDescriptor f25511h;

    /* renamed from: i */
    private InputStream f25512i;

    /* renamed from: j */
    private long f25513j;

    /* renamed from: k */
    private boolean f25514k;

    public o93(Context context) {
        super(false);
        this.f25508e = context.getResources();
        this.f25509f = context.getPackageName();
    }

    @Override // com.google.android.gms.internal.ads.td4
    /* renamed from: a */
    public final int mo19942a(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            return 0;
        }
        long j11 = this.f25513j;
        if (j11 == 0) {
            return -1;
        }
        if (j11 != -1) {
            try {
                i12 = (int) Math.min(j11, i12);
            } catch (IOException e11) {
                throw new zzfw(null, e11, ZAbstractBase.ZVU_PROCESS_FLUSH);
            }
        }
        InputStream inputStream = this.f25512i;
        int i13 = g92.f20474a;
        int read = inputStream.read(bArr, i11, i12);
        if (read == -1) {
            if (this.f25513j == -1) {
                return -1;
            }
            throw new zzfw("End of stream reached having not read sufficient data.", new EOFException(), ZAbstractBase.ZVU_PROCESS_FLUSH);
        }
        long j12 = this.f25513j;
        if (j12 != -1) {
            this.f25513j = j12 - read;
        }
        m23893b(read);
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:            if (r3.matches("\\d+") != false) goto L85;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    @Override // com.google.android.gms.internal.ads.qj2
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo19943d(wo2 wo2Var) {
        int parseInt;
        AssetFileDescriptor openRawResourceFd;
        long j11;
        String concat;
        Uri uri = wo2Var.f30043a;
        this.f25510g = uri;
        try {
            try {
                if (!TextUtils.equals("rawresource", uri.getScheme())) {
                    if (TextUtils.equals("android.resource", uri.getScheme()) && uri.getPathSegments().size() == 1) {
                        String lastPathSegment = uri.getLastPathSegment();
                        lastPathSegment.getClass();
                    }
                    if (TextUtils.equals("android.resource", uri.getScheme())) {
                        String path = uri.getPath();
                        path.getClass();
                        if (path.startsWith("/")) {
                            path = path.substring(1);
                        }
                        String host = uri.getHost();
                        if (TextUtils.isEmpty(host)) {
                            concat = "";
                        } else {
                            concat = String.valueOf(host).concat(":");
                        }
                        parseInt = this.f25508e.getIdentifier(concat.concat(String.valueOf(path)), "raw", this.f25509f);
                        if (parseInt == 0) {
                            throw new zzfw("Resource not found.", null, 2005);
                        }
                        m23895l(wo2Var);
                        openRawResourceFd = this.f25508e.openRawResourceFd(parseInt);
                        this.f25511h = openRawResourceFd;
                        if (openRawResourceFd == null) {
                            long length = openRawResourceFd.getLength();
                            FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                            this.f25512i = fileInputStream;
                            if (length != -1) {
                                try {
                                    if (wo2Var.f30048f > length) {
                                        throw new zzfw(null, null, 2008);
                                    }
                                } catch (zzfw e11) {
                                    throw e11;
                                } catch (IOException e12) {
                                    throw new zzfw(null, e12, ZAbstractBase.ZVU_PROCESS_FLUSH);
                                }
                            }
                            long startOffset = openRawResourceFd.getStartOffset();
                            long skip = fileInputStream.skip(wo2Var.f30048f + startOffset) - startOffset;
                            if (skip == wo2Var.f30048f) {
                                if (length == -1) {
                                    FileChannel channel = fileInputStream.getChannel();
                                    if (channel.size() == 0) {
                                        this.f25513j = -1L;
                                        j11 = -1;
                                    } else {
                                        j11 = channel.size() - channel.position();
                                        this.f25513j = j11;
                                        if (j11 < 0) {
                                            throw new zzfw(null, null, 2008);
                                        }
                                    }
                                } else {
                                    j11 = length - skip;
                                    this.f25513j = j11;
                                    if (j11 < 0) {
                                        throw new zzey(2008);
                                    }
                                }
                                long j12 = wo2Var.f30049g;
                                if (j12 != -1) {
                                    if (j11 != -1) {
                                        j12 = Math.min(j11, j12);
                                    }
                                    this.f25513j = j12;
                                }
                                this.f25514k = true;
                                m23896m(wo2Var);
                                long j13 = wo2Var.f30049g;
                                if (j13 != -1) {
                                    return j13;
                                }
                                return this.f25513j;
                            }
                            throw new zzfw(null, null, 2008);
                        }
                        throw new zzfw("Resource is compressed: ".concat(String.valueOf(uri)), null, ZAbstractBase.ZVU_PROCESS_FLUSH);
                    }
                    throw new zzfw("URI must either use scheme rawresource or android.resource", null, 1004);
                }
                openRawResourceFd = this.f25508e.openRawResourceFd(parseInt);
                this.f25511h = openRawResourceFd;
                if (openRawResourceFd == null) {
                }
            } catch (Resources.NotFoundException e13) {
                throw new zzfw(null, e13, 2005);
            }
            String lastPathSegment2 = uri.getLastPathSegment();
            lastPathSegment2.getClass();
            parseInt = Integer.parseInt(lastPathSegment2);
            m23895l(wo2Var);
        } catch (NumberFormatException unused) {
            throw new zzfw("Resource identifier must be an integer.", null, 1004);
        }
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final Uri zzc() {
        return this.f25510g;
    }

    @Override // com.google.android.gms.internal.ads.qj2
    public final void zzd() {
        this.f25510g = null;
        try {
            try {
                InputStream inputStream = this.f25512i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f25512i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f25511h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e11) {
                        throw new zzfw(null, e11, ZAbstractBase.ZVU_PROCESS_FLUSH);
                    }
                } finally {
                    this.f25511h = null;
                    if (this.f25514k) {
                        this.f25514k = false;
                        m23894k();
                    }
                }
            } catch (Throwable th2) {
                this.f25512i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f25511h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f25511h = null;
                        if (this.f25514k) {
                            this.f25514k = false;
                            m23894k();
                        }
                        throw th2;
                    } catch (Throwable th3) {
                        this.f25511h = null;
                        if (this.f25514k) {
                            this.f25514k = false;
                            m23894k();
                        }
                        throw th3;
                    }
                } catch (IOException e12) {
                    throw new zzfw(null, e12, ZAbstractBase.ZVU_PROCESS_FLUSH);
                }
            }
        } catch (IOException e13) {
            throw new zzfw(null, e13, ZAbstractBase.ZVU_PROCESS_FLUSH);
        }
    }
}
