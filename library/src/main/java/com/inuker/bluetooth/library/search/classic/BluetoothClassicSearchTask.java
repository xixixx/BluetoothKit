package com.inuker.bluetooth.library.search.classic;

import com.inuker.bluetooth.library.search.BluetoothSearchTask;
import com.inuker.bluetooth.library.utils.BluetoothConstants;

public class BluetoothClassicSearchTask extends BluetoothSearchTask {

    public BluetoothClassicSearchTask() {
        super(BluetoothConstants.SEARCH_TYPE_CLASSIC);
    }

    public BluetoothClassicSearchTask(int duration) {
        super(BluetoothConstants.SEARCH_TYPE_CLASSIC, duration);
    }
}
