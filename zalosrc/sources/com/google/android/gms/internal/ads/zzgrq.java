package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzgrq extends IOException {

    /* renamed from: p */
    private zv3 f32136p;

    /* renamed from: q */
    private boolean f32137q;

    public zzgrq(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f32136p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static zzgrp m28817a() {
        return new zzgrp("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static zzgrq m28818b() {
        return new zzgrq("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static zzgrq m28819c() {
        return new zzgrq("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static zzgrq m28820d() {
        return new zzgrq("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static zzgrq m28821e() {
        return new zzgrq("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static zzgrq m28822f() {
        return new zzgrq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static zzgrq m28823g() {
        return new zzgrq("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static zzgrq m28824i() {
        return new zzgrq("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static zzgrq m28825j() {
        return new zzgrq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: h */
    public final zzgrq m28826h(zv3 zv3Var) {
        this.f32136p = zv3Var;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final void m28827k() {
        this.f32137q = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean m28828l() {
        return this.f32137q;
    }

    public zzgrq(String str) {
        super(str);
        this.f32136p = null;
    }
}
