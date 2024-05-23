package com.zing.zalo.zinstant.zom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public class ZinstantTypedef {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Alignment {
        public static final int center = 1;
        public static final int end = 2;
        public static final int start = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface AnimationProperty {
        public static final int all = 0;
        public static final int backgroundColor = 4;
        public static final int height = 2;
        public static final int none = -1;
        public static final int opacity = 3;
        public static final int transform = 5;
        public static final int width = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface AnimationType {
        public static final int fadeIn = 1;
        public static final int none = 0;
        public static final int scaleIn = 2;
        public static final int showImmediately = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface BackgroundRepeat {
        public static final int noRepeat = 0;
        public static final int repeat = 1;
        public static final int repeatX = 2;
        public static final int repeatY = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ClickEffectType {
        public static final int none = 0;
        public static final int overlay = 1;
        public static final int ripple = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Condition {
        public static final int false_ = 0;
        public static final int true_ = 1;
        public static final int undefined = -1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ConditionType {
        public static final int param = 1;
        public static final int unknown = -1;
        public static final int visibility = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface DimensionUnit {
        public static final int auto = 4;

        /* renamed from: dp */
        public static final int f87931dp = 2;
        public static final int percentage = 0;

        /* renamed from: px */
        public static final int f87932px = 1;

        /* renamed from: sp */
        public static final int f87933sp = 3;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface FontWeight {
        public static final int bold = 4;
        public static final int light = 2;
        public static final int medium = 3;
        public static final int normal = 0;
        public static final int thin = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface GradientType {
        public static final int linear = 0;
        public static final int radial = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface HorizontalAlign {
        public static final int alignCenter = 1;
        public static final int alignLeft = 0;
        public static final int alignRight = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ImageFilterAction {
        public static final int blur = 1;
        public static final int brightness = 2;
        public static final int contrast = 3;
        public static final int grayScale = 4;
        public static final int hueRotate = 5;
        public static final int invert = 6;
        public static final int none = 0;
        public static final int opacity = 7;
        public static final int saturate = 8;
        public static final int sepia = 9;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ImageScaleType {
        public static final int scaleAspectFill = 2;
        public static final int scaleAspectFit = 1;
        public static final int scaleToFill = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ImageType {
        public static final int gif = 5;
        public static final int keyframes = 2;
        public static final int lottie = 3;
        public static final int ninepatch = 1;
        public static final int normal = 0;
        public static final int query = 6;
        public static final int webp = 4;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface IndicatorShape {
        public static final int bar = 1;
        public static final int dot = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface InputType {
        public static final int checkbox = 5;
        public static final int email = 1;
        public static final int number = 3;
        public static final int phone = 2;
        public static final int text = 0;
        public static final int url = 4;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface InsightProtocol {
        public static final int http = 0;
        public static final int socket = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface KeyframesDirection {
        public static final int alternate = 2;
        public static final int alternateReverse = 3;
        public static final int normal = 0;
        public static final int reverse = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface KeyframesFillMode {
        public static final int backwards = 2;
        public static final int both = 3;
        public static final int forwards = 1;
        public static final int none = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface KeyframesPlayState {
        public static final int paused = 0;
        public static final int running = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface LayoutType {
        public static final int normal = 0;
        public static final int skeleton = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface LoadingAnimType {
        public static final int DETERMINATE = 1;
        public static final int INDETERMINATE = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface LoadingState {
        public static final int STARTED = 1;
        public static final int STOPPED = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface LoadingVariant {
        public static final int CIRCULAR = 1;
        public static final int DOT = 3;
        public static final int LINEAR = 0;
        public static final int SKELETON = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface PreloadResourceType {
        public static final int font = 5;
        public static final int gif = 8;
        public static final int image = 0;
        public static final int keyframes = 1;
        public static final int lottie = 2;
        public static final int mp3 = 3;
        public static final int script = 6;
        public static final int unknown = -1;
        public static final int video = 4;
        public static final int webp = 7;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ScrollState {
        public static final int IDLE = 1;
        public static final int SCROLL = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface SkeletonLoadingDirection {
        public static final int LEFT = 0;
        public static final int RIGHT = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface SliderHorizontalAlign {
        public static final int center = 1;
        public static final int left = 0;
        public static final int right = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface SliderMode {
        public static final int scroller = 1;
        public static final int sticky = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface SliderScroll {
        public static final int back = 2;
        public static final int next = 1;
        public static final int normal = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface SnapPosition {
        public static final int center = 1;
        public static final int left = 0;
        public static final int right = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface TimingFunction {
        public static final int ease = 1;
        public static final int easeIn = 2;
        public static final int easeInOut = 4;
        public static final int easeOut = 3;
        public static final int linear = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface TimingFunctionJumpTerm {
        public static final int both = 3;
        public static final int end = 2;
        public static final int none = 0;
        public static final int start = 1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Transform {
        public static final int matrix2d = 4;
        public static final int matrix3d = 5;
        public static final int rotate = 2;
        public static final int scale = 1;
        public static final int skew = 3;
        public static final int translate = 0;
        public static final int unknown = -1;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface TransitionType {
        public static final int fade = 1;
        public static final int none = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface VerticalAlign {
        public static final int bottom = 2;
        public static final int middle = 1;
        public static final int top = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface Visibility {
        public static final int gone = 8;
        public static final int invisible = 4;
        public static final int visible = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface YGMeasureMode {
        public static final int atMost = 2;
        public static final int exactly = 1;
        public static final int undefined = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ZINSCSSOverflow {
        public static final int hidden = 1;
        public static final int scroll = 2;
        public static final int visible = 0;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ZINSType {
        public static final int audio = 9;
        public static final int button = 3;
        public static final int flexBox = 4;
        public static final int gif = 6;
        public static final int img = 1;
        public static final int input = 8;

        /* renamed from: p */
        public static final int f87934p = 0;
        public static final int skeleton = 7;
        public static final int slider = 5;
        public static final int unknown = -1;
        public static final int video = 2;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes7.dex */
    public @interface ZinstantFontType {
        public static final int system = 0;
        public static final int zinstant_default = 1;
        public static final int zinstant_external = 2;
    }
}
