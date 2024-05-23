package com.zing.zalo.p077ui.searchglobal.viewholder.prestate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.p077ui.widget.InterfaceC13567b1;
import com.zing.zalo.p077ui.widget.ZinstantQuickActionView;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import p578vk.AbstractC28275a;
import p716zh.C31862c;
import tk.InterfaceC26722a;

/* renamed from: com.zing.zalo.ui.searchglobal.viewholder.prestate.c0 */
/* loaded from: classes6.dex */
public class C13046c0 extends RecyclerView.AbstractC1876c0 {

    /* renamed from: I */
    private final InterfaceC18319c f67340I;

    /* renamed from: J */
    private final ZinstantQuickActionView f67341J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13046c0(ViewGroup viewGroup, InterfaceC18319c interfaceC18319c) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.search_global_prestate_item_zinstant, viewGroup, false));
        AbstractC19074t.m100208f(viewGroup, "parent");
        this.f67340I = interfaceC18319c;
        View view = this.f7784p;
        AbstractC19074t.m100206d(view, "null cannot be cast to non-null type com.zing.zalo.ui.widget.ZinstantQuickActionView");
        this.f67341J = (ZinstantQuickActionView) view;
    }

    /* renamed from: i0 */
    public final void m73275i0(InterfaceC26722a interfaceC26722a) {
        Object obj;
        C18316b c18316b;
        AbstractC19074t.m100208f(interfaceC26722a, "data");
        if (interfaceC26722a instanceof AbstractC28275a.z) {
            this.f7784p.setVisibility(0);
            ZinstantQuickActionView zinstantQuickActionView = this.f67341J;
            C31862c m142507a = ((AbstractC28275a.z) interfaceC26722a).m142507a();
            InterfaceC18319c interfaceC18319c = this.f67340I;
            InterfaceC13567b1.a aVar = null;
            if (interfaceC18319c != null && (c18316b = (C18316b) interfaceC18319c.mo205i9(new C18316b("Search.PreState.GetZinstantDelegate", null, null, null, 14, null))) != null) {
                obj = c18316b.m97245a();
            } else {
                obj = null;
            }
            if (obj instanceof InterfaceC13567b1.a) {
                aVar = (InterfaceC13567b1.a) obj;
            }
            zinstantQuickActionView.mo75823b(m142507a, aVar);
            return;
        }
        this.f7784p.setVisibility(8);
    }
}
