package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import bo.C3000l0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.uidrawing.C16716d;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* renamed from: com.zing.zalo.feed.components.r0 */
/* loaded from: classes4.dex */
public abstract class AbstractC8370r0 extends C16716d {

    /* renamed from: M0 */
    protected int f45639M0;

    /* renamed from: N0 */
    protected int f45640N0;

    /* renamed from: O0 */
    protected int f45641O0;

    /* renamed from: P0 */
    protected int f45642P0;

    /* renamed from: Q0 */
    protected int f45643Q0;

    /* renamed from: R0 */
    protected int f45644R0;

    /* renamed from: S0 */
    protected int f45645S0;

    /* renamed from: T0 */
    protected int f45646T0;

    /* renamed from: U0 */
    protected int f45647U0;

    /* renamed from: V0 */
    protected int f45648V0;

    /* renamed from: W0 */
    protected int f45649W0;

    public AbstractC8370r0(Context context) {
        super(context);
        this.f45639M0 = C23212s8.m119607o(context, AbstractC16781w.ProfileLineColor);
        this.f45640N0 = C23212s8.m119607o(context, AbstractC16781w.ProfileLineColor);
        this.f45641O0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_size);
        this.f45642P0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_size_big);
        this.f45643Q0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_marginleft);
        this.f45644R0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_marginleft_big);
        this.f45645S0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_group_dot_margin_line);
        this.f45646T0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile);
        this.f45647U0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile);
        this.f45648V0 = AbstractC23136l9.m118655I(AbstractC16802y.f85293f0);
        this.f45649W0 = AbstractC23136l9.m118655I(AbstractC16802y.f85294f1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o1 */
    public int m44852o1(C3000l0 c3000l0) {
        int i11 = this.f45639M0;
        if (c3000l0 != null && !TextUtils.isEmpty(c3000l0.f11870S)) {
            try {
                return Color.parseColor(c3000l0.f11870S);
            } catch (Exception e11) {
                e11.printStackTrace();
                return i11;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p1 */
    public int m44853p1(C3000l0 c3000l0) {
        int i11 = this.f45640N0;
        if (c3000l0 != null && !TextUtils.isEmpty(c3000l0.f11871T)) {
            try {
                return Color.parseColor(c3000l0.f11871T);
            } catch (Exception e11) {
                e11.printStackTrace();
                return i11;
            }
        }
        return i11;
    }
}
