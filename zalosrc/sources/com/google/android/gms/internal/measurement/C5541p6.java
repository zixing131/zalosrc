package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.p6 */
/* loaded from: classes.dex */
public final class C5541p6 extends AbstractC5677x6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5541p6(C5609t6 c5609t6, String str, Long l11, boolean z11) {
        super(c5609t6, str, l11, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5677x6
    /* renamed from: a */
    final /* synthetic */ Object mo29526a(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            String str = this.f32905b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid long value for ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append((String) obj);
            return null;
        }
    }
}
