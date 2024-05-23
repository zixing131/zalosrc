package com.zing.zalo.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.data.mediapicker.model.MediaItem;
import com.zing.zalo.p077ui.widget.RobotoButton;
import com.zing.zalo.story.component.StoryBarBtnAdd;
import com.zing.zalo.story.component.StoryBarFooterLoading;
import com.zing.zalo.story.component.StoryBarFooterRetry;
import com.zing.zalo.story.component.StoryBarStoryItem;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zinstant.zom.node.ZOM;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.CoreUtility;
import java.util.ArrayList;
import java.util.List;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l30.C22052u;
import me0.AbstractC23057e7;
import me0.AbstractC23074g2;
import p348mi.AbstractC23309i;
import p716zh.C31980jc;
import p716zh.C32207za;

/* renamed from: com.zing.zalo.adapters.w8 */
/* loaded from: classes3.dex */
public class C7253w8 extends RecyclerView.AbstractC1880g {

    /* renamed from: t */
    Context f39794t;

    /* renamed from: u */
    AbstractC22055v0.l f39795u;

    /* renamed from: v */
    AbstractC7220t8 f39796v;

    /* renamed from: w */
    C31980jc f39797w;

    /* renamed from: x */
    List f39798x;

    /* renamed from: s */
    int f39793s = 10000;

    /* renamed from: y */
    int f39799y = 1;

    /* renamed from: r */
    private int f39792r = AbstractC22055v0.m115153m();

    /* renamed from: com.zing.zalo.adapters.w8$a */
    /* loaded from: classes3.dex */
    public static class a extends RecyclerView.AbstractC1876c0 implements AbstractC22055v0.j {

        /* renamed from: I */
        public StoryBarBtnAdd f39800I;

        /* renamed from: J */
        public StoryBarStoryItem f39801J;

        /* renamed from: K */
        public StoryBarFooterRetry f39802K;

        /* renamed from: L */
        public StoryBarFooterLoading f39803L;

        /* renamed from: M */
        public View f39804M;

        /* renamed from: N */
        int f39805N;

