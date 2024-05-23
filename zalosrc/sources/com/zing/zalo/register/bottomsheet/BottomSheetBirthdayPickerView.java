package com.zing.zalo.register.bottomsheet;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import androidx.core.widget.NestedScrollView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.register.bottomsheet.BottomSheetBirthdayPickerView;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zview.ZaloView;
import cz.C17670w0;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import java.util.Calendar;
import java.util.List;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import p649xl.C29882k0;
import qm0.AbstractC25366r;
import qm0.AbstractC25368s;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class BottomSheetBirthdayPickerView extends BottomSheet {

    /* renamed from: b1 */
    private C29882k0 f49357b1;

    /* renamed from: c1 */
    private final Calendar f49358c1;

    /* renamed from: d1 */
    private int f49359d1;

    /* renamed from: e1 */
    private int f49360e1;

    /* renamed from: f1 */
    private int f49361f1;

    /* renamed from: g1 */
    private final int f49362g1;

    /* renamed from: h1 */
    private final int f49363h1;

    /* renamed from: i1 */
    private final int f49364i1;

    /* renamed from: j1 */
    private final int f49365j1;

    /* renamed from: k1 */
    private final int f49366k1;

    /* renamed from: l1 */
    private final int f49367l1;

    /* renamed from: m1 */
    private final List f49368m1;

    /* renamed from: n1 */
    private final List f49369n1;

    /* renamed from: o1 */
    private final List f49370o1;

    public BottomSheetBirthdayPickerView() {
        List m131505m;
        List m131505m2;
        List m131496e;
        Calendar calendar = Calendar.getInstance();
        this.f49358c1 = calendar;
        this.f49359d1 = calendar.get(1);
        this.f49360e1 = calendar.get(2) + 1;
        this.f49361f1 = calendar.get(5);
        int i11 = this.f49359d1;
        this.f49362g1 = i11;
        this.f49363h1 = i11 - 100;
        this.f49364i1 = 12;
        this.f49365j1 = 1;
        this.f49366k1 = 31;
        this.f49367l1 = 1;
        m131505m = AbstractC25368s.m131505m(1, 3, 5, 7, 8, 10, 12);
        this.f49368m1 = m131505m;
        m131505m2 = AbstractC25368s.m131505m(4, 6, 9, 11);
        this.f49369n1 = m131505m2;
        m131496e = AbstractC25366r.m131496e(2);
        this.f49370o1 = m131496e;
    }

    /* renamed from: QL */
    private final int m50017QL(int i11) {
        if (this.f49368m1.contains(Integer.valueOf(i11))) {
            return this.f49366k1;
        }
        if (this.f49369n1.contains(Integer.valueOf(i11))) {
            return this.f49366k1 - 1;
        }
        if (this.f49370o1.contains(Integer.valueOf(i11))) {
            if (m50031eM(this.f49359d1)) {
                return this.f49366k1 - 2;
            }
            return this.f49366k1 - 3;
        }
        return this.f49366k1;
    }

    /* renamed from: RL */
    private final void m50018RL() {
        C29882k0 c29882k0 = this.f49357b1;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        NumberPicker numberPicker = c29882k0.f138431s;
        AbstractC19074t.m100205c(numberPicker);
        m50032fM(numberPicker, this.f49360e1);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: dz.d

            /* renamed from: b */
            public final /* synthetic */ NumberPicker f91779b;

            public /* synthetic */ C18135d(NumberPicker numberPicker2) {
                r2 = numberPicker2;
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker2, int i11, int i12) {
                BottomSheetBirthdayPickerView.m50019SL(BottomSheetBirthdayPickerView.this, r2, numberPicker2, i11, i12);
            }
        });
        numberPicker2.setValue(this.f49361f1);
        numberPicker2.setDescendantFocusability(393216);
    }

    /* renamed from: SL */
    public static final void m50019SL(BottomSheetBirthdayPickerView bottomSheetBirthdayPickerView, NumberPicker numberPicker, NumberPicker numberPicker2, int i11, int i12) {
        AbstractC19074t.m100208f(bottomSheetBirthdayPickerView, "this$0");
        AbstractC19074t.m100208f(numberPicker, "$this_apply");
        bottomSheetBirthdayPickerView.f49361f1 = i12;
        bottomSheetBirthdayPickerView.mo70710wy(new Runnable() { // from class: dz.h

            /* renamed from: q */
            public final /* synthetic */ NumberPicker f91786q;

            /* renamed from: r */
            public final /* synthetic */ int f91787r;

            /* renamed from: s */
            public final /* synthetic */ int f91788s;

            public /* synthetic */ RunnableC18139h(NumberPicker numberPicker3, int i112, int i122) {
                r2 = numberPicker3;
                r3 = i112;
                r4 = i122;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BottomSheetBirthdayPickerView.m50020TL(BottomSheetBirthdayPickerView.this, r2, r3, r4);
            }
        });
    }

    /* renamed from: TL */
    public static final void m50020TL(BottomSheetBirthdayPickerView bottomSheetBirthdayPickerView, NumberPicker numberPicker, int i11, int i12) {
        int i13;
        int i14;
        AbstractC19074t.m100208f(bottomSheetBirthdayPickerView, "this$0");
        AbstractC19074t.m100208f(numberPicker, "$this_apply");
        int i15 = bottomSheetBirthdayPickerView.f49361f1;
        if (i15 <= bottomSheetBirthdayPickerView.f49367l1 + 2) {
            int i16 = bottomSheetBirthdayPickerView.f49360e1;
            if (i16 == 1) {
                bottomSheetBirthdayPickerView.m50032fM(numberPicker, bottomSheetBirthdayPickerView.f49364i1);
            } else {
                bottomSheetBirthdayPickerView.m50032fM(numberPicker, i16 - 1);
            }
        } else if (i15 >= bottomSheetBirthdayPickerView.m50017QL(bottomSheetBirthdayPickerView.f49360e1) - 2) {
            int i17 = bottomSheetBirthdayPickerView.f49360e1;
            int i18 = bottomSheetBirthdayPickerView.f49364i1;
            if (i17 == i18 && bottomSheetBirthdayPickerView.f49359d1 == bottomSheetBirthdayPickerView.f49362g1) {
                bottomSheetBirthdayPickerView.m50032fM(numberPicker, i17);
            } else if (i17 == i18) {
                bottomSheetBirthdayPickerView.m50032fM(numberPicker, bottomSheetBirthdayPickerView.f49365j1);
            } else {
                bottomSheetBirthdayPickerView.m50032fM(numberPicker, i17 + 1);
            }
        } else {
            bottomSheetBirthdayPickerView.m50032fM(numberPicker, bottomSheetBirthdayPickerView.f49360e1);
        }
        C29882k0 c29882k0 = null;
        if (i11 == 1 && i12 != 2) {
            C29882k0 c29882k02 = bottomSheetBirthdayPickerView.f49357b1;
            if (c29882k02 == null) {
                AbstractC19074t.m100223u("binding");
                c29882k02 = null;
            }
            NumberPicker numberPicker2 = c29882k02.f138432t;
            int i19 = bottomSheetBirthdayPickerView.f49360e1;
            if (i19 != 1) {
                i14 = i19 - 1;
                bottomSheetBirthdayPickerView.f49360e1 = i14;
            } else {
                bottomSheetBirthdayPickerView.f49359d1--;
                C29882k0 c29882k03 = bottomSheetBirthdayPickerView.f49357b1;
                if (c29882k03 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29882k03 = null;
                }
                c29882k03.f138436x.setValue(bottomSheetBirthdayPickerView.f49359d1);
                i14 = bottomSheetBirthdayPickerView.f49364i1;
                bottomSheetBirthdayPickerView.f49360e1 = i14;
            }
            numberPicker2.setValue(i14);
            C29882k0 c29882k04 = bottomSheetBirthdayPickerView.f49357b1;
            if (c29882k04 == null) {
                AbstractC19074t.m100223u("binding");
                c29882k04 = null;
            }
            NumberPicker numberPicker3 = c29882k04.f138431s;
            AbstractC19074t.m100207e(numberPicker3, "dayPickerColumn");
            bottomSheetBirthdayPickerView.m50032fM(numberPicker3, bottomSheetBirthdayPickerView.f49360e1);
            bottomSheetBirthdayPickerView.f49361f1 = i12;
            numberPicker.setValue(i12);
        }
        if (i12 == 1 && i11 != 2) {
            C29882k0 c29882k05 = bottomSheetBirthdayPickerView.f49357b1;
            if (c29882k05 == null) {
                AbstractC19074t.m100223u("binding");
                c29882k05 = null;
            }
            NumberPicker numberPicker4 = c29882k05.f138432t;
            int i21 = bottomSheetBirthdayPickerView.f49360e1;
            if (i21 != 12) {
                i13 = i21 + 1;
                bottomSheetBirthdayPickerView.f49360e1 = i13;
            } else {
                int i22 = bottomSheetBirthdayPickerView.f49359d1;
                if (i22 != bottomSheetBirthdayPickerView.f49362g1) {
                    bottomSheetBirthdayPickerView.f49359d1 = i22 + 1;
                    C29882k0 c29882k06 = bottomSheetBirthdayPickerView.f49357b1;
                    if (c29882k06 == null) {
                        AbstractC19074t.m100223u("binding");
                        c29882k06 = null;
                    }
                    c29882k06.f138436x.setValue(bottomSheetBirthdayPickerView.f49359d1);
                }
                i13 = bottomSheetBirthdayPickerView.f49365j1;
                bottomSheetBirthdayPickerView.f49360e1 = i13;
            }
            numberPicker4.setValue(i13);
            C29882k0 c29882k07 = bottomSheetBirthdayPickerView.f49357b1;
            if (c29882k07 == null) {
                AbstractC19074t.m100223u("binding");
                c29882k07 = null;
            }
            NumberPicker numberPicker5 = c29882k07.f138431s;
            AbstractC19074t.m100207e(numberPicker5, "dayPickerColumn");
            bottomSheetBirthdayPickerView.m50032fM(numberPicker5, bottomSheetBirthdayPickerView.f49360e1);
            bottomSheetBirthdayPickerView.f49361f1 = i12;
            numberPicker.setValue(i12);
        }
        if (bottomSheetBirthdayPickerView.m50030dM()) {
            bottomSheetBirthdayPickerView.f49359d1--;
            C29882k0 c29882k08 = bottomSheetBirthdayPickerView.f49357b1;
            if (c29882k08 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29882k0 = c29882k08;
            }
            c29882k0.f138436x.setValue(bottomSheetBirthdayPickerView.f49359d1);
        }
    }

    /* renamed from: UL */
    private final void m50021UL() {
        C29882k0 c29882k0 = this.f49357b1;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        NumberPicker numberPicker = c29882k0.f138432t;
        AbstractC19074t.m100205c(numberPicker);
        m50033gM(numberPicker);
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: dz.c
            public /* synthetic */ C18134c() {
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker2, int i11, int i12) {
                BottomSheetBirthdayPickerView.m50022VL(BottomSheetBirthdayPickerView.this, numberPicker2, i11, i12);
            }
        });
        numberPicker.setValue(this.f49360e1);
        numberPicker.setDescendantFocusability(393216);
    }

    /* renamed from: VL */
    public static final void m50022VL(BottomSheetBirthdayPickerView bottomSheetBirthdayPickerView, NumberPicker numberPicker, int i11, int i12) {
        AbstractC19074t.m100208f(bottomSheetBirthdayPickerView, "this$0");
        AbstractC19444a.m101697e(new Runnable() { // from class: dz.e

            /* renamed from: q */
            public final /* synthetic */ int f91781q;

            /* renamed from: r */
            public final /* synthetic */ int f91782r;

            public /* synthetic */ RunnableC18136e(int i122, int i112) {
                r2 = i122;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BottomSheetBirthdayPickerView.m50023WL(BottomSheetBirthdayPickerView.this, r2, r3);
            }
        });
    }

    /* renamed from: WL */
    public static final void m50023WL(BottomSheetBirthdayPickerView bottomSheetBirthdayPickerView, int i11, int i12) {
        AbstractC19074t.m100208f(bottomSheetBirthdayPickerView, "this$0");
        bottomSheetBirthdayPickerView.f49360e1 = i11;
        C29882k0 c29882k0 = bottomSheetBirthdayPickerView.f49357b1;
        C29882k0 c29882k02 = null;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        NumberPicker numberPicker = c29882k0.f138431s;
        AbstractC19074t.m100207e(numberPicker, "dayPickerColumn");
        bottomSheetBirthdayPickerView.m50032fM(numberPicker, bottomSheetBirthdayPickerView.f49360e1);
        if (i12 == 1 && i11 != 2) {
            int i13 = bottomSheetBirthdayPickerView.f49359d1;
            if (i13 != bottomSheetBirthdayPickerView.f49363h1) {
                bottomSheetBirthdayPickerView.f49359d1 = i13 - 1;
                C29882k0 c29882k03 = bottomSheetBirthdayPickerView.f49357b1;
                if (c29882k03 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29882k03 = null;
                }
                c29882k03.f138436x.setValue(bottomSheetBirthdayPickerView.f49359d1);
            }
            C29882k0 c29882k04 = bottomSheetBirthdayPickerView.f49357b1;
            if (c29882k04 == null) {
                AbstractC19074t.m100223u("binding");
                c29882k04 = null;
            }
            NumberPicker numberPicker2 = c29882k04.f138431s;
            AbstractC19074t.m100207e(numberPicker2, "dayPickerColumn");
            bottomSheetBirthdayPickerView.m50032fM(numberPicker2, bottomSheetBirthdayPickerView.f49360e1);
        }
        if (i11 == 1 && i12 != 2) {
            int i14 = bottomSheetBirthdayPickerView.f49359d1;
            if (i14 != bottomSheetBirthdayPickerView.f49362g1) {
                bottomSheetBirthdayPickerView.f49359d1 = i14 + 1;
                C29882k0 c29882k05 = bottomSheetBirthdayPickerView.f49357b1;
                if (c29882k05 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29882k05 = null;
                }
                c29882k05.f138436x.setValue(bottomSheetBirthdayPickerView.f49359d1);
            }
            C29882k0 c29882k06 = bottomSheetBirthdayPickerView.f49357b1;
            if (c29882k06 == null) {
                AbstractC19074t.m100223u("binding");
                c29882k06 = null;
            }
            NumberPicker numberPicker3 = c29882k06.f138431s;
            AbstractC19074t.m100207e(numberPicker3, "dayPickerColumn");
            bottomSheetBirthdayPickerView.m50032fM(numberPicker3, bottomSheetBirthdayPickerView.f49360e1);
        }
        if (bottomSheetBirthdayPickerView.m50030dM()) {
            bottomSheetBirthdayPickerView.f49359d1--;
            C29882k0 c29882k07 = bottomSheetBirthdayPickerView.f49357b1;
            if (c29882k07 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29882k02 = c29882k07;
            }
            c29882k02.f138436x.setValue(bottomSheetBirthdayPickerView.f49359d1);
        }
    }

    /* renamed from: XL */
    private final void m50024XL() {
        C29882k0 c29882k0 = this.f49357b1;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        NumberPicker numberPicker = c29882k0.f138436x;
        m50034hM();
        numberPicker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() { // from class: dz.b
            public /* synthetic */ C18133b() {
            }

            @Override // android.widget.NumberPicker.OnValueChangeListener
            public final void onValueChange(NumberPicker numberPicker2, int i11, int i12) {
                BottomSheetBirthdayPickerView.m50025YL(BottomSheetBirthdayPickerView.this, numberPicker2, i11, i12);
            }
        });
        numberPicker.setValue(this.f49359d1);
        numberPicker.setDescendantFocusability(393216);
        numberPicker.setWrapSelectorWheel(false);
    }

    /* renamed from: YL */
    public static final void m50025YL(BottomSheetBirthdayPickerView bottomSheetBirthdayPickerView, NumberPicker numberPicker, int i11, int i12) {
        AbstractC19074t.m100208f(bottomSheetBirthdayPickerView, "this$0");
        bottomSheetBirthdayPickerView.f49359d1 = i12;
        C29882k0 c29882k0 = bottomSheetBirthdayPickerView.f49357b1;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        bottomSheetBirthdayPickerView.f49361f1 = c29882k0.f138431s.getValue();
        AbstractC19444a.m101697e(new Runnable() { // from class: dz.f
            public /* synthetic */ RunnableC18137f() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BottomSheetBirthdayPickerView.m50026ZL(BottomSheetBirthdayPickerView.this);
            }
        });
        if (bottomSheetBirthdayPickerView.m50030dM()) {
            AbstractC19444a.m101694b(new Runnable() { // from class: dz.g
                public /* synthetic */ RunnableC18138g() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    BottomSheetBirthdayPickerView.m50027aM(BottomSheetBirthdayPickerView.this);
                }
            }, 100L);
        }
    }

    /* renamed from: ZL */
    public static final void m50026ZL(BottomSheetBirthdayPickerView bottomSheetBirthdayPickerView) {
        AbstractC19074t.m100208f(bottomSheetBirthdayPickerView, "this$0");
        C29882k0 c29882k0 = bottomSheetBirthdayPickerView.f49357b1;
        C29882k0 c29882k02 = null;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        NumberPicker numberPicker = c29882k0.f138432t;
        AbstractC19074t.m100207e(numberPicker, "monthPickerColumn");
        bottomSheetBirthdayPickerView.m50033gM(numberPicker);
        C29882k0 c29882k03 = bottomSheetBirthdayPickerView.f49357b1;
        if (c29882k03 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29882k02 = c29882k03;
        }
        NumberPicker numberPicker2 = c29882k02.f138431s;
        AbstractC19074t.m100207e(numberPicker2, "dayPickerColumn");
        bottomSheetBirthdayPickerView.m50032fM(numberPicker2, bottomSheetBirthdayPickerView.f49360e1);
    }

    /* renamed from: aM */
    public static final void m50027aM(BottomSheetBirthdayPickerView bottomSheetBirthdayPickerView) {
        AbstractC19074t.m100208f(bottomSheetBirthdayPickerView, "this$0");
        bottomSheetBirthdayPickerView.f49359d1--;
        C29882k0 c29882k0 = bottomSheetBirthdayPickerView.f49357b1;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        c29882k0.f138436x.setValue(bottomSheetBirthdayPickerView.f49359d1);
    }

    /* renamed from: bM */
    private final void m50028bM() {
        C29882k0 c29882k0 = this.f49357b1;
        C29882k0 c29882k02 = null;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        c29882k0.f138434v.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_register_enter_extra_profile_select_birthday_rule, Integer.valueOf(C17670w0.f89662a.m93650b())));
        C29882k0 c29882k03 = this.f49357b1;
        if (c29882k03 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k03 = null;
        }
        RobotoTextView robotoTextView = c29882k03.f138434v;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        robotoTextView.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(m92689tK, AbstractC23322a.zds_ic_info_circle_solid_16, AbstractC2807a.input_field_text_secondary), (Drawable) null, (Drawable) null, (Drawable) null);
        C29882k0 c29882k04 = this.f49357b1;
        if (c29882k04 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29882k02 = c29882k04;
        }
        c29882k02.f138430r.setOnClickListener(new View.OnClickListener() { // from class: dz.a
            public /* synthetic */ ViewOnClickListenerC18132a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BottomSheetBirthdayPickerView.m50029cM(BottomSheetBirthdayPickerView.this, view);
            }
        });
        m50018RL();
        m50021UL();
        m50024XL();
    }

    /* renamed from: cM */
    public static final void m50029cM(BottomSheetBirthdayPickerView bottomSheetBirthdayPickerView, View view) {
        AbstractC19074t.m100208f(bottomSheetBirthdayPickerView, "this$0");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_SELECTED_DAY", bottomSheetBirthdayPickerView.f49361f1);
        intent.putExtra("EXTRA_SELECTED_MONTH", bottomSheetBirthdayPickerView.f49360e1);
        intent.putExtra("EXTRA_SELECTED_YEAR", bottomSheetBirthdayPickerView.f49359d1);
        bottomSheetBirthdayPickerView.mo50035CK(-1, intent);
        bottomSheetBirthdayPickerView.close();
    }

    /* renamed from: dM */
    private final boolean m50030dM() {
        if (this.f49359d1 == this.f49358c1.get(1)) {
            if (this.f49360e1 > this.f49358c1.get(2) + 1) {
                return true;
            }
            if (this.f49360e1 <= this.f49358c1.get(2) + 1 && this.f49361f1 > this.f49358c1.get(5)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: eM */
    private final boolean m50031eM(int i11) {
        if (i11 % 4 != 0) {
            return false;
        }
        if (i11 % 100 == 0 && i11 % 400 != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: fM */
    private final void m50032fM(NumberPicker numberPicker, int i11) {
        numberPicker.setMinValue(this.f49367l1);
        numberPicker.setMaxValue(m50017QL(i11));
    }

    /* renamed from: gM */
    private final void m50033gM(NumberPicker numberPicker) {
        numberPicker.setMinValue(this.f49365j1);
        numberPicker.setMaxValue(this.f49364i1);
    }

    /* renamed from: hM */
    private final void m50034hM() {
        C29882k0 c29882k0 = this.f49357b1;
        C29882k0 c29882k02 = null;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        c29882k0.f138436x.setMaxValue(this.f49362g1);
        C29882k0 c29882k03 = this.f49357b1;
        if (c29882k03 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29882k02 = c29882k03;
        }
        c29882k02.f138436x.setMinValue(this.f49363h1);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f49361f1 = m92642L3.getInt("EXTRA_SELECTED_DAY");
            this.f49360e1 = m92642L3.getInt("EXTRA_SELECTED_MONTH");
            this.f49359d1 = m92642L3.getInt("EXTRA_SELECTED_YEAR");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: CK */
    public void mo50035CK(int i11, Intent intent) {
        ZaloView m92650VI;
        super.mo50035CK(i11, intent);
        if ((m92650VI() instanceof RegisterLayoutBottomSheet) && (m92650VI = m92650VI()) != null) {
            m92650VI.mo50035CK(i11, intent);
        }
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29882k0 c29882k0 = this.f49357b1;
        if (c29882k0 == null) {
            AbstractC19074t.m100223u("binding");
            c29882k0 = null;
        }
        NestedScrollView nestedScrollView = c29882k0.f138433u;
        AbstractC19074t.m100207e(nestedScrollView, "scrollView");
        return nestedScrollView;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29882k0 m148144c = C29882k0.m148144c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148144c, "inflate(...)");
        this.f49357b1 = m148144c;
        m90525tL(true);
        m90528wL(true);
        m90533zL(EnumC17017m.HUG_CONTENT);
        m50028bM();
    }
}
