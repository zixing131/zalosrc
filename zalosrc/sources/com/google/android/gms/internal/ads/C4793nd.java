package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.nd */
/* loaded from: classes2.dex */
public final class C4793nd extends AbstractC4756md {
    protected C4793nd(Context context, String str, boolean z11) {
        super(context, str, z11);
    }

    /* renamed from: p */
    public static C4793nd m24885p(String str, Context context, boolean z11) {
        AbstractC4756md.m24544l(context, false);
        return new C4793nd(context, str, false);
    }

    /* renamed from: q */
    public static C4793nd m24886q(String str, Context context, boolean z11, int i11) {
        AbstractC4756md.m24544l(context, z11);
        return new C4793nd(context, str, z11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.AbstractC4756md
    /* renamed from: j */
    public final List mo24548j(C4719le c4719le, Context context, C4939ra c4939ra, C4678ka c4678ka) {
        if (c4719le.m24248k() != null && this.f24470J) {
            int m24239a = c4719le.m24239a();
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(super.mo24548j(c4719le, context, c4939ra, null));
            arrayList.add(new C4499ff(c4719le, "ysEnh8zkgcN8WwINs5FP7vGybZW2TtVSX36HO6emvdUrcCkVbC9hrF5Pe5ZSZx3i", "3LpdW89cIASEFv5WvS5ZDEWsiVGQitP33SL3WZgJ6zE=", c4939ra, m24239a, 24));
            return arrayList;
        }
        return super.mo24548j(c4719le, context, c4939ra, null);
    }
}
