package com.zing.zalo.p077ui.toolstorage.overview.moduleviews;

import android.content.Context;
import com.zing.zalo.p077ui.toolstorage.detail.C13380a;
import com.zing.zalo.uidrawing.ModulesView;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;

/* loaded from: classes6.dex */
public abstract class ToolStorageBaseLargestItemModuleView extends ModulesView {

    /* renamed from: K */
    private int f68896K;

    /* renamed from: L */
    private final int f68897L;

    /* renamed from: M */
    private final int f68898M;

    public ToolStorageBaseLargestItemModuleView(Context context) {
        super(context);
        int m118725l0 = AbstractC23136l9.m118725l0(context);
        this.f68896K = m118725l0;
        int i11 = ((m118725l0 - (AbstractC23222t7.f112586t * 2)) - (AbstractC23222t7.f112552c * 6)) / 5;
        this.f68897L = i11;
        this.f68898M = i11;
    }

    /* renamed from: V */
    public abstract void mo75450V(C13380a c13380a);

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getItemHeight() {
        return this.f68898M;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getItemWidth() {
        return this.f68897L;
    }
}
