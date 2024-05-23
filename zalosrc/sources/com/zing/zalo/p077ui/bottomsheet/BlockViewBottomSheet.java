package com.zing.zalo.p077ui.bottomsheet;

import ae.C0766k;
import ag0.AbstractC0837p0;
import ag0.C0824j;
import am.AbstractC0939u;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ZAppCompatImageView;
import androidx.core.widget.NestedScrollView;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p062db.C7960e;
import com.zing.zalo.p077ui.bottomsheet.BlockViewBottomSheet;
import com.zing.zalo.p077ui.bottomsheet.BottomSheetBlockView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.CheckBox;
import com.zing.zalo.zdesign.component.EnumC17017m;
import fn0.AbstractC19074t;
import gw.C19669z;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import is.C20834z0;
import java.util.ArrayList;
import java.util.HashSet;
import me0.AbstractC23088h5;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p304ks.C21912a;
import p304ks.C21914b;
import p304ks.C21927m;
import p304ks.C21937w;
import p649xl.C29900l0;
import p716zh.C31853b5;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import vg.C28203u6;

/* loaded from: classes5.dex */
public final class BlockViewBottomSheet extends BottomSheet {

    /* renamed from: b1 */
    public C29900l0 f56179b1;

    /* renamed from: c1 */
    private ContactProfile f56180c1;

    /* renamed from: d1 */
    private int f56181d1;

    /* renamed from: e1 */
    private boolean f56182e1 = true;

    /* renamed from: f1 */
    private int f56183f1;

    /* renamed from: g1 */
    private boolean f56184g1;

    /* renamed from: h1 */
    private boolean f56185h1;

    /* renamed from: i1 */
    private boolean f56186i1;

    /* renamed from: j1 */
    private boolean f56187j1;

    /* renamed from: k1 */
    private boolean f56188k1;

    /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$a */
    /* loaded from: classes5.dex */
    public static final class C11159a implements InterfaceC20094a {
        C11159a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            BlockViewBottomSheet.this.f56182e1 = false;
            BlockViewBottomSheet.this.m58467ZL();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            C21914b.f107731a.m114195e(BlockViewBottomSheet.this.f56180c1);
            BlockViewBottomSheet.this.m58467ZL();
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$b */
    /* loaded from: classes5.dex */
    public static final class C11160b implements InterfaceC20094a {
        C11160b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            BlockViewBottomSheet.this.f56182e1 = false;
            BlockViewBottomSheet.this.m58467ZL();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C21912a.m114159g().m114162b(BlockViewBottomSheet.this.f56180c1);
            BlockViewBottomSheet.this.m58467ZL();
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$c */
    /* loaded from: classes5.dex */
    public static final class C11161c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ContactProfile f56192b;

        /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$c$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC0939u {

            /* renamed from: a */
            final /* synthetic */ ContactProfile f56193a;

            /* renamed from: b */
            final /* synthetic */ ContactProfile f56194b;

            a(ContactProfile contactProfile, ContactProfile contactProfile2) {
                this.f56193a = contactProfile;
                this.f56194b = contactProfile2;
            }

            @Override // p660xw.InterfaceC30214a
            /* renamed from: a */
            public void mo928a() {
                C7960e.m41971c6().m42131G7(this.f56193a, true);
                C7960e.m41971c6().m42234Pb(this.f56194b.f42434r);
            }
        }

