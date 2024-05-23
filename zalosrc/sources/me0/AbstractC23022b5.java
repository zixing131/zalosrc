package me0;

import android.content.Context;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import kd0.C21697g;
import l80.C22126c0;

/* renamed from: me0.b5 */
/* loaded from: classes4.dex */
public abstract class AbstractC23022b5 {
    /* renamed from: a */
    public static void m118023a(C21697g c21697g, int i11) {
        if (i11 == AbstractC8915g0.btnType1_big) {
            c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_big_h));
            c21697g.m89087B0(AbstractC16803z.bg_btn_type1_big);
            c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_big_text));
        } else if (i11 == AbstractC8915g0.btnType1_medium) {
            c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_medium_h));
            c21697g.m89087B0(AbstractC16803z.bg_btn_type1_medium);
            c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_medium_text));
        } else if (i11 != AbstractC8915g0.btnType1_medium_standard && i11 != AbstractC8915g0.btnType1_small) {
            if (i11 == AbstractC8915g0.btnType1_xsmall) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_xsmall_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type1_xsmall);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_xsmall_text));
            } else if (i11 == AbstractC8915g0.btnType2_big) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_big_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type2_big);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_big_text));
            } else if (i11 == AbstractC8915g0.btnType2_medium) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type2_medium);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_medium_text));
            } else if (i11 == AbstractC8915g0.btnType2_medium_standard) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_medium_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type2_medium_standard);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_medium_text));
            } else if (i11 == AbstractC8915g0.btnType2_small) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type2_small);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_text));
            } else if (i11 == AbstractC8915g0.btnType2_xsmall) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_xsmall_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type2_xsmall);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_xsmall_text));
            } else if (i11 == AbstractC8915g0.btnType3_big) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_big_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type3_big);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_big_text));
            } else if (i11 == AbstractC8915g0.btnType3_medium) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_medium_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type3_medium);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_medium_text));
            } else if (i11 == AbstractC8915g0.btnType3_small) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type3_small);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_text));
            } else if (i11 == AbstractC8915g0.btnType3_xsmall) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_xsmall_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type3_xsmall);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_xsmall_text));
            } else if (i11 == AbstractC8915g0.btnType5_medium) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_medium_h));
                c21697g.m89087B0(AbstractC16803z.bg_btn_type5_medium);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_medium_text));
            } else if (i11 == AbstractC8915g0.btnCallType1) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.call_btn_style_1));
                c21697g.m89087B0(AbstractC16803z.bg_btn_call_type1);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.call_btn_style_text1));
            } else if (i11 == AbstractC8915g0.btnCallType2) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.call_btn_style_1));
                c21697g.m89087B0(AbstractC16803z.bg_btn_call_type2);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.call_btn_style_text1));
            } else if (i11 == AbstractC8915g0.btnCallType3) {
                c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.call_btn_style_1));
                c21697g.m89087B0(AbstractC16803z.bg_btn_call_type3);
                c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.call_btn_style_text1));
            }
        } else {
            c21697g.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h));
            c21697g.m89087B0(AbstractC16803z.bg_btn_type1_small);
            c21697g.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_text));
        }
        if (i11 != AbstractC8915g0.btnType1_big && i11 != AbstractC8915g0.btnType1_medium && i11 != AbstractC8915g0.btnType1_small && i11 != AbstractC8915g0.btnType1_xsmall) {
            if (i11 != AbstractC8915g0.btnType2_big && i11 != AbstractC8915g0.btnType2_medium && i11 != AbstractC8915g0.btnType2_small && i11 != AbstractC8915g0.btnType2_xsmall) {
                if (i11 != AbstractC8915g0.btnType3_big && i11 != AbstractC8915g0.btnType3_medium && i11 != AbstractC8915g0.btnType3_small && i11 != AbstractC8915g0.btnType3_xsmall) {
                    if (i11 == AbstractC8915g0.btnType5_medium) {
                        c21697g.m111963K1(AbstractC23136l9.m118645D(c21697g.getContext(), AbstractC16803z.bg_btn_type5_text));
                        c21697g.mo111965M1(1);
                        return;
                    } else if (i11 == AbstractC8915g0.btnCallType1) {
                        c21697g.m111963K1(AbstractC23136l9.m118645D(c21697g.getContext(), AbstractC16803z.bg_btn_call_type1_text));
                        return;
                    } else if (i11 == AbstractC8915g0.btnCallType2) {
                        c21697g.m111963K1(AbstractC23136l9.m118645D(c21697g.getContext(), AbstractC16803z.bg_btn_call_type2_text));
                        return;
                    } else {
                        if (i11 == AbstractC8915g0.btnCallType3) {
                            c21697g.m111963K1(AbstractC23136l9.m118645D(c21697g.getContext(), AbstractC16803z.bg_btn_call_type3_text));
                            return;
                        }
                        return;
                    }
                }
                c21697g.m111963K1(AbstractC23136l9.m118645D(c21697g.getContext(), AbstractC16803z.bg_btn_type3_text));
                c21697g.mo111965M1(1);
                return;
            }
            c21697g.m111963K1(AbstractC23136l9.m118645D(c21697g.getContext(), AbstractC16803z.bg_btn_type2_text));
            c21697g.mo111965M1(1);
            return;
        }
        c21697g.m111963K1(AbstractC23136l9.m118645D(c21697g.getContext(), AbstractC16803z.bg_btn_type1_text));
        c21697g.mo111965M1(1);
    }

    /* renamed from: b */
    public static void m118024b(C22126c0 c22126c0) {
        c22126c0.m89106L().m89028L(-2, -2).m89040X(AbstractC23136l9.m118736p(AbstractC16802y.noti_min_width)).m89039W(AbstractC23136l9.m118736p(AbstractC16802y.noti_min_height)).m89042Z(AbstractC23136l9.m118736p(AbstractC16802y.noti_padding_lr), AbstractC23136l9.m118736p(AbstractC16802y.noti_padding_tb), AbstractC23136l9.m118736p(AbstractC16802y.noti_padding_lr), AbstractC23136l9.m118736p(AbstractC16802y.noti_padding_tb)).m89029M(15);
        c22126c0.mo111965M1(1);
        c22126c0.mo111964L1(AbstractC23136l9.m118736p(AbstractC16802y.noti_text_size));
        c22126c0.m111962J1(AbstractC23136l9.m118641B(c22126c0.getContext(), AbstractC16801x.white));
        c22126c0.m89087B0(AbstractC16803z.stencils_bg_number_notif);
    }

    /* renamed from: c */
    public static void m118025c(C22126c0 c22126c0) {
        m118024b(c22126c0);
        c22126c0.m89087B0(AbstractC16803z.stencils_right_menu_item_bg_number_notif);
    }

    /* renamed from: d */
    public static C16716d m118026d(Context context) {
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-1, -2);
        C16719g c16719g = new C16719g(context);
        c16719g.m89106L().m89028L(-1, 1);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        c16719g.mo44614b1(8);
        C16719g c16719g2 = new C16719g(context);
        c16719g2.m89106L().m89028L(-1, AbstractC23136l9.m118655I(AbstractC16802y.section_divider_line)).m89023G(c16719g);
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.SecondaryBackgroundColor));
        C16719g c16719g3 = new C16719g(context);
        c16719g3.m89106L().m89028L(-1, 1).m89023G(c16719g2);
        c16719g3.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        c16719g3.mo44614b1(8);
        c16716d.m89001g1(c16719g);
        c16716d.m89001g1(c16719g2);
        c16716d.m89001g1(c16719g3);
        return c16716d;
    }

    /* renamed from: e */
    public static C16719g m118027e(Context context) {
        C16719g c16719g = new C16719g(context);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        c16719g.m89106L().m89028L(-1, 1);
        return c16719g;
    }

    /* renamed from: f */
    public static void m118028f(C16719g c16719g, int i11) {
        if (c16719g != null) {
            c16719g.mo44614b1(i11);
        }
    }
}
