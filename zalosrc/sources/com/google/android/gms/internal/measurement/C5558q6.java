package com.google.android.gms.internal.measurement;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.q6 */
/* loaded from: classes.dex */
public final class C5558q6 extends AbstractC5677x6 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5558q6(C5609t6 c5609t6, String str, Boolean bool, boolean z11) {
        super(c5609t6, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.AbstractC5677x6
    /* renamed from: a */
    final /* synthetic */ Object mo29526a(Object obj) {
        if (AbstractC5625u5.f32825c.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (AbstractC5625u5.f32826d.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        String str = this.f32905b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid boolean value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append((String) obj);
        return null;
    }
}
