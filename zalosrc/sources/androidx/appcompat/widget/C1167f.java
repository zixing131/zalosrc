package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C1181j1;
import androidx.core.graphics.AbstractC1409d;
import p175g0.AbstractC19178a;
import p175g0.AbstractC19180c;
import p175g0.AbstractC19182e;
import p193h0.AbstractC19694b;

/* renamed from: androidx.appcompat.widget.f */
/* loaded from: classes.dex */
public final class C1167f {

    /* renamed from: b */
    private static final PorterDuff.Mode f4627b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C1167f f4628c;

    /* renamed from: a */
    private C1181j1 f4629a;

    /* renamed from: androidx.appcompat.widget.f$a */
    /* loaded from: classes.dex */
    public class a implements C1181j1.e {

        /* renamed from: a */
        private final int[] f4630a = {AbstractC19182e.abc_textfield_search_default_mtrl_alpha, AbstractC19182e.abc_textfield_default_mtrl_alpha, AbstractC19182e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f4631b = {AbstractC19182e.abc_ic_commit_search_api_mtrl_alpha, AbstractC19182e.abc_seekbar_tick_mark_material, AbstractC19182e.abc_ic_menu_share_mtrl_alpha, AbstractC19182e.abc_ic_menu_copy_mtrl_am_alpha, AbstractC19182e.abc_ic_menu_cut_mtrl_alpha, AbstractC19182e.abc_ic_menu_selectall_mtrl_alpha, AbstractC19182e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f4632c = {AbstractC19182e.abc_textfield_activated_mtrl_alpha, AbstractC19182e.abc_textfield_search_activated_mtrl_alpha, AbstractC19182e.abc_cab_background_top_mtrl_alpha, AbstractC19182e.abc_text_cursor_material, AbstractC19182e.abc_text_select_handle_left_mtrl_dark, AbstractC19182e.abc_text_select_handle_middle_mtrl_dark, AbstractC19182e.abc_text_select_handle_right_mtrl_dark, AbstractC19182e.abc_text_select_handle_left_mtrl_light, AbstractC19182e.abc_text_select_handle_middle_mtrl_light, AbstractC19182e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f4633d = {AbstractC19182e.abc_popup_background_mtrl_mult, AbstractC19182e.abc_cab_background_internal_bg, AbstractC19182e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f4634e = {AbstractC19182e.abc_tab_indicator_material, AbstractC19182e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f4635f = {AbstractC19182e.abc_btn_check_material, AbstractC19182e.abc_btn_radio_material, AbstractC19182e.abc_btn_check_material_anim, AbstractC19182e.abc_btn_radio_material_anim};

        a() {
        }

        /* renamed from: f */
        private boolean m5536f(int[] iArr, int i11) {
            for (int i12 : iArr) {
                if (i12 == i11) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: g */
        private ColorStateList m5537g(Context context) {
            return m5538h(context, 0);
        }

        /* renamed from: h */
        private ColorStateList m5538h(Context context, int i11) {
            int m5680c = AbstractC1199p1.m5680c(context, AbstractC19178a.colorControlHighlight);
            return new ColorStateList(new int[][]{AbstractC1199p1.f4702b, AbstractC1199p1.f4705e, AbstractC1199p1.f4703c, AbstractC1199p1.f4709i}, new int[]{AbstractC1199p1.m5679b(context, AbstractC19178a.colorButtonNormal), AbstractC1409d.m7142k(m5680c, i11), AbstractC1409d.m7142k(m5680c, i11), i11});
        }

        /* renamed from: i */
        private ColorStateList m5539i(Context context) {
            return m5538h(context, AbstractC1199p1.m5680c(context, AbstractC19178a.colorAccent));
        }

        /* renamed from: j */
        private ColorStateList m5540j(Context context) {
            return m5538h(context, AbstractC1199p1.m5680c(context, AbstractC19178a.colorButtonNormal));
        }

        /* renamed from: k */
        private ColorStateList m5541k(Context context) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList m5682e = AbstractC1199p1.m5682e(context, AbstractC19178a.colorSwitchThumbNormal);
            if (m5682e != null && m5682e.isStateful()) {
                int[] iArr3 = AbstractC1199p1.f4702b;
                iArr[0] = iArr3;
                iArr2[0] = m5682e.getColorForState(iArr3, 0);
                iArr[1] = AbstractC1199p1.f4706f;
                iArr2[1] = AbstractC1199p1.m5680c(context, AbstractC19178a.colorControlActivated);
                iArr[2] = AbstractC1199p1.f4709i;
                iArr2[2] = m5682e.getDefaultColor();
            } else {
                iArr[0] = AbstractC1199p1.f4702b;
                iArr2[0] = AbstractC1199p1.m5679b(context, AbstractC19178a.colorSwitchThumbNormal);
                iArr[1] = AbstractC1199p1.f4706f;
                iArr2[1] = AbstractC1199p1.m5680c(context, AbstractC19178a.colorControlActivated);
                iArr[2] = AbstractC1199p1.f4709i;
                iArr2[2] = AbstractC1199p1.m5680c(context, AbstractC19178a.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: l */
        private void m5542l(Drawable drawable, int i11, PorterDuff.Mode mode) {
            if (AbstractC1225y0.m5769a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C1167f.f4627b;
            }
            drawable.setColorFilter(C1167f.m5529e(i11, mode));
        }

        @Override // androidx.appcompat.widget.C1181j1.e
        /* renamed from: a */
        public Drawable mo5543a(C1181j1 c1181j1, Context context, int i11) {
            if (i11 == AbstractC19182e.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{c1181j1.m5593j(context, AbstractC19182e.abc_cab_background_internal_bg), c1181j1.m5593j(context, AbstractC19182e.abc_cab_background_top_mtrl_alpha)});
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C1181j1.e
        /* renamed from: b */
        public ColorStateList mo5544b(Context context, int i11) {
            if (i11 == AbstractC19182e.abc_edit_text_material) {
                return AbstractC19694b.m103335c(context, AbstractC19180c.abc_tint_edittext);
            }
            if (i11 == AbstractC19182e.abc_switch_track_mtrl_alpha) {
                return AbstractC19694b.m103335c(context, AbstractC19180c.abc_tint_switch_track);
            }
            if (i11 == AbstractC19182e.abc_switch_thumb_material) {
                return m5541k(context);
            }
            if (i11 == AbstractC19182e.abc_btn_default_mtrl_shape) {
                return m5540j(context);
            }
            if (i11 == AbstractC19182e.abc_btn_borderless_material) {
                return m5537g(context);
            }
            if (i11 == AbstractC19182e.abc_btn_colored_material) {
                return m5539i(context);
            }
            if (i11 != AbstractC19182e.abc_spinner_mtrl_am_alpha && i11 != AbstractC19182e.abc_spinner_textfield_background_material) {
                if (m5536f(this.f4631b, i11)) {
                    return AbstractC1199p1.m5682e(context, AbstractC19178a.colorControlNormal);
                }
                if (m5536f(this.f4634e, i11)) {
                    return AbstractC19694b.m103335c(context, AbstractC19180c.abc_tint_default);
                }
                if (m5536f(this.f4635f, i11)) {
                    return AbstractC19694b.m103335c(context, AbstractC19180c.abc_tint_btn_checkable);
                }
                if (i11 == AbstractC19182e.abc_seekbar_thumb_material) {
                    return AbstractC19694b.m103335c(context, AbstractC19180c.abc_tint_seek_thumb);
                }
                return null;
            }
            return AbstractC19694b.m103335c(context, AbstractC19180c.abc_tint_spinner);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0052  */
        @Override // androidx.appcompat.widget.C1181j1.e
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean mo5545c(Context context, int i11, Drawable drawable) {
            PorterDuff.Mode mode;
            int i12;
            int i13;
            boolean z11;
            PorterDuff.Mode mode2 = C1167f.f4627b;
            if (m5536f(this.f4630a, i11)) {
                i12 = AbstractC19178a.colorControlNormal;
            } else if (m5536f(this.f4632c, i11)) {
                i12 = AbstractC19178a.colorControlActivated;
            } else {
                if (m5536f(this.f4633d, i11)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i11 == AbstractC19182e.abc_list_divider_mtrl_alpha) {
                        mode = mode2;
                        z11 = true;
                        i13 = Math.round(40.8f);
                        i12 = R.attr.colorForeground;
                    } else if (i11 != AbstractC19182e.abc_dialog_material_background) {
                        mode = mode2;
                        i12 = 0;
                        i13 = -1;
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                    if (AbstractC1225y0.m5769a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(C1167f.m5529e(AbstractC1199p1.m5680c(context, i12), mode));
                    if (i13 != -1) {
                        drawable.setAlpha(i13);
                    }
                    return true;
                }
                mode = mode2;
                i12 = R.attr.colorBackground;
                i13 = -1;
                z11 = true;
                if (!z11) {
                }
            }
            mode = mode2;
            i13 = -1;
            z11 = true;
            if (!z11) {
            }
        }

        @Override // androidx.appcompat.widget.C1181j1.e
        /* renamed from: d */
        public PorterDuff.Mode mo5546d(int i11) {
            if (i11 == AbstractC19182e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.C1181j1.e
        /* renamed from: e */
        public boolean mo5547e(Context context, int i11, Drawable drawable) {
            if (i11 == AbstractC19182e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m5542l(layerDrawable.findDrawableByLayerId(R.id.background), AbstractC1199p1.m5680c(context, AbstractC19178a.colorControlNormal), C1167f.f4627b);
                m5542l(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), AbstractC1199p1.m5680c(context, AbstractC19178a.colorControlNormal), C1167f.f4627b);
                m5542l(layerDrawable.findDrawableByLayerId(R.id.progress), AbstractC1199p1.m5680c(context, AbstractC19178a.colorControlActivated), C1167f.f4627b);
                return true;
            }
            if (i11 != AbstractC19182e.abc_ratingbar_material && i11 != AbstractC19182e.abc_ratingbar_indicator_material && i11 != AbstractC19182e.abc_ratingbar_small_material) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m5542l(layerDrawable2.findDrawableByLayerId(R.id.background), AbstractC1199p1.m5679b(context, AbstractC19178a.colorControlNormal), C1167f.f4627b);
            m5542l(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), AbstractC1199p1.m5680c(context, AbstractC19178a.colorControlActivated), C1167f.f4627b);
            m5542l(layerDrawable2.findDrawableByLayerId(R.id.progress), AbstractC1199p1.m5680c(context, AbstractC19178a.colorControlActivated), C1167f.f4627b);
            return true;
        }
    }

    /* renamed from: b */
    public static synchronized C1167f m5528b() {
        C1167f c1167f;
        synchronized (C1167f.class) {
            try {
                if (f4628c == null) {
                    m5530h();
                }
                c1167f = f4628c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c1167f;
    }

    /* renamed from: e */
    public static synchronized PorterDuffColorFilter m5529e(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter m5586l;
        synchronized (C1167f.class) {
            m5586l = C1181j1.m5586l(i11, mode);
        }
        return m5586l;
    }

    /* renamed from: h */
    public static synchronized void m5530h() {
        synchronized (C1167f.class) {
            if (f4628c == null) {
                C1167f c1167f = new C1167f();
                f4628c = c1167f;
                c1167f.f4629a = C1181j1.m5584h();
                f4628c.f4629a.m5599u(new a());
            }
        }
    }

    /* renamed from: i */
    public static void m5531i(Drawable drawable, C1205r1 c1205r1, int[] iArr) {
        C1181j1.m5592w(drawable, c1205r1, iArr);
    }

    /* renamed from: c */
    public synchronized Drawable m5532c(Context context, int i11) {
        return this.f4629a.m5593j(context, i11);
    }

    /* renamed from: d */
    public synchronized Drawable m5533d(Context context, int i11, boolean z11) {
        return this.f4629a.m5594k(context, i11, z11);
    }

    /* renamed from: f */
    public synchronized ColorStateList m5534f(Context context, int i11) {
        return this.f4629a.m5595m(context, i11);
    }

    /* renamed from: g */
    public synchronized void m5535g(Context context) {
        this.f4629a.m5597s(context);
    }
}
