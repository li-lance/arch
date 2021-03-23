package com.fate.arch

import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

abstract class CoreFragment(@LayoutRes layoutRes: Int) : Fragment(layoutRes) {
  fun toPage(@IdRes id: Int) {
    findNavController().navigate(id)
  }
}
