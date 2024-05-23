package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.i */
/* loaded from: classes2.dex */
public final class C5415i implements InterfaceC5551q {

    /* renamed from: p */
    private final Double f32409p;

    public C5415i(Double d11) {
        if (d11 == null) {
            this.f32409p = Double.valueOf(Double.NaN);
        } else {
            this.f32409p = d11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    /* renamed from: d */
    public final InterfaceC5551q mo29098d(String str, C5590s4 c5590s4, List list) {
        if ("toString".equals(str)) {
            return new C5619u(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzi(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5415i)) {
            return false;
        }
        return this.f32409p.equals(((C5415i) obj).f32409p);
    }

    public final int hashCode() {
        return this.f32409p.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final InterfaceC5551q zzd() {
        return new C5415i(this.f32409p);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Boolean zzg() {
        boolean z11 = false;
        if (!Double.isNaN(this.f32409p.doubleValue()) && this.f32409p.doubleValue() != 0.0d) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Double zzh() {
        return this.f32409p;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final String zzi() {
        int scale;
        if (Double.isNaN(this.f32409p.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.f32409p.doubleValue())) {
            if (this.f32409p.doubleValue() > 0.0d) {
                return "Infinity";
            }
            return "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.f32409p.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        if (stripTrailingZeros.scale() > 0) {
            scale = stripTrailingZeros.precision();
        } else {
            scale = stripTrailingZeros.scale();
        }
        decimalFormat.setMinimumFractionDigits(scale - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            if ((parseInt < 0 && parseInt > -7) || (parseInt >= 0 && parseInt < 21)) {
                return stripTrailingZeros.toPlainString();
            }
            return format.replace("E-", "e-").replace("E", "e+");
        }
        return format;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5551q
    public final Iterator zzl() {
        return null;
    }
}
