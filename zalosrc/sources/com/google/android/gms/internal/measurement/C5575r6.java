package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.r6 */
/* loaded from: classes.dex */
public final class C5575r6 extends AbstractC5677x6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5575r6(C5609t6 c5609t6, String str, Double d11, boolean z11) {
        super(c5609t6, "measurement.test.double_flag", d11, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5677x6
    /* renamed from: a */
    final /* synthetic */ Object mo29526a(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            String str = this.f32905b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid double value for ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append((String) obj);
            return null;
        }
    }
}