        C11161c(ContactProfile contactProfile) {
            this.f56192b = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "errorMessage");
            BlockViewBottomSheet.this.f56182e1 = false;
            BlockViewBottomSheet.this.m58467ZL();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            if (jSONObject2.getInt("code") != 0) {
                            }
                        }
                        BlockViewBottomSheet.this.f56182e1 = false;
                        BlockViewBottomSheet.this.m58467ZL();
                        C18644n.m98524E();
                        return;
                    }
                    AbstractC21935u.m114558y(this.f56192b.f42434r);
                    ContactProfile m98552o = C18644n.m98531l().m98552o(this.f56192b.f42434r);
                    if (m98552o == null) {
                        m98552o = C28203u6.m141798e(C28203u6.f131407a, this.f56192b.f42434r, null, 2, null);
                    }
                    if (m98552o == null) {
                        m98552o = this.f56192b;
                    }
                    m98552o.f42403c1 = false;
                    C28203u6.f131407a.m141824w(m98552o);
                    C21927m.m114302u().m114350o0(this.f56192b.f42434r);
                    if (!ZaloListView.m86977gN() && C21927m.m114302u().m114351p().contains(this.f56192b.f42434r)) {
                        ArrayList arrayList = new ArrayList();
                        String str = this.f56192b.f42434r;
                        AbstractC19074t.m100207e(str, "uid");
                        arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                        C21927m.m114302u().m114338i0(arrayList);
                    }
                    C0824j.m2153b(new a(m98552o, this.f56192b));
                    C19669z.Companion.m103232a().m103198O0();
                    AbstractC23088h5.m118426g();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                BlockViewBottomSheet.this.m58467ZL();
                C18644n.m98524E();
            } catch (Throwable th2) {
                BlockViewBottomSheet.this.m58467ZL();
                C18644n.m98524E();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$d */
    /* loaded from: classes5.dex */
    public static final class C11162d implements InterfaceC20094a {
        C11162d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            BlockViewBottomSheet.this.f56182e1 = false;
            BlockViewBottomSheet.this.m58467ZL();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            C21937w.f108027a.m114568f(BlockViewBottomSheet.this.f56180c1);
            C20834z0.f102412a.m108928g(true);
            BlockViewBottomSheet.this.m58467ZL();
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$e */
    /* loaded from: classes5.dex */
    public static final class C11163e implements InterfaceC20094a {
        C11163e() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                JSONArray optJSONArray = ((JSONObject) obj).optJSONArray("data");
                if (optJSONArray != null) {
                    BlockViewBottomSheet blockViewBottomSheet = BlockViewBottomSheet.this;
                    HashSet hashSet = new HashSet();
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        hashSet.add(Integer.valueOf(optJSONArray.optInt(i11, 0)));
                        blockViewBottomSheet.m58493uM(hashSet);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$f */
    /* loaded from: classes5.dex */
    public static final class C11164f implements InterfaceC20094a {
        C11164f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            BlockViewBottomSheet.this.f56182e1 = false;
            BlockViewBottomSheet.this.m58467ZL();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            AbstractC19074t.m100208f(obj, "entity");
            C21914b c21914b = C21914b.f107731a;
            ContactProfile contactProfile = BlockViewBottomSheet.this.f56180c1;
            if (contactProfile != null) {
                str = contactProfile.f42434r;
            } else {
                str = null;
            }
            c21914b.m114203n(str);
            BlockViewBottomSheet.this.m58467ZL();
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$g */
    /* loaded from: classes5.dex */
    public static final class C11165g implements InterfaceC20094a {
        C11165g() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            BlockViewBottomSheet.this.f56182e1 = false;
            BlockViewBottomSheet.this.m58467ZL();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            AbstractC19074t.m100208f(obj, "entity");
            C21912a m114159g = C21912a.m114159g();
            ContactProfile contactProfile = BlockViewBottomSheet.this.f56180c1;
            if (contactProfile != null) {
                str = contactProfile.f42434r;
            } else {
                str = null;
            }
            m114159g.m114173o(str);
            BlockViewBottomSheet.this.m58467ZL();
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$h */
    /* loaded from: classes5.dex */
    public static final class C11166h implements InterfaceC20094a {
        C11166h() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            BlockViewBottomSheet.this.f56182e1 = false;
            BlockViewBottomSheet.this.m58467ZL();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            String str;
            AbstractC19074t.m100208f(obj, "entity");
            C21937w c21937w = C21937w.f108027a;
            ContactProfile contactProfile = BlockViewBottomSheet.this.f56180c1;
            if (contactProfile != null) {
                str = contactProfile.f42434r;
            } else {
                str = null;
            }
            c21937w.m114576o(str);
            C20834z0.f102412a.m108928g(true);
            BlockViewBottomSheet.this.m58467ZL();
        }
    }

    /* renamed from: com.zing.zalo.ui.bottomsheet.BlockViewBottomSheet$i */
    /* loaded from: classes5.dex */
    public static final class C11167i implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ ContactProfile f56201b;

        C11167i(ContactProfile contactProfile) {
            this.f56201b = contactProfile;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            BlockViewBottomSheet.this.f56182e1 = false;
            BlockViewBottomSheet.this.m58467ZL();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    new JSONObject();
                    if (jSONObject.has("data")) {
                        JSONObject jSONObject2 = new JSONObject(jSONObject.getString("data"));
                        if (!jSONObject2.isNull("code")) {
                            if (jSONObject2.getInt("code") != 0) {
                            }
                        }
                        BlockViewBottomSheet.this.f56182e1 = false;
                        BlockViewBottomSheet.this.m58467ZL();
                        return;
                    }
                    ContactProfile contactProfile = this.f56201b;
                    AbstractC21935u.m114532V(false, contactProfile.f42434r, contactProfile);
                    C19669z.Companion.m103232a().m103198O0();
                    C21927m.m114302u().m114336h0();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                BlockViewBottomSheet.this.m58467ZL();
            } catch (Throwable th2) {
                BlockViewBottomSheet.this.m58467ZL();
                throw th2;
            }
        }
    }

    /* renamed from: YL */
    private final void m58466YL() {
        m58485dM().f138534q.setEnabled(m58478nM());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZL */
    public final void m58467ZL() {
        AbstractC0837p0.Companion.m2239h().mo2040a(new Runnable() { // from class: e50.g
            @Override // java.lang.Runnable
            public final void run() {
                BlockViewBottomSheet.m58468aM(BlockViewBottomSheet.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aM */
    public static final void m58468aM(final BlockViewBottomSheet blockViewBottomSheet) {
        AbstractC19074t.m100208f(blockViewBottomSheet, "this$0");
        synchronized (blockViewBottomSheet) {
            try {
                int i11 = blockViewBottomSheet.f56181d1 - 1;
                blockViewBottomSheet.f56181d1 = i11;
                if (i11 == 0) {
                    blockViewBottomSheet.mo70710wy(new Runnable() { // from class: e50.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            BlockViewBottomSheet.m58469bM(BlockViewBottomSheet.this);
                        }
                    });
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bM */
    public static final void m58469bM(BlockViewBottomSheet blockViewBottomSheet) {
        String m118743r0;
        AbstractC19074t.m100208f(blockViewBottomSheet, "this$0");
        blockViewBottomSheet.m91393c4();
        blockViewBottomSheet.m58479pM();
        if (blockViewBottomSheet.f56182e1) {
            blockViewBottomSheet.close();
            boolean z11 = blockViewBottomSheet.f56184g1;
            if (z11 && blockViewBottomSheet.f56186i1) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.msg_block_msg_and_call_success);
            } else if (z11) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.msg_block_msg_success);
            } else if (blockViewBottomSheet.f56186i1) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.msg_block_call_success);
            } else {
                boolean z12 = blockViewBottomSheet.f56185h1;
                if (z12 && blockViewBottomSheet.f56187j1) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.msg_unblock_msg_and_call_success);
                } else if (z12) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.msg_unblock_msg_success);
                } else if (blockViewBottomSheet.f56187j1) {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.msg_unblock_call_success);
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.msg_update_success);
                }
            }
            AbstractC19074t.m100205c(m118743r0);
            ToastUtils.m89277y(blockViewBottomSheet, m118743r0, true);
            return;
        }
        ToastUtils.m89277y(blockViewBottomSheet, AbstractC23136l9.m118743r0(AbstractC8020f0.msg_update_fail), false);
    }

    /* renamed from: cM */
    private final void m58470cM() {
        synchronized (this) {
            this.f56181d1++;
        }
    }

    /* renamed from: gM */
    private final void m58471gM() {
        String str;
        ContactProfile contactProfile = this.f56180c1;
        String str2 = null;
        if (contactProfile != null) {
            str = contactProfile.f42434r;
        } else {
            str = null;
        }
        AbstractC21935u.m114515E(str);
        final ListItemSetting listItemSetting = m58485dM().f138537t;
        listItemSetting.setIdTracking("BOTTOM_SHEET_BLOCK_BLOCK_MSG");
        AbstractC19074t.m100205c(listItemSetting);
        ListItemSetting.m74603F(listItemSetting, AbstractC2810d.zds_ic_chat_block_line_24, null, 0, 6, null);
        listItemSetting.setCheckBoxRight(true);
        listItemSetting.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e50.a
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                BlockViewBottomSheet.m58472hM(BlockViewBottomSheet.this, listItemSetting, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting2 = m58485dM().f138535r;
        listItemSetting2.setIdTracking("BOTTOM_SHEET_BLOCK_BLOCK_CALL");
        AbstractC19074t.m100205c(listItemSetting2);
        ListItemSetting.m74603F(listItemSetting2, AbstractC2810d.zds_ic_call_failed_line_24, null, 0, 6, null);
        listItemSetting2.setCheckBoxRight(false);
        listItemSetting2.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e50.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                BlockViewBottomSheet.m58474jM(BlockViewBottomSheet.this, listItemSetting2, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting3 = m58485dM().f138539v;
        listItemSetting3.setIdTracking("BOTTOM_SHEET_BLOCK_SESSION_FEED");
        AbstractC19074t.m100205c(listItemSetting3);
        ListItemSetting.m74603F(listItemSetting3, AbstractC2810d.zds_ic_clock_block_line_24, null, 0, 6, null);
        listItemSetting3.setCheckBoxRight(true);
        listItemSetting3.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e50.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                BlockViewBottomSheet.m58475kM(BlockViewBottomSheet.this, listItemSetting3, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting4 = m58485dM().f138536s;
        listItemSetting4.setIdTracking("BOTTOM_SHEET_BLOCK_BLOCK_FEED");
        AbstractC19074t.m100205c(listItemSetting4);
        ListItemSetting.m74603F(listItemSetting4, AbstractC2810d.zds_ic_clock_block_line_24, null, 0, 6, null);
        ZAppCompatImageView iconSetting = listItemSetting4.getIconSetting();
        if (iconSetting != null) {
            iconSetting.setVisibility(4);
        }
        listItemSetting4.setCheckBoxRight(true);
        listItemSetting4.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e50.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                BlockViewBottomSheet.m58476lM(BlockViewBottomSheet.this, listItemSetting4, compoundButton, z11);
            }
        });
        final ListItemSetting listItemSetting5 = m58485dM().f138538u;
        listItemSetting5.setIdTracking("BOTTOM_SHEET_BLOCK_HIDE_FEED");
        AbstractC19074t.m100205c(listItemSetting5);
        ListItemSetting.m74603F(listItemSetting5, AbstractC2810d.zds_ic_clock_block_line_24, null, 0, 6, null);
        ZAppCompatImageView iconSetting2 = listItemSetting5.getIconSetting();
        if (iconSetting2 != null) {
            iconSetting2.setVisibility(4);
        }
        listItemSetting5.setCheckBoxRight(true);
        listItemSetting5.setCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: e50.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                BlockViewBottomSheet.m58477mM(BlockViewBottomSheet.this, listItemSetting5, compoundButton, z11);
            }
        });
        m58485dM().f138536s.setVisibility(8);
        m58485dM().f138538u.setVisibility(8);
        RobotoTextView robotoTextView = m58485dM().f138541x;
        int i11 = AbstractC8020f0.str_block_manager_title_with;
        Object[] objArr = new Object[1];
        ContactProfile contactProfile2 = this.f56180c1;
        if (contactProfile2 != null) {
            str2 = contactProfile2.m40383Q(true, false);
        }
        objArr[0] = str2;
        robotoTextView.setText(AbstractC23136l9.m118746s0(i11, objArr));
        Button button = m58485dM().f138534q;
        button.setIdTracking("BOTTOM_SHEET_BLOCK_CLICK_APPLY");
        button.setOnClickListener(new View.OnClickListener() { // from class: e50.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BlockViewBottomSheet.m58473iM(BlockViewBottomSheet.this, view);
            }
        });
        m58479pM();
        m58486eM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: hM */
    public static final void m58472hM(BlockViewBottomSheet blockViewBottomSheet, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(blockViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        blockViewBottomSheet.m58488oM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:            if (r3.m114200k(r4) == r1.isChecked()) goto L36;     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bc, code lost:            if (r3.m114169j(r4) == r1.isChecked()) goto L58;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f5, code lost:            if (r3.m114574m(r2) == r1.isChecked()) goto L72;     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0112, code lost:            if (r6 == false) goto L74;     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* renamed from: iM */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m58473iM(BlockViewBottomSheet blockViewBottomSheet, View view) {
        boolean z11;
        CheckBox checkBox;
        CheckBox checkBox2;
        C18644n m98531l;
        ContactProfile contactProfile;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC19074t.m100208f(blockViewBottomSheet, "this$0");
        ContactProfile contactProfile2 = blockViewBottomSheet.f56180c1;
        if (contactProfile2 != null) {
            blockViewBottomSheet.f56182e1 = true;
            CheckBox checkBox3 = blockViewBottomSheet.m58485dM().f138537t.getCheckBox();
            String str5 = null;
            if (checkBox3 != null) {
                C31853b5 m114312J = C21927m.m114302u().m114312J();
                ContactProfile contactProfile3 = blockViewBottomSheet.f56180c1;
                if (contactProfile3 != null) {
                    str4 = contactProfile3.f42434r;
                } else {
                    str4 = null;
                }
                if (m114312J.m153137g(str4) == checkBox3.isChecked()) {
                    z11 = false;
                    checkBox = blockViewBottomSheet.m58485dM().f138535r.getCheckBox();
                    if (checkBox != null) {
                        C21914b c21914b = C21914b.f107731a;
                        ContactProfile contactProfile4 = blockViewBottomSheet.f56180c1;
                        if (contactProfile4 != null) {
                            str3 = contactProfile4.f42434r;
                        } else {
                            str3 = null;
                        }
                    }
                    checkBox2 = blockViewBottomSheet.m58485dM().f138535r.getCheckBox();
                    if (checkBox2 == null && checkBox2.isChecked()) {
                        blockViewBottomSheet.m58481UL();
                    } else {
                        blockViewBottomSheet.m58489qM();
                    }
                    z11 = true;
                    m98531l = C18644n.m98531l();
                    contactProfile = blockViewBottomSheet.f56180c1;
                    if (contactProfile == null) {
                        str = contactProfile.f42434r;
                    } else {
                        str = null;
                    }
                    if (m98531l.m98558u(str)) {
                        CheckBox checkBox4 = blockViewBottomSheet.m58485dM().f138536s.getCheckBox();
                        if (checkBox4 != null) {
                            C21912a m114159g = C21912a.m114159g();
                            ContactProfile contactProfile5 = blockViewBottomSheet.f56180c1;
                            if (contactProfile5 != null) {
                                str2 = contactProfile5.f42434r;
                            } else {
                                str2 = null;
                            }
                        }
                        CheckBox checkBox5 = blockViewBottomSheet.m58485dM().f138536s.getCheckBox();
                        if (checkBox5 != null && checkBox5.isChecked()) {
                            blockViewBottomSheet.m58482VL();
                        } else {
                            blockViewBottomSheet.m58490rM();
                        }
                        z11 = true;
                        CheckBox checkBox6 = blockViewBottomSheet.m58485dM().f138538u.getCheckBox();
                        if (checkBox6 != null) {
                            C21937w c21937w = C21937w.f108027a;
                            ContactProfile contactProfile6 = blockViewBottomSheet.f56180c1;
                            if (contactProfile6 != null) {
                                str5 = contactProfile6.f42434r;
                            }
                        }
                        CheckBox checkBox7 = blockViewBottomSheet.m58485dM().f138538u.getCheckBox();
                        if (checkBox7 != null && checkBox7.isChecked()) {
                            blockViewBottomSheet.m58484XL();
                        } else {
                            blockViewBottomSheet.m58491sM();
                        }
                        blockViewBottomSheet.m91392Y();
                        return;
                    }
                }
            }
            CheckBox checkBox8 = blockViewBottomSheet.m58485dM().f138537t.getCheckBox();
            if (checkBox8 != null && checkBox8.isChecked()) {
                blockViewBottomSheet.m58483WL(contactProfile2);
            } else {
                blockViewBottomSheet.m58494wM(contactProfile2);
            }
            z11 = true;
            checkBox = blockViewBottomSheet.m58485dM().f138535r.getCheckBox();
            if (checkBox != null) {
            }
            checkBox2 = blockViewBottomSheet.m58485dM().f138535r.getCheckBox();
            if (checkBox2 == null) {
            }
            blockViewBottomSheet.m58489qM();
            z11 = true;
            m98531l = C18644n.m98531l();
            contactProfile = blockViewBottomSheet.f56180c1;
            if (contactProfile == null) {
            }
            if (m98531l.m98558u(str)) {
            }
        }
        blockViewBottomSheet.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public static final void m58474jM(BlockViewBottomSheet blockViewBottomSheet, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(blockViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        blockViewBottomSheet.m58488oM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public static final void m58475kM(BlockViewBottomSheet blockViewBottomSheet, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(blockViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        blockViewBottomSheet.m58488oM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m58476lM(BlockViewBottomSheet blockViewBottomSheet, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(blockViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        blockViewBottomSheet.m58488oM(listItemSetting, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m58477mM(BlockViewBottomSheet blockViewBottomSheet, ListItemSetting listItemSetting, CompoundButton compoundButton, boolean z11) {
        AbstractC19074t.m100208f(blockViewBottomSheet, "this$0");
        AbstractC19074t.m100208f(listItemSetting, "$this_apply");
        blockViewBottomSheet.m58488oM(listItemSetting, z11);
    }

    /* renamed from: nM */
    private final boolean m58478nM() {
        String str;
        CheckBox checkBox;
        String str2;
        String str3;
        String str4;
        CheckBox checkBox2;
        CheckBox checkBox3 = m58485dM().f138537t.getCheckBox();
        if (checkBox3 != null) {
            C31853b5 m114312J = C21927m.m114302u().m114312J();
            ContactProfile contactProfile = this.f56180c1;
            String str5 = null;
            if (contactProfile != null) {
                str = contactProfile.f42434r;
            } else {
                str = null;
            }
            if (m114312J.m153137g(str) == checkBox3.isChecked() && (checkBox = m58485dM().f138535r.getCheckBox()) != null) {
                C21914b c21914b = C21914b.f107731a;
                ContactProfile contactProfile2 = this.f56180c1;
                if (contactProfile2 != null) {
                    str2 = contactProfile2.f42434r;
                } else {
                    str2 = null;
                }
                if (c21914b.m114200k(str2) == checkBox.isChecked()) {
                    ContactProfile contactProfile3 = this.f56180c1;
                    if (contactProfile3 != null) {
                        str3 = contactProfile3.f42434r;
                    } else {
                        str3 = null;
                    }
                    if (!AbstractC21935u.m114515E(str3)) {
                        CheckBox checkBox4 = m58485dM().f138536s.getCheckBox();
                        if (checkBox4 != null) {
                            C21912a m114159g = C21912a.m114159g();
                            ContactProfile contactProfile4 = this.f56180c1;
                            if (contactProfile4 != null) {
                                str4 = contactProfile4.f42434r;
                            } else {
                                str4 = null;
                            }
                            if (m114159g.m114169j(str4) == checkBox4.isChecked() && (checkBox2 = m58485dM().f138538u.getCheckBox()) != null) {
                                C21937w c21937w = C21937w.f108027a;
                                ContactProfile contactProfile5 = this.f56180c1;
                                if (contactProfile5 != null) {
                                    str5 = contactProfile5.f42434r;
                                }
                                if (c21937w.m114574m(str5) == checkBox2.isChecked()) {
                                    return false;
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: pM */
    private final void m58479pM() {
        boolean z11;
        ContactProfile contactProfile = this.f56180c1;
        if (contactProfile != null) {
            m58485dM().f138537t.setCheckBox(C21927m.m114302u().m114312J().m153137g(contactProfile.f42434r));
            m58485dM().f138535r.setCheckBox(C21914b.f107731a.m114200k(contactProfile.f42434r));
            if (AbstractC21935u.m114515E(contactProfile.f42434r)) {
                m58485dM().f138539v.setVisibility(8);
                m58485dM().f138536s.setVisibility(8);
                m58485dM().f138538u.setVisibility(8);
            } else {
                boolean m114169j = C21912a.m114159g().m114169j(contactProfile.f42434r);
                boolean m114574m = C21937w.f108027a.m114574m(contactProfile.f42434r);
                if (m114169j || m114574m) {
                    m58485dM().f138536s.setVisibility(0);
                    m58485dM().f138538u.setVisibility(0);
                }
                ListItemSetting listItemSetting = m58485dM().f138539v;
                if (m114169j && m114574m) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                listItemSetting.setCheckBox(z11);
                m58485dM().f138536s.setCheckBox(m114169j);
                m58485dM().f138538u.setCheckBox(m114574m);
            }
            if (this.f56188k1) {
                m58485dM().f138537t.setCheckBox(false);
                m58485dM().f138535r.setCheckBox(false);
                m58485dM().f138539v.setCheckBox(false);
                m58485dM().f138536s.setCheckBox(false);
                m58485dM().f138538u.setCheckBox(false);
            }
            m58466YL();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public static final void m58480vM(BlockViewBottomSheet blockViewBottomSheet) {
        AbstractC19074t.m100208f(blockViewBottomSheet, "this$0");
        blockViewBottomSheet.m58479pM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        try {
            Bundle m92642L3 = m92642L3();
            boolean z11 = false;
            if (m92642L3 != null) {
                z11 = m92642L3.getBoolean("EXTRA_BOOL_UNSELECT", false);
            }
            this.f56188k1 = z11;
            Bundle m92642L32 = m92642L3();
            Integer num = null;
            String str2 = "";
            if (m92642L32 != null) {
                str = m92642L32.getString("EXTRA_CONTACT_PROFILE", "");
            } else {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
            if (str2.length() != 0) {
                this.f56180c1 = new ContactProfile(new JSONObject(str2));
            }
            Bundle m92642L33 = m92642L3();
            if (m92642L33 != null) {
                num = Integer.valueOf(m92642L33.getInt("EXTRA_ENTRY_SCREEN"));
            }
            if (num != null) {
                this.f56183f1 = num.intValue();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        NestedScrollView nestedScrollView = m58485dM().f138540w;
        AbstractC19074t.m100207e(nestedScrollView, "scrollView");
        return nestedScrollView;
    }

    /* renamed from: UL */
    public final void m58481UL() {
        ArrayList m131500h;
        this.f56186i1 = true;
        m58470cM();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11159a());
        ContactProfile contactProfile = this.f56180c1;
        AbstractC19074t.m100205c(contactProfile);
        m131500h = AbstractC25368s.m131500h(contactProfile.f42434r);
        c0766k.mo1739t3(m131500h, m58487fM());
    }

    /* renamed from: VL */
    public final void m58482VL() {
        ArrayList m131500h;
        m58470cM();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11160b());
        ContactProfile contactProfile = this.f56180c1;
        AbstractC19074t.m100205c(contactProfile);
        m131500h = AbstractC25368s.m131500h(contactProfile.f42434r);
        c0766k.mo1481M3(m131500h.toString(), new TrackingSource(m58487fM()));
    }

    /* renamed from: WL */
    public final void m58483WL(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        this.f56184g1 = true;
        m58470cM();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11161c(contactProfile));
        c0766k.mo1479L9(contactProfile.f42434r, m58487fM());
    }

    /* renamed from: XL */
    public final void m58484XL() {
        ArrayList m131500h;
        m58470cM();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11162d());
        ContactProfile contactProfile = this.f56180c1;
        AbstractC19074t.m100205c(contactProfile);
        m131500h = AbstractC25368s.m131500h(contactProfile.f42434r);
        c0766k.mo1400C3(m131500h.toString(), new TrackingSource(m58487fM()));
    }

    /* renamed from: dM */
    public final C29900l0 m58485dM() {
        C29900l0 c29900l0 = this.f56179b1;
        if (c29900l0 != null) {
            return c29900l0;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    /* renamed from: eM */
    public final void m58486eM() {
        String str;
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11163e());
        ContactProfile contactProfile = this.f56180c1;
        if (contactProfile != null) {
            str = contactProfile.f42434r;
        } else {
            str = null;
        }
        c0766k.mo1522R4(str, m58487fM());
    }

    /* renamed from: fM */
    public final int m58487fM() {
        int i11 = this.f56183f1;
        if (i11 == BottomSheetBlockView.EnumC11169b.f56202q.m58496c()) {
            return 19;
        }
        if (i11 == BottomSheetBlockView.EnumC11169b.f56203r.m58496c()) {
            return 3;
        }
        if (i11 == BottomSheetBlockView.EnumC11169b.f56204s.m58496c()) {
            return 9;
        }
        if (i11 == BottomSheetBlockView.EnumC11169b.f56205t.m58496c()) {
            return 12;
        }
        if (i11 == BottomSheetBlockView.EnumC11169b.f56206u.m58496c()) {
            return 18;
        }
        return 10;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29900l0 m148182c = C29900l0.m148182c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148182c, "inflate(...)");
        m58492tM(m148182c);
        m90525tL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m58471gM();
    }

    /* renamed from: oM */
    public final void m58488oM(View view, boolean z11) {
        AbstractC19074t.m100208f(view, "item");
        boolean z12 = false;
        this.f56188k1 = false;
        if (AbstractC19074t.m100204b(view, m58485dM().f138537t)) {
            m58466YL();
            return;
        }
        if (AbstractC19074t.m100204b(view, m58485dM().f138535r)) {
            m58466YL();
            return;
        }
        if (AbstractC19074t.m100204b(view, m58485dM().f138539v)) {
            m58485dM().f138536s.setVisibility(0);
            m58485dM().f138538u.setVisibility(0);
            if (z11) {
                m58485dM().f138536s.setCheckBox(true);
                m58485dM().f138538u.setCheckBox(true);
            } else {
                m58485dM().f138536s.setCheckBox(false);
                m58485dM().f138538u.setCheckBox(false);
            }
            m58466YL();
            return;
        }
        if (AbstractC19074t.m100204b(view, m58485dM().f138536s)) {
            if (z11) {
                ListItemSetting listItemSetting = m58485dM().f138539v;
                CheckBox checkBox = m58485dM().f138538u.getCheckBox();
                if (checkBox != null && checkBox.isChecked()) {
                    z12 = true;
                }
                listItemSetting.setCheckBox(z12);
            } else {
                m58485dM().f138539v.setCheckBox(false);
            }
            m58466YL();
            return;
        }
        if (AbstractC19074t.m100204b(view, m58485dM().f138538u)) {
            if (z11) {
                ListItemSetting listItemSetting2 = m58485dM().f138539v;
                CheckBox checkBox2 = m58485dM().f138536s.getCheckBox();
                if (checkBox2 != null && checkBox2.isChecked()) {
                    z12 = true;
                }
                listItemSetting2.setCheckBox(z12);
            } else {
                m58485dM().f138539v.setCheckBox(false);
            }
            m58466YL();
        }
    }

    /* renamed from: qM */
    public final void m58489qM() {
        String str;
        this.f56187j1 = true;
        m58470cM();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11164f());
        ContactProfile contactProfile = this.f56180c1;
        if (contactProfile != null) {
            str = contactProfile.f42434r;
        } else {
            str = null;
        }
        c0766k.mo1509P7(str, m58487fM());
    }

    /* renamed from: rM */
    public final void m58490rM() {
        String str;
        m58470cM();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11165g());
        ContactProfile contactProfile = this.f56180c1;
        if (contactProfile != null) {
            str = contactProfile.f42434r;
        } else {
            str = null;
        }
        c0766k.mo1466K4(str, new TrackingSource(m58487fM()));
    }

    /* renamed from: sM */
    public final void m58491sM() {
        String str;
        m58470cM();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11166h());
        ContactProfile contactProfile = this.f56180c1;
        if (contactProfile != null) {
            str = contactProfile.f42434r;
        } else {
            str = null;
        }
        c0766k.mo1600ab(str, new TrackingSource(m58487fM()));
    }

    /* renamed from: tM */
    public final void m58492tM(C29900l0 c29900l0) {
        AbstractC19074t.m100208f(c29900l0, "<set-?>");
        this.f56179b1 = c29900l0;
    }

    /* renamed from: uM */
    public final void m58493uM(HashSet hashSet) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        AbstractC19074t.m100208f(hashSet, "hashSetStatus");
        boolean contains = hashSet.contains(1);
        C31853b5 m114312J = C21927m.m114302u().m114312J();
        ContactProfile contactProfile = this.f56180c1;
        String str7 = null;
        if (contactProfile != null) {
            str = contactProfile.f42434r;
        } else {
            str = null;
        }
        if (contains != m114312J.m153137g(str)) {
            AbstractC21935u.m114531U(hashSet.contains(1), this.f56180c1);
        }
        boolean contains2 = hashSet.contains(2);
        C21914b c21914b = C21914b.f107731a;
        ContactProfile contactProfile2 = this.f56180c1;
        if (contactProfile2 != null) {
            str2 = contactProfile2.f42434r;
        } else {
            str2 = null;
        }
        if (contains2 != c21914b.m114200k(str2)) {
            if (hashSet.contains(2)) {
                c21914b.m114195e(this.f56180c1);
            } else {
                ContactProfile contactProfile3 = this.f56180c1;
                if (contactProfile3 != null) {
                    str6 = contactProfile3.f42434r;
                } else {
                    str6 = null;
                }
                c21914b.m114203n(str6);
            }
        }
        boolean contains3 = hashSet.contains(5);
        C21912a m114159g = C21912a.m114159g();
        ContactProfile contactProfile4 = this.f56180c1;
        if (contactProfile4 != null) {
            str3 = contactProfile4.f42434r;
        } else {
            str3 = null;
        }
        if (contains3 != m114159g.m114169j(str3)) {
            if (hashSet.contains(5)) {
                C21912a.m114159g().m114162b(this.f56180c1);
            } else {
                C21912a m114159g2 = C21912a.m114159g();
                ContactProfile contactProfile5 = this.f56180c1;
                if (contactProfile5 != null) {
                    str5 = contactProfile5.f42434r;
                } else {
                    str5 = null;
                }
                m114159g2.m114173o(str5);
            }
        }
        boolean contains4 = hashSet.contains(7);
        C21937w c21937w = C21937w.f108027a;
        ContactProfile contactProfile6 = this.f56180c1;
        if (contactProfile6 != null) {
            str4 = contactProfile6.f42434r;
        } else {
            str4 = null;
        }
        if (contains4 != c21937w.m114574m(str4)) {
            if (hashSet.contains(7)) {
                c21937w.m114568f(this.f56180c1);
            } else {
                ContactProfile contactProfile7 = this.f56180c1;
                if (contactProfile7 != null) {
                    str7 = contactProfile7.f42434r;
                }
                c21937w.m114576o(str7);
            }
        }
        mo70710wy(new Runnable() { // from class: e50.h
            @Override // java.lang.Runnable
            public final void run() {
                BlockViewBottomSheet.m58480vM(BlockViewBottomSheet.this);
            }
        });
    }

    /* renamed from: wM */
    public final void m58494wM(ContactProfile contactProfile) {
        AbstractC19074t.m100208f(contactProfile, "friend");
        this.f56185h1 = true;
        m58470cM();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new C11167i(contactProfile));
        c0766k.mo1448Ha(contactProfile.f42434r, m58487fM());
    }
}