        public a(View view, int i11, Context context) {
            super(view);
            m37006i0(view, i11, context);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
        @Override // l30.AbstractC22055v0.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int getPopulatePosition() {
            int i11 = this.f39805N;
            switch (i11) {
                case 10:
                case 11:
                case 12:
                    StoryBarBtnAdd storyBarBtnAdd = this.f39800I;
                    if (storyBarBtnAdd != null) {
                        return storyBarBtnAdd.getPopulatePosition();
                    }
                    return 0;
                case 13:
                    StoryBarStoryItem storyBarStoryItem = this.f39801J;
                    if (storyBarStoryItem != null) {
                        return storyBarStoryItem.getPopulatePosition();
                    }
                    return 0;
                default:
                    switch (i11) {
                        case 20:
                        case 21:
                        case 22:
                            break;
                        case 23:
                            break;
                        default:
                            switch (i11) {
                                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                case 31:
                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                    break;
                                case 33:
                                    break;
                                default:
                                    return 0;
                            }
                    }
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
        @Override // l30.AbstractC22055v0.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C16719g getThumbModule() {
            int i11 = this.f39805N;
            switch (i11) {
                case 10:
                case 11:
                case 12:
                    StoryBarBtnAdd storyBarBtnAdd = this.f39800I;
                    if (storyBarBtnAdd != null) {
                        return storyBarBtnAdd.getThumbModule();
                    }
                    return null;
                case 13:
                    StoryBarStoryItem storyBarStoryItem = this.f39801J;
                    if (storyBarStoryItem != null) {
                        return storyBarStoryItem.getThumbModule();
                    }
                    return null;
                default:
                    switch (i11) {
                        case 20:
                        case 21:
                        case 22:
                            break;
                        case 23:
                            break;
                        default:
                            switch (i11) {
                                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                case 31:
                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                    break;
                                case 33:
                                    break;
                                default:
                                    return null;
                            }
                    }
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
        @Override // l30.AbstractC22055v0.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int getThumbRoundCorner() {
            int i11 = this.f39805N;
            switch (i11) {
                case 10:
                case 11:
                case 12:
                    StoryBarBtnAdd storyBarBtnAdd = this.f39800I;
                    if (storyBarBtnAdd != null) {
                        return storyBarBtnAdd.getThumbRoundCorner();
                    }
                    return 0;
                case 13:
                    StoryBarStoryItem storyBarStoryItem = this.f39801J;
                    if (storyBarStoryItem != null) {
                        return storyBarStoryItem.getThumbRoundCorner();
                    }
                    return 0;
                default:
                    switch (i11) {
                        case 20:
                        case 21:
                        case 22:
                            break;
                        case 23:
                            break;
                        default:
                            switch (i11) {
                                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                case 31:
                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                    break;
                                case 33:
                                    break;
                                default:
                                    return 0;
                            }
                    }
            }
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
        @Override // l30.AbstractC22055v0.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public View getThumbView() {
            int i11 = this.f39805N;
            switch (i11) {
                case 10:
                case 11:
                case 12:
                    StoryBarBtnAdd storyBarBtnAdd = this.f39800I;
                    if (storyBarBtnAdd != null) {
                        return storyBarBtnAdd.getThumbView();
                    }
                    return null;
                case 13:
                    StoryBarStoryItem storyBarStoryItem = this.f39801J;
                    if (storyBarStoryItem != null) {
                        return storyBarStoryItem.getThumbView();
                    }
                    return null;
                default:
                    switch (i11) {
                        case 20:
                        case 21:
                        case 22:
                            break;
                        case 23:
                            break;
                        default:
                            switch (i11) {
                                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                case 31:
                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                    break;
                                case 33:
                                    break;
                                default:
                                    return null;
                            }
                    }
            }
        }

        /* renamed from: i0 */
        void m37006i0(View view, int i11, Context context) {
            this.f39805N = i11;
            if (i11 != 6) {
                switch (i11) {
                    case 10:
                    case 11:
                        StoryBarBtnAdd storyBarBtnAdd = (StoryBarBtnAdd) view;
                        this.f39800I = storyBarBtnAdd;
                        storyBarBtnAdd.m56573e(context, 0, false);
                        return;
                    case 12:
                        StoryBarBtnAdd storyBarBtnAdd2 = (StoryBarBtnAdd) view;
                        this.f39800I = storyBarBtnAdd2;
                        storyBarBtnAdd2.m56573e(context, 0, true);
                        return;
                    case 13:
                        StoryBarStoryItem storyBarStoryItem = (StoryBarStoryItem) view;
                        this.f39801J = storyBarStoryItem;
                        storyBarStoryItem.m56592d(context, 0);
                        return;
                    case 14:
                        StoryBarFooterRetry storyBarFooterRetry = (StoryBarFooterRetry) view;
                        this.f39802K = storyBarFooterRetry;
                        storyBarFooterRetry.m56585c(context, 0);
                        return;
                    case 15:
                        StoryBarFooterLoading storyBarFooterLoading = (StoryBarFooterLoading) view;
                        this.f39803L = storyBarFooterLoading;
                        storyBarFooterLoading.m56581b(context, 0);
                        return;
                    default:
                        switch (i11) {
                            case 20:
                            case 21:
                                StoryBarBtnAdd storyBarBtnAdd3 = (StoryBarBtnAdd) view;
                                this.f39800I = storyBarBtnAdd3;
                                storyBarBtnAdd3.m56573e(context, 1, false);
                                return;
                            case 22:
                                StoryBarBtnAdd storyBarBtnAdd4 = (StoryBarBtnAdd) view;
                                this.f39800I = storyBarBtnAdd4;
                                storyBarBtnAdd4.m56573e(context, 1, true);
                                return;
                            case 23:
                                StoryBarStoryItem storyBarStoryItem2 = (StoryBarStoryItem) view;
                                this.f39801J = storyBarStoryItem2;
                                storyBarStoryItem2.m56592d(context, 1);
                                return;
                            case 24:
                                StoryBarFooterRetry storyBarFooterRetry2 = (StoryBarFooterRetry) view;
                                this.f39802K = storyBarFooterRetry2;
                                storyBarFooterRetry2.m56585c(context, 1);
                                return;
                            case 25:
                                StoryBarFooterLoading storyBarFooterLoading2 = (StoryBarFooterLoading) view;
                                this.f39803L = storyBarFooterLoading2;
                                storyBarFooterLoading2.m56581b(context, 1);
                                return;
                            default:
                                switch (i11) {
                                    case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                    case 31:
                                        StoryBarBtnAdd storyBarBtnAdd5 = (StoryBarBtnAdd) view;
                                        this.f39800I = storyBarBtnAdd5;
                                        storyBarBtnAdd5.m56573e(context, 2, false);
                                        return;
                                    case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                        StoryBarBtnAdd storyBarBtnAdd6 = (StoryBarBtnAdd) view;
                                        this.f39800I = storyBarBtnAdd6;
                                        storyBarBtnAdd6.m56573e(context, 2, true);
                                        return;
                                    case 33:
                                        StoryBarStoryItem storyBarStoryItem3 = (StoryBarStoryItem) view;
                                        this.f39801J = storyBarStoryItem3;
                                        storyBarStoryItem3.m56592d(context, 2);
                                        return;
                                    case 34:
                                        StoryBarFooterRetry storyBarFooterRetry3 = (StoryBarFooterRetry) view;
                                        this.f39802K = storyBarFooterRetry3;
                                        storyBarFooterRetry3.m56585c(context, 2);
                                        return;
                                    case 35:
                                        StoryBarFooterLoading storyBarFooterLoading3 = (StoryBarFooterLoading) view;
                                        this.f39803L = storyBarFooterLoading3;
                                        storyBarFooterLoading3.m56581b(context, 2);
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
            }
            this.f39804M = view.findViewWithTag("CHANGE SHAPE");
        }
    }

    public C7253w8(Context context, AbstractC22055v0.l lVar, AbstractC7220t8 abstractC7220t8) {
        this.f39794t = context;
        this.f39795u = lVar;
        this.f39796v = abstractC7220t8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m36993P(View view) {
        int i11 = (this.f39792r + 1) % 3;
        this.f39792r = i11;
        AbstractC23309i.m121384Ri(i11);
        AbstractC22055v0.m115147g();
        AbstractC23074g2.m118378d();
    }

    /* renamed from: M */
    public C31980jc m36994M() {
        return this.f39797w;
    }

    /* renamed from: N */
    public int m36995N(int i11) {
        int i12 = this.f39792r;
        if (i12 == 0) {
            if (i11 == 0) {
                return 10;
            }
            if (i11 == 1) {
                return 11;
            }
            if (i11 == 2) {
                return 12;
            }
            if (i11 == 3) {
                return 13;
            }
            if (i11 != 4) {
                return i11 != 5 ? -1 : 15;
            }
            return 14;
        }
        if (i12 == 1) {
            if (i11 == 0) {
                return 20;
            }
            if (i11 == 1) {
                return 21;
            }
            if (i11 == 2) {
                return 22;
            }
            if (i11 == 3) {
                return 23;
            }
            if (i11 != 4) {
                return i11 != 5 ? -1 : 25;
            }
            return 24;
        }
        if (i12 != 2) {
            return -1;
        }
        if (i11 == 0) {
            return 30;
        }
        if (i11 == 1) {
            return 31;
        }
        if (i11 == 2) {
            return 32;
        }
        if (i11 == 3) {
            return 33;
        }
        if (i11 != 4) {
            return i11 != 5 ? -1 : 35;
        }
        return 34;
    }

    /* renamed from: O */
    public int m36996O(C31980jc c31980jc) {
        int i11 = 0;
        while (true) {
            if (i11 < this.f39798x.size()) {
                if (this.f39798x.get(i11) == c31980jc) {
                    break;
                }
                i11++;
            } else {
                i11 = -1;
                break;
            }
        }
        if (i11 >= 0) {
            return i11 + this.f39799y;
        }
        return i11;
    }

    /* renamed from: Q */
    public void m36997Q() {
        m37005Y();
        m10008p();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0011 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:2:0x0000, B:4:0x0007, B:5:0x000a, B:6:0x000d, B:12:0x0011, B:13:0x0019, B:14:0x0021, B:15:0x0036, B:16:0x0041, B:17:0x004c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0019 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:2:0x0000, B:4:0x0007, B:5:0x000a, B:6:0x000d, B:12:0x0011, B:13:0x0019, B:14:0x0021, B:15:0x0036, B:16:0x0041, B:17:0x004c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0021 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:2:0x0000, B:4:0x0007, B:5:0x000a, B:6:0x000d, B:12:0x0011, B:13:0x0019, B:14:0x0021, B:15:0x0036, B:16:0x0041, B:17:0x004c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:2:0x0000, B:4:0x0007, B:5:0x000a, B:6:0x000d, B:12:0x0011, B:13:0x0019, B:14:0x0021, B:15:0x0036, B:16:0x0041, B:17:0x004c), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:2:0x0000, B:4:0x0007, B:5:0x000a, B:6:0x000d, B:12:0x0011, B:13:0x0019, B:14:0x0021, B:15:0x0036, B:16:0x0041, B:17:0x004c), top: B:1:0x0000 }] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9990A(a aVar, int i11) {
        try {
            int mo10005m = mo10005m(i11);
            if (mo10005m != 6) {
                switch (mo10005m) {
                    case 10:
                    case 11:
                        aVar.f39800I.m56572d(this.f39796v, this.f39795u, false);
                        break;
                    case 12:
                        aVar.f39800I.m56572d(this.f39796v, this.f39795u, true);
                        break;
                    case 13:
                        aVar.f39801J.m56591c((C31980jc) this.f39798x.get(i11 - this.f39799y), this.f39797w, this.f39795u);
                        break;
                    case 14:
                        aVar.f39802K.m56584b(this.f39796v);
                        break;
                    case 15:
                        aVar.f39803L.m56580a();
                        break;
                    default:
                        switch (mo10005m) {
                            case 20:
                            case 21:
                                break;
                            case 22:
                                break;
                            case 23:
                                break;
                            case 24:
                                break;
                            case 25:
                                break;
                            default:
                                switch (mo10005m) {
                                }
                        }
                }
            } else {
                aVar.f39804M.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.adapters.v8
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C7253w8.this.m36993P(view);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a mo9992C(ViewGroup viewGroup, int i11) {
        ViewGroup relativeLayout;
        if (i11 != 6) {
            switch (i11) {
                case 10:
                case 11:
                case 12:
                    relativeLayout = new StoryBarBtnAdd(this.f39794t);
                    break;
                case 13:
                    relativeLayout = new StoryBarStoryItem(this.f39794t);
                    break;
                case 14:
                    relativeLayout = new StoryBarFooterRetry(this.f39794t);
                    break;
                case 15:
                    relativeLayout = new StoryBarFooterLoading(this.f39794t);
                    break;
                default:
                    switch (i11) {
                        case 20:
                        case 21:
                        case 22:
                            break;
                        case 23:
                            break;
                        case 24:
                            break;
                        case 25:
                            break;
                        default:
                            switch (i11) {
                                case ZVideoUtilMetadata.FF_PROFILE_H264_LEVEL_30 /* 30 */:
                                case 31:
                                case ZOM.FLAG_RELATIVE_VISIBILITY_CHANGED /* 32 */:
                                    break;
                                case 33:
                                    break;
                                case 34:
                                    break;
                                case 35:
                                    break;
                                default:
                                    relativeLayout = null;
                                    break;
                            }
                    }
            }
        } else {
            relativeLayout = new RelativeLayout(this.f39794t);
            RobotoButton robotoButton = new RobotoButton(this.f39794t);
            robotoButton.setText("CHANGE SHAPE");
            robotoButton.setTag("CHANGE SHAPE");
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            relativeLayout.addView(robotoButton, layoutParams);
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        return new a(relativeLayout, i11, this.f39794t);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public void mo9995F(a aVar) {
        StoryBarBtnAdd storyBarBtnAdd = aVar.f39800I;
        if (storyBarBtnAdd != null) {
            storyBarBtnAdd.m56572d(this.f39796v, this.f39795u, false);
        }
    }

    /* renamed from: U */
    public void m37001U(int i11) {
        if (i11 != 10000 && i11 != 10001 && i11 != 10002) {
            throw new IllegalArgumentException("Invalid footer type");
        }
        if (this.f39793s != i11) {
            this.f39793s = i11;
            m10008p();
        }
    }

    /* renamed from: V */
    public void m37002V(List list) {
        List list2 = this.f39798x;
        if (list2 == null) {
            this.f39798x = new ArrayList();
        } else {
            list2.clear();
        }
        if (list != null) {
            this.f39798x.addAll(new ArrayList(list));
        }
        m36997Q();
    }

    /* renamed from: W */
    public void m37003W(C31980jc c31980jc) {
        this.f39797w = c31980jc;
    }

    /* renamed from: X */
    public void m37004X() {
        m10009q(0);
    }

    /* renamed from: Y */
    void m37005Y() {
        if (this.f39798x == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f39798x.size(); i11++) {
            C31980jc c31980jc = (C31980jc) this.f39798x.get(i11);
            if (TextUtils.equals(CoreUtility.f89233i, c31980jc.f147023p)) {
                C22052u.m115085y().m115100t(c31980jc);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        int size = this.f39799y + this.f39798x.size();
        int i11 = this.f39793s;
        if (i11 == 10001 || i11 == 10002) {
            return size + 1;
        }
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: l */
    public long mo10004l(int i11) {
        try {
            int i12 = this.f39799y;
            if (i11 - i12 >= 0 && i11 - i12 < this.f39798x.size()) {
                return Long.parseLong(((C31980jc) this.f39798x.get(i11 - this.f39799y)).f147023p);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        int i12;
        boolean z11;
        if (i11 == 0) {
            MediaItem m155310c = C32207za.m155306b().m155310c();
            if (m155310c != null && !TextUtils.isEmpty(m155310c.mo41081Q())) {
                z11 = true;
            } else {
                z11 = false;
            }
            List list = this.f39798x;
            if ((list == null || list.size() == 0) && C22013a0.m114924c().f108394j != null && !z11) {
                return m36995N(2);
            }
            C31980jc m115161u = AbstractC22055v0.m115161u(CoreUtility.f89233i);
            if ((m115161u == null || m115161u.m153831x() || C22013a0.m114924c().f108385a == 1) && AbstractC23057e7.m118302i()) {
                return m36995N(1);
            }
            return m36995N(0);
        }
        if (i11 == this.f39798x.size() + this.f39799y && (i12 = this.f39793s) != 10000) {
            if (i12 == 10001) {
                return m36995N(4);
            }
            return m36995N(5);
        }
        return m36995N(3);
    }
}
