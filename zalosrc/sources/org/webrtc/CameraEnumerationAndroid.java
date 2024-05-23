package org.webrtc;

import android.graphics.ImageFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes7.dex */
public class CameraEnumerationAndroid {
    private static final String TAG = "CameraEnumerationAndroid";

    /* loaded from: classes7.dex */
    public static class CaptureFormat {
        public final FramerateRange framerate;
        public final int height;
        public final int imageFormat = 17;
        public final int width;

        /* loaded from: classes7.dex */
        public static class FramerateRange {
            public int max;
            public int min;

            public FramerateRange(int i11, int i12) {
                this.min = i11;
                this.max = i12;
            }

            public boolean equals(Object obj) {
                if (!(obj instanceof FramerateRange)) {
                    return false;
                }
                FramerateRange framerateRange = (FramerateRange) obj;
                if (this.min != framerateRange.min || this.max != framerateRange.max) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return (this.min * 65537) + 1 + this.max;
            }

            public String toString() {
                return "[" + (this.min / 1000.0f) + ":" + (this.max / 1000.0f) + "]";
            }
        }

        public CaptureFormat(int i11, int i12, int i13, int i14) {
            this.width = i11;
            this.height = i12;
            this.framerate = new FramerateRange(i13, i14);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CaptureFormat)) {
                return false;
            }
            CaptureFormat captureFormat = (CaptureFormat) obj;
            if (this.width != captureFormat.width || this.height != captureFormat.height || !this.framerate.equals(captureFormat.framerate)) {
                return false;
            }
            return true;
        }

        public int frameSize() {
            return frameSize(this.width, this.height, 17);
        }

        public int hashCode() {
            return (((this.width * 65497) + this.height) * 251) + 1 + this.framerate.hashCode();
        }

        public String toString() {
            return this.width + "x" + this.height + "@" + this.framerate;
        }

        public static int frameSize(int i11, int i12, int i13) {
            if (i13 == 17) {
                return ((i11 * i12) * ImageFormat.getBitsPerPixel(i13)) / 8;
            }
            throw new UnsupportedOperationException("Don't know how to calculate the frame size of non-NV21 image formats.");
        }

        public CaptureFormat(int i11, int i12, FramerateRange framerateRange) {
            this.width = i11;
            this.height = i12;
            this.framerate = framerateRange;
        }
    }

    /* loaded from: classes7.dex */
    private static abstract class ClosestComparator<T> implements Comparator<T> {
        private ClosestComparator() {
        }

        @Override // java.util.Comparator
        public int compare(T t7, T t11) {
            return diff(t7) - diff(t11);
        }

        abstract int diff(T t7);
    }

    public static CaptureFormat.FramerateRange getClosestSupportedFramerateRange(List<CaptureFormat.FramerateRange> list, final int i11) {
        return (CaptureFormat.FramerateRange) Collections.min(list, new ClosestComparator<CaptureFormat.FramerateRange>() { // from class: org.webrtc.CameraEnumerationAndroid.1
            private static final int MAX_FPS_DIFF_THRESHOLD = 5000;
            private static final int MAX_FPS_HIGH_DIFF_WEIGHT = 3;
            private static final int MAX_FPS_LOW_DIFF_WEIGHT = 1;
            private static final int MIN_FPS_HIGH_VALUE_WEIGHT = 4;
            private static final int MIN_FPS_LOW_VALUE_WEIGHT = 1;
            private static final int MIN_FPS_THRESHOLD = 8000;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            private int progressivePenalty(int i12, int i13, int i14, int i15) {
                if (i12 < i13) {
                    return i12 * i14;
                }
                return ((i12 - i13) * i15) + (i14 * i13);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(CaptureFormat.FramerateRange framerateRange) {
                return progressivePenalty(framerateRange.min, MIN_FPS_THRESHOLD, 1, 4) + progressivePenalty(Math.abs((i11 * 1000) - framerateRange.max), 5000, 1, 3);
            }
        });
    }

    public static Size getClosestSupportedSize(List<Size> list, final int i11, final int i12) {
        return (Size) Collections.min(list, new ClosestComparator<Size>() { // from class: org.webrtc.CameraEnumerationAndroid.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // org.webrtc.CameraEnumerationAndroid.ClosestComparator
            public int diff(Size size) {
                return Math.abs(i11 - size.width) + Math.abs(i12 - size.height);
            }
        });
    }

    @Deprecated
    public static String getDeviceName(int i11) {
        new Camera1Enumerator(true);
        return Camera1Enumerator.getDeviceName(i11);
    }
}
