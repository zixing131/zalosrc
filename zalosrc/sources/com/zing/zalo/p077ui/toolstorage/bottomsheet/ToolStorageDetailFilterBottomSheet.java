package com.zing.zalo.p077ui.toolstorage.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class ToolStorageDetailFilterBottomSheet extends ZdsModalBottomSheet {
    public static final C13332a Companion = new C13332a(null);

    /* renamed from: U0 */
    private static final String f68465U0;

    /* renamed from: S0 */
    private ArrayList f68466S0 = new ArrayList();

    /* renamed from: T0 */
    private int f68467T0;

    /* renamed from: com.zing.zalo.ui.toolstorage.bottomsheet.ToolStorageDetailFilterBottomSheet$a */
    /* loaded from: classes6.dex */
    public static final class C13332a {
        private C13332a() {
        }

        public /* synthetic */ C13332a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final String m74844a(Context context, String str) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
            int hashCode = str.hashCode();
            if (hashCode != -1964972026) {
                if (hashCode != -1930444257) {
                    if (hashCode == 1616281276 && str.equals("Largest")) {
                        String string = context.getString(AbstractC8020f0.str_tool_storage_usage_detail_sort_by_largest);
                        AbstractC19074t.m100207e(string, "getString(...)");
                        return string;
                    }
                } else if (str.equals("Oldest")) {
                    String string2 = context.getString(AbstractC8020f0.str_tool_storage_usage_detail_sort_by_oldest);
                    AbstractC19074t.m100207e(string2, "getString(...)");
                    return string2;
                }
            } else if (str.equals("Newest")) {
                String string3 = context.getString(AbstractC8020f0.str_tool_storage_usage_detail_sort_by_newest);
                AbstractC19074t.m100207e(string3, "getString(...)");
                return string3;
            }
            return "";
        }

        /* renamed from: b */
        public final String m74845b() {
            return ToolStorageDetailFilterBottomSheet.f68465U0;
        }
    }

    static {
        String simpleName = ToolStorageDetailFilterBottomSheet.class.getSimpleName();
        AbstractC19074t.m100207e(simpleName, "getSimpleName(...)");
        f68465U0 = simpleName;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: kM */
    public String mo50389kM() {
        return f68465U0;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet
    /* renamed from: nM */
    protected BottomSheet mo45673nM() {
        ToolStorageDetailFilterBS toolStorageDetailFilterBS = new ToolStorageDetailFilterBS();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("EXTRA_PARAM_LIST_FILTER", new ArrayList<>(this.f68466S0));
        bundle.putInt("EXTRA_PARAM_SELECTED_POS", this.f68467T0);
        toolStorageDetailFilterBS.mo60305zK(bundle);
        return toolStorageDetailFilterBS;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZdsModalBottomSheet, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        ArrayList<String> arrayList;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            arrayList = m92642L3.getStringArrayList("EXTRA_PARAM_LIST_FILTER");
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        this.f68466S0 = arrayList;
        Bundle m92642L32 = m92642L3();
        int i11 = 0;
        if (m92642L32 != null) {
            i11 = m92642L32.getInt("EXTRA_PARAM_SELECTED_POS", 0);
        }
        this.f68467T0 = i11;
        super.mo37135xJ(bundle);
    }
}
