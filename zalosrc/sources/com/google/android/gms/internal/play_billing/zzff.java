package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: classes2.dex */
public class zzff extends IOException {

    /* renamed from: p */
    private InterfaceC5775i2 f33461p;

    public zzff(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f33461p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static zzfe m30583a() {
        return new zzfe("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static zzff m30584b() {
        return new zzff("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static zzff m30585c() {
        return new zzff("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static zzff m30586d() {
        return new zzff("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static zzff m30587e() {
        return new zzff("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static zzff m30588g() {
        return new zzff("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: f */
    public final zzff m30589f(InterfaceC5775i2 interfaceC5775i2) {
        this.f33461p = interfaceC5775i2;
        return this;
    }

    public zzff(String str) {
        super(str);
        this.f33461p = null;
    }
}
